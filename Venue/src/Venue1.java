public class Venue1 {
private boolean[][][] allseats;

public Venue1(int sections, int rows, int seats) {
allseats = new boolean[sections] [rows] [seats];
for(int x = 0; x < sections; x++) {
for(int y = 0; y < rows; y++) {
for(int z = 0; z < seats; z++) {
allseats[x][y][z] = false;

		}
		}
		}
		}

public boolean  seatlookup(int sections, int rows, int seats) {
	if(allseats[sections][rows][seats] == false) {
		allseats[sections][rows][seats]=true;
		return true;
		}
	else {
		System.out.print("Seat Open ");
		return false;
		}
	}
}
