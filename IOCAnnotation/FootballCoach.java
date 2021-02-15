package IOCAnnotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("fcoach")
public class FootballCoach {
	
	private IFortune ifortune;
	public FootballCoach() {
		System.out.println("Football Coach constructor");
	}
	
	public IFortune getIfortune() {
		return ifortune;
	}
	
	@Autowired
	public void setFootballFortune(IFortune ifortune) {
		System.out.println("");
		this.ifortune=ifortune;
	}
	
	public String getDailyWorkout() {
		return "do dribbling today";
	}
	
	
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return ifortune.getFortune();
	}


}