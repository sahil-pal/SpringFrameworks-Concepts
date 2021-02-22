package JavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Vehicle veh1 = context.getBean("Obj1",Car.class);
	    Vehicle veh2 = context.getBean("Obj2",Bike.class);
		
		System.out.println(veh1.getType());
		System.out.println(veh2.getType());
	}

}
