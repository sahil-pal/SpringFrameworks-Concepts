package AOP_Assignment2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Before("execution(public void addEmployee(..))")
	public void beforeAddEmp() {
		System.out.println();
		System.out.println("--> This is the Aspect before the Add employee method call");
	}
	
	@Before("execution(public void updateEmployee(..))")
	public void beforeUpdateEmp() {
		System.out.println();
		System.out.println("--> This is the Aspect before the Update employee method call");
	}
	
	@Before("execution(public void deleteEmployee(..))")
	public void beforeDeleteEmp() {
		System.out.println();
		System.out.println("--> This is the Aspect before the Delete employee method call");
	}

	@AfterThrowing(pointcut = "execution(public void getEmployeeWithID())", throwing = "ex")
	public void afterThrowingAdvice(Exception ex){
		 System.out.println();  
		 System.out.println("-->Exception thrown with message");  
	}
	
}
