package JavaConfig;


public class Car implements Vehicle {

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Car is a four-wheeler vehicle";
	}
	
	public Car() {
		System.out.println("Inside the Car class constructor");
	}

}
