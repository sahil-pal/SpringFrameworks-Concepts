package AOP_Assignment2;

import java.util.HashMap;
import java.util.Scanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) throws Exception {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		// creating a employee list using a HashMap 
		// As Id of the employee will be unique
		HashMap<Long,Employee> employeeList = new HashMap<Long,Employee>();
		
		// creating the object of Employee Service class
		EmployeeService empService = (EmployeeService) context.getBean("empService",EmployeeService.class);
		
		boolean terminate = false;
		
		Scanner sc = new Scanner(System.in);
		
		while(!terminate) {
			System.out.println("------------ Employee Service ------------");
			System.out.println("Press [1] --> To Add employee");
			System.out.println("Press [2] --> To Update employee");
			System.out.println("Press [3] --> To Delete employee");
			System.out.println("Press [4] --> To get Employee details");
			System.out.println("------------------------------------------");
			System.out.println();
			
			int choice = sc.nextInt();
			System.out.println();
			
			switch(choice) {
			
			case 1 : {
						// enter the fields from user
					  	System.out.println("Enter Employee id : ");
					  	long id = sc.nextLong();
					  	System.out.println("Enter Employee first name : ");
					  	String fname = sc.next();
					  	System.out.println("Enter Employee last name : ");
					  	String lname = sc.next();
					  	System.out.println("Enter Employee e-mail id : ");
					  	String email = sc.next();
					  	// call service class's add employee method
					  	empService.addEmployee(employeeList, id, fname, lname, email);
					  	
					  	break;
			         }
			
			case 2 : {
						// enter the fields from user
				     	System.out.println("Enter Employee id to be updated : ");
				     	long id = sc.nextLong();
				     	System.out.println("Enter Employee first name : ");
				     	String fname = sc.next();
				     	System.out.println("Enter Employee last name : ");
				     	String lname = sc.next();
				     	System.out.println("Enter Employee e-mail id : ");
				     	String email = sc.next();
				     	// call service class's update employee method
				     	empService.updateEmployee(employeeList, id, fname, lname, email);
				     	
				     	break;
	                 }
			
			case 3 : {
						// enter the fields from user
					 	System.out.println("Enter id of the employee to be deleted : ");
					 	long id = sc.nextLong();
					 	// call service class's delete employee method
					 	empService.deleteEmployee(employeeList, id);
					 	
					 	break;
					 }
			
			case 4 : {
						// enter the fields from user
			 			System.out.println("Enter id of the employee to be searched in records : ");
			 			long id = sc.nextLong();
			 			// call service class's delete employee method
			 			System.out.println(empService.getEmployeeWithID(employeeList, id));
			 			
			 			break;
					 }
			
			default : {
						System.out.println("Please, Enter a valid choice.");
						break;
					  }
			         
			}
			
			System.out.println("------------ Employee Service ------------");
			System.out.println("Press [1] --> To Continue ");
			System.out.println("Press [0] --> To Exit...");
			System.out.println("------------------------------------------");
			System.out.println();
			int n = sc.nextInt();
			
			if(n != 1) {
				terminate = true;
			}
			else {
				terminate = false;
			}
		}
		
	}	
}
