package AOPClassExercise1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("empl")
public class Employee {

	// class variables
	String employee_name="sahil_pal";
	int age=20;
	int working_days=30;
	Address address;
	
	// getters and setters
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWorking_days() {
		return working_days;
	}
	public void setWorking_days(int working_days) {
		this.working_days = working_days;
	}
	
	public Address getAddress() {
		return address;
	}
	
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	
	// method to calculate the salary
	public void calcSalary() {
		int salary = age * 2000 *  working_days;
	}
	
	
	
}
