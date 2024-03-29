package OrderAspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(2)
@Component
public class LoggingAspect {
	
	@Before("execution(public void addAccount())")
	public void beforeAddAccount() {
		System.out.println("--> This is Logging Aspect , order = 2 (Before)");
	}
	
	
	@After("execution(public void addAccount())")
	public void afterAddAccount() {
		System.out.println("--> This is Logging Aspect , order = 2 (After)");		
	}
	
}