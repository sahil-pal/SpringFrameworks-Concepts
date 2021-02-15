package beanLifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myApp {
	public static void main(String args[]) {
		
		//load the spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_beanLifeCycle.xml");
		
		System.out.println("Inside bean factory...");
		
		// retrieve bean/object from spring container
		Icoach c1 = (Icoach) context.getBean("footballCoach");
	
		// call the methods
		System.out.println();
		//System.out.println(c1);
		System.out.println();
		
		// closing the resources
		((ClassPathXmlApplicationContext) context).close();
		
		
		
	}
}
