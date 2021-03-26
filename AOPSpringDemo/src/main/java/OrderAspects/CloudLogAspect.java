package OrderAspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(1)
@Component
public class CloudLogAspect {
	
	
	@Before("execution(public void addAccount())")
	public void beforeAddAccount() {
		System.out.println("--> This is Cloud log Aspect , order = 1 (Before)");
	}
	
	@After("execution(public void addAccount())")
	public void afterAddAccount() {
		System.out.println("--> This is Cloud log Aspect , order = 1 (After)");
	}
	
}