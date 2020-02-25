
public class Person {
	private String name;
	private String gender; 
	private int height; 
	private int weight;
	private int age;
	
	public Person(String a, String b, int c, int d, int e) {
		name = a;
		gender = b;
		height = c;
		weight = d;
		age = e;
	}
	
	public String getname() {
		
		return name;
	}
	
	public String getgender() {
		
		return gender;
	}
	
	public int getheight() {
		
		return height;
	}
	
	public int getweight() {
		
		return weight;
	}
	
	public int getage() {
		
		return age;
	}
}
