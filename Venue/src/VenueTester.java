import java.util.Random;
public class VenueTester {

public static void main(String[] args) {
int sections = 4;
int rows = 5;
int seats = 10;

Random generator = new Random(sections-1);
Venue1 PrudentialCenter = new Venue1(sections,rows,seats);
for(int i = 0; i < 100; i++) {
int a = generator.nextInt(sections);
int b = generator.nextInt(rows);
int c = generator.nextInt(seats);


if(PrudentialCenter.seatlookup(a, b, c)==true) {
	System.out.println("Section: " + a +", Row: "+ b +", Seat: "+ c + " is taken");
	}
else {
	System.out.println("Section: " + a +", Row: "+ b +", Seat: "+ c + " is awarded");
	}


							}

PrudentialCenter.seatlookup(1, 2, 4);
		}

	}
