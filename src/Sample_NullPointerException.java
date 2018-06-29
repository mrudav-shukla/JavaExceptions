import java.util.ArrayList;
import java.util.List;

public class Sample_NullPointerException {

	public static void main(String[] args) {
		
		Person personObj = null;
		
		try {
			String name = personObj.personName; // Accessing the field of a null object
			personObj.personName = "Jon Doe"; // Modifying the field of a null object
		} catch (NullPointerException e) {
			System.out.println("NullPointerException caught!");
		}
		
	}

}

class Person {

	public String personName;

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
}