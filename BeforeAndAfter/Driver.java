package BeforeAndAfter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main( String[] args ) {
    	
				
    			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    			
    			
    			AccountDao theAccountDao=context.getBean("accountDao",AccountDao.class);
    			
    			// call the business method
    			theAccountDao.addAccount();

    			// do it again!
    			System.out.println("\nlet's call it again!\n");
    			
    			// call the business method again
    			theAccountDao.addAccount();
    					
    			// close the context
    			context.close();
    }
}
