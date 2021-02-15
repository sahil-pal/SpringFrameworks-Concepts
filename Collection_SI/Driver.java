package Collection_SI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String args[]) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("spring_Collection_SI.xml");	
	
	customer c1 = (customer)context.getBean("custom");
	System.out.println(c1);
	
	}
}
