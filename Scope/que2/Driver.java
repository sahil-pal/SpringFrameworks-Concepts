package Scope.que2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String args[]) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("spring_scope2.xml");	
	
	A a1 = (A)context.getBean("objectA");
	A a2 = (A)context.getBean("objectA");
	System.out.println(a1.display()+"  "+a1+" and "+a2);
	
	}
}
