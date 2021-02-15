package beanLifeCycle;

public class Fortune implements IFortune {

	public Fortune() {
		System.out.println("Inside the Fortune constructor...");
	}
	
	public String getFortune() {
		return "you have a good fortune today";
	}
	
	public String healthService() {
		return "This is Health Service of the Fortune class";
	}
}
