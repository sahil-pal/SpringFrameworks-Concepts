package AutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_AutoWiring.xml");
							
		Employee e1 = (Employee) context.getBean("employee");
		System.out.println(e1.toString());
		
	}

}
