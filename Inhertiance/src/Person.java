

public class Person {

	String inName;

	int birth;

	public Person(String name, int year) {

		this.inName = name;
		this.birth = year;
		
	}

	   public String toString()

	   {

	      return "Person[name=" + inName + ",birth=" + birth + "]";

	   }
	   
}
