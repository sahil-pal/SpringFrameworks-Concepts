package MiniProject;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_MiniProject.xml");
		
		LoanProcessing lp = (LoanProcessing) context.getBean("loanprocessing");
		Customer user = (Customer) context.getBean("user");
		
		Scanner sc = new Scanner(System.in);
		
		boolean terminate = false;
		
		while(terminate!=true) {
			System.out.println(" ------------------------------------------------");
			System.out.println("|            LOAN ORGANIZATION SYSTEM            |");
			System.out.println("|------------------------------------------------|");
			System.out.println("| [1] --> New Applicant                          |");
			System.out.println("| [2] --> Already Applied...Check Status here    |");
			System.out.println("|                                                |");
			System.out.println(" ------------------------------------------------");
			System.out.println();
			
			int choice1 = sc.nextInt();
			
			switch(choice1) {
			
				case 1 : lp.source(user);
						 lp.MoveToNextStage(user);
						 break;
					
				case 2 : System.out.println("");
						 System.out.println(" ------------------------------------------------");
						 System.out.println("|  Enter your 9-digit Application Number :       |");
				         System.out.println("|                                                |");
				         System.out.println(" ------------------------------------------------");
				         String applinum = sc.next();
					
				         lp.StageCheck(user, applinum);
				         break;
						 
				default : System.out.println("Invalid Entry. RE-Enter the choice ...");
						  break;
			}
			
			System.out.println();
			System.out.println();
			System.out.println("------------------------------------------------");
			System.out.println("            LOAN ORGANIZATION SYSTEM");
			System.out.println("------------------------------------------------");
			System.out.println("  [1]       --> To continue... ");
			System.out.println("  [Any Key] --> To exit...");
			System.out.println();
			System.out.println("------------------------------------------------");
			
			int choice3 = sc.nextInt();
			
			if(choice3 == 1) {
				
			}
			else {
				terminate = true;
			}
		}
		

		

	}

	

}
