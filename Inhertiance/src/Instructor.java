
public class Instructor extends Person {

	String instructor;
	double income;
	
	Instructor (String instructor, double salary, String inName, int birth) {
		super(inName, birth);

		this.income = salary;
}
	   public String toString()

	   {

	      return "Instructor[super=" + super.toString() + ",salary=" + income + "]";

	   }

}
