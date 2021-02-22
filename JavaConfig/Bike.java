package JavaConfig;


public class Bike implements Vehicle{

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Bike is two-wheeler vehicle";
	}

	public Bike() {
		System.out.println("Inside the Bike constructor.");
	}
	
}
