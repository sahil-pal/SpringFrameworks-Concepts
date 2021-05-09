package com.ncu.model;

public class User {

	private String username;
	private String password;
	private String accType;
	private String Fname;
	private String minit;
	private String Lname;
	private int Ssn;
	private int bdate;
	private String Sex;
	private String Address;
	private int Salary;
	private int SuperSsn;
	private int Dno;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getMinit() {
		return minit;
	}
	public void setMinit(String minit) {
		this.minit = minit;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getSsn() {
		return Ssn;
	}
	public void setSsn(int ssn) {
		Ssn = ssn;
	}
	public int getBdate() {
		return bdate;
	}
	public void setBdate(int bdate) {
		this.bdate = bdate;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public int getSuperSsn() {
		return SuperSsn;
	}
	public void setSuperSsn(int superSsn) {
		SuperSsn = superSsn;
	}
	public int getDno() {
		return Dno;
	}
	public void setDno(int dno) {
		Dno = dno;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", accType=" + accType + ", Fname=" + Fname
				+ ", minit=" + minit + ", Lname=" + Lname + ", Ssn=" + Ssn + ", bdate=" + bdate + ", Sex=" + Sex
				+ ", Address=" + Address + ", Salary=" + Salary + ", SuperSsn=" + SuperSsn + ", Dno=" + Dno + "]";
	}
	
	
	
}
