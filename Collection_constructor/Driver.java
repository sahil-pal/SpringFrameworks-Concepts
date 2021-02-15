package Collection_constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String args[]) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("spring_Collection_Constructor.xml");	
	
	customer c1 = (customer)context.getBean("custom");
	System.out.println(c1);
	
	}
}
