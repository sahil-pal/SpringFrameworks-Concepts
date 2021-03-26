package BeforeAndAfter;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	@Before("execution(public void addAccount())")
	public void beforeAddAccount() {
		
		System.out.println("\n=====>>> Executing @Before advice on addAccount()");
		
	}
	
	@After("execution(public void addAccount())")
	public void afterAddAccount() {
		
		System.out.println("\n=====>>> Executing @After advice on addAccount()");
		
	}
	
	
}