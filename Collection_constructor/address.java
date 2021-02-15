package Collection_constructor;

public class address {

	private String city;
	private String house_no;
	private String state;
	private String pincode;
	
	public String toString() {
		return "Address [city=" + city + ", house_no=" + house_no + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	public address(String city, String house_no, String state, String pincode) {
		this.city=city;
		this.house_no=house_no;
		this.state=state;
		this.pincode=pincode;
	}
}
