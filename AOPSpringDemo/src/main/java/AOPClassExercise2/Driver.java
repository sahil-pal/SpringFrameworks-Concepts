package AOPClassExercise2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import AOPClassExercise1.Employee;

public class Driver {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		X objx = (X) context.getBean("objX");
		
		// calling the methods
		objx.logic1();
		System.out.println();
		objx.logic2();

	}

}
