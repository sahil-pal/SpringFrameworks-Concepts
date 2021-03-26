package AOPClassExercise2;

import org.springframework.stereotype.Component;

@Component("objX")
public class X {

	public void logic1() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("X Logic I is : "+i);
		}
	}
	
	public void logic2() {
		for(int i = 10; i >= 0; i--) {
			System.out.println("X Logic II is : "+i);
		}
	}
}
