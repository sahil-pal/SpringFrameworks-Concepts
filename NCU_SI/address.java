package NCU_SI;

public class address {

	String city;
	String state;
	
	public String toString() {
		return "Address [ city : "+city+" and state : "+state+" ]";
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
