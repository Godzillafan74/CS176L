
public class PersonTester {

	public static void main(String[] args)

	{

		Person p1 = new Person("Elias", 1990);

		Person p2 = new Person("Samuel", 1973);

		Person i1 = new Instructor("Heather", 45000.00, "Heather", 1987);

		Person s1 = new Student("Rachel", "Astrologer", "Rachel", 1993);

		Person s2 = new Student("Jace", "IT Technician", "Jace", 1986);

		System.out.println(p1);

		System.out.println("Expected: Person[name=Elias,birth=1990]");

		System.out.println(p2);

		System.out.println("Expected: Person[name=Samuel,birth=1973]");

		System.out.println(s1);

		System.out.println("Expected: Student[super=Person[name=Rachel,birth=1993],major=Astrologer]");

		System.out.println(s2);

		System.out.println("Expected: Student[super=Person[name=Jace,birth=1986],major=IT Technician]");

		System.out.println(i1);

		System.out.println("Expected: Instructor[super=Person[name=Heather,birth=1987],salary=45000.00]");

	}

}
