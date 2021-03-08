package MiniProject;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

public class Customer implements IUser {

	// newCustomer class variables
	private String name;
	private String Applinum;
	private int age;
	private String e_mail;
	private int phone_num;
	private String stage;
	
	// other injected classes reference
	private documents docs;
	private Address add;
	private LoanDetails ldetails;
	
	// getters and setters for putting values in the class memebers
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public int getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(int phone_num) {
		this.phone_num = phone_num;
	}
	public documents getDocs() {
		return docs;
	}
	public void setDocs(documents docs) {
		this.docs = docs;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	public LoanDetails getLdetails() {
		return ldetails;
	}
	public void setLdetails(LoanDetails ldetails) {
		this.ldetails = ldetails;
	}
	public String getStage() {
		return stage;
	}
	public void setStage(String stage) {
		this.stage = stage;
	}
	public String getApplinum() {
		return Applinum;
	}
	public void setApplinum(String applinum) {
		Applinum = applinum;
	}
	
	
}
