package IOCAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ccoach")
public class CricketCoach implements ICoach{
	
	private IFortune ifortune;

	@Autowired
	public CricketCoach(IFortune ifortune) {
		System.out.println("Cricket Coach constructor");
		this.ifortune=ifortune;
	}
	
	public String getDailyWorkout() {
		return "do catching practice today";
	}

    @Override
	public String getDailyFortune() {
	return ifortune.getFortune();
	}
}