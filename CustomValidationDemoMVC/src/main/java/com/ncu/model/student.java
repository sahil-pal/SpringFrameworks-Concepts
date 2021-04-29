package com.ncu.model;

import javax.validation.constraints.NotNull;

import com.ncu.validation.CourseCode;
import com.ncu.validation.Password;


public class student {

	
	String firstName;
	
	@NotNull(message="This field is required")
	String LastName;
	
	@NotNull(message="This field is required")
	String year;
	
	@CourseCode(value="CSE,ECE,CSL,SOM",message="Enter valid Course id starting with CSE,ECE,CSL,SOM")
	String courseCode;
	
	@Password(message="Enter valid Password")
	String password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
