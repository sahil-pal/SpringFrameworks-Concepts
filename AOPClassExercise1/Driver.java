package AOPClassExercise1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import AOPClassExercise1.Employee;

public class Driver {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Employee emp = (Employee) context.getBean("empl",Employee.class);
		
		// calling the methods
		emp.setEmployee_name("sahil_pal");
		System.out.println();
		System.out.println("Employee name is :"+emp.getEmployee_name());
		System.out.println();
		emp.calcSalary();

	}

}
