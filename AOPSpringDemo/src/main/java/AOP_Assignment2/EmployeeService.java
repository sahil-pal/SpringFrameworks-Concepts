package AOP_Assignment2;

import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("empService")
public class EmployeeService {

	@Autowired
	Employee tempEmp;

	// method to add employee
	public void addEmployee(HashMap<Long,Employee> emplist,long id,String fname,String lname,String email ) {
		tempEmp = new Employee(id,fname,lname,email);
		emplist.put(id,tempEmp);
	}
	
	// method to update employee
	public void updateEmployee(HashMap<Long,Employee> emplist,long id,String fname,String lname,String email ) {
		Employee temp = new Employee(id,fname,lname,email);
		emplist.put(id,temp);
	}
	
	// method to remove employee
	public void deleteEmployee(HashMap<Long,Employee> emplist,long id) {
		emplist.remove(id);
	}
	
	// method to get Employee using employee id
	public String getEmployeeWithID(HashMap<Long,Employee> emplist, long id) throws Exception {
		boolean check = false;
		String empdetails = "";
		
		for(long identity : emplist.keySet()) {
			if(identity == id) {
				check = true;
				empdetails = emplist.values().toString();
			}
		}
		
		if(check == true) {
			return empdetails;
		}
		else {
			String msg= "Sorry, no employee found in this organization with this id";
			throw(new Exception(msg));
		}
	}
	
	
	
	public Employee getTempEmp() {
		return tempEmp;
	}

	public void setTempEmp(Employee tempEmp) {
		this.tempEmp = tempEmp;
	}
}
