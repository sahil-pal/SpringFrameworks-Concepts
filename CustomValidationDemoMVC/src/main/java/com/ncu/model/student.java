package com.ncu.model;

import javax.validation.constraints.NotNull;

import com.ncu.validation.CourseCode;


public class student {

	
	String firstName;
	
	@NotNull(message="This field is required")
	String LastName;
	
	@NotNull(message="This field is required")
	String year;
	
	@CourseCode(value="CSE,ECE,CSL,SOM",message="Enter valid Course id starting with CSE,ECE,CSL,SOM")
	String courseCode;

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
}
