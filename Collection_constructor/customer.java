package Collection_constructor;

import java.util.*;

import Collection_SI.address;

public class customer {
	
	private List<String> names= new Vector<String>();
	private Set<Long> Phno;
	private Map<Long, String> aadharNo;
	private Map<Long, address> address;
	private Properties email;
	
	public String toString() {
		return "Customer [names=" + names + ", Phno=" + Phno + ", aadharNo=" + aadharNo + ", address=" + address
				+ ", email=" + email + "]";
	}
	
	public customer(List<String> names, Set<Long> Phno, Map<Long, String> aadharNo, Map<Long,address> address,Properties email ) {
		this.names=names;
		this.Phno=Phno;
		this.aadharNo=aadharNo;
		this.address=address;
		this.email=email;
	}
	
	
	
}
