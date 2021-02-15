package AutoWiring;

public class Address {

	int pincode;
	String state;
	
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", state=" + state + "]";
	}
	
	
	
	
	
	
	
	
}
