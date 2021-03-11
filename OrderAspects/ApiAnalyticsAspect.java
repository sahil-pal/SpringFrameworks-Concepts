package OrderAspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Order(3)
@Component
public class ApiAnalyticsAspect {
	
	@Before("execution(public void addAccount())")
	public void beforeAddAccount() {
		System.out.println("--> This is Api Analytics Aspect , order = 3 (Before)");
	}
	
	@After("execution(public void addAccount())")
	public void afterAddAccount() {
		System.out.println("--> This is Api Analytics Aspect , order = 3 (After)");
	}
	
}