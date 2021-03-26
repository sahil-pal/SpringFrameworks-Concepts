package AOPClassExercise1;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeAspect {
	

	@Before("execution(public String getEmployee_name())")
	public void beforegetName() {
		System.out.println();
		System.out.println("--> This is the Aspect before the get Employee name call");
	}
	
	@After("execution(public void setEmployee_name(String))")
	public void AftersetName() {
		System.out.println();
		System.out.println("--> This is the Aspect after the set Employee name call");
	}
	
	@Around("execution(public void calcSalary())")
	public void AroundcalcSalary() {
		System.out.println();
		System.out.println("--> This the Aspect around the calculate salary method.");
	}
}
