
public class Student extends Person {

	String student;
	
	String collegeMajor;

	Student(String student, String major, String inName, int birth) {
	
	super (inName, birth);

	this.collegeMajor = major;

	}
	   public String toString()

	   {

	      return "Student[super=" + super.toString() + ",major=" + collegeMajor + "]";

	   }
	   
}
