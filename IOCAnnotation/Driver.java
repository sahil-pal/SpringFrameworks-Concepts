package IOCAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

	
public class Driver 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring_IOCAnnotation.xml");
    	
    	CricketCoach cricket=(CricketCoach) context.getBean("ccoach");
    	System.out.println(cricket.getDailyWorkout());
    	System.out.println(cricket.getDailyFortune());
    	
    	FootballCoach football=(FootballCoach) context.getBean("fcoach");
    	System.out.println(football.getDailyWorkout());
    	System.out.println(football.getDailyFortune());
    	
    	
    }
}