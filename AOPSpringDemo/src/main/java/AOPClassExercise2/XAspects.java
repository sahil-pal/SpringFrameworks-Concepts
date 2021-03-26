package AOPClassExercise2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class XAspects {

	@Pointcut("execution (public void logic*())")
	private void forClassX() {}
	
	
	@Before("forClassX()")
	public void beforeXlogic() {
		System.out.println("--> This is the Aspect before the Logic X");
		System.out.println();
	}
	
	@After("forClassX()")
	public void AfterXlogic() {
		System.out.println();
		System.out.println("--> This is the Aspect After the Logic X");
	}
}
