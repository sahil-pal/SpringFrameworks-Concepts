package OrderAspects;

import org.springframework.stereotype.Component;

@Component("accountDao")
public class AccountDao {

		public void addAccount() {
			System.out.println();
			System.out.println("==> Inside the add account method (target)");
			System.out.println();
		}
		
	
}
