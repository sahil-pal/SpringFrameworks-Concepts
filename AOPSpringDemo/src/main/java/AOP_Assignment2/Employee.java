package AOP_Assignment2;

import org.springframework.stereotype.Component;

@Component()
public class Employee {

	// class variables
	private long id;
	private String firstName;
	private String lastName;
	private String emailID;
	
	
	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName +
				", emailID=" + emailID+ "]";
	}

	// parameterized constructor
	public Employee(long id, String firstName, String lastName, String emailID) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
	}
	
	// default constructor
	public Employee() {
		id = 78383055;
		firstName = "Rahul";
		lastName = "Sharma";
		emailID = "rahul07@gmail.com";
		
	}
	
	
	
}
