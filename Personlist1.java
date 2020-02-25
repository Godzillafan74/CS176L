
public class Personlist1 {

	private Person[] persons;
	private int num = 0;
	
	public Personlist1(int capacity) {
		
		persons = new Person[capacity];
	}
	
	public void addPeople() {
		
		String a = "Elias";
		String b = "C";
		int c = 96;
		int d = 136;
		int e = 20;
		
		Person Elias = new Person(a, b, c, d, e);
		persons[num] = Elias;
		
		a = "Ethan";
		b = "R";
		c = 106;
		d = 134;
		e = 20;
		
		Person Ethan = new Person(a, b, c, d, e);
		persons[num] = Ethan;
		
		a = "Anthony";
		b = "M";
		c = 109;
		d = 148;
		e = 19;
		Person Anthony = new Person(a, b, c, d, e);
		persons[num]  = Anthony;
		
		a = "Ains";
		b = "G";
		c = 167;
		d = 153;
		e = 87;
		Person Ains = new Person(a, b, c, d, e);
		persons[num] = Ains;
		
		a = "Yamcha";
		b = "B";
		c = 147;
		d = 139;
		e = 34;
		Person Yamcha = new Person(a, b, c, d, e);
		persons[num] = Yamcha;
		
	}
	
	public double returntallest() {
		
		double tallest = 0;
		int count = 0;
		for(Person x :persons) {
			if (x.getheight()>tallest) {
				tallest = x.getheight();
			}
			
			count = count++;
			if (count>num) {
				break;
			}
		}
		return tallest;
	}
}
