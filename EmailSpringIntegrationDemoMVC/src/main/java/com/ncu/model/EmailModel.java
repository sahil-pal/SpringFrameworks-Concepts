package com.ncu.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class EmailModel {
	
	@Email(message= "Enter a valid email id")
	private String mailTo;
	
	@NotEmpty(message = "This field cannot be empty")
	private String subject;
	private String message;
	private String fileName;
	
	
	public EmailModel() {
		super();
	}

	public EmailModel(String mailTo, String subject, String message, String fileName) {
		super();
		this.mailTo = mailTo;
		this.subject = subject;
		this.message = message;
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}


	public String getMailTo() {
		return mailTo;
	}


	public void setMailTo(String mailTo) {
		this.mailTo = mailTo;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public String toString() {
		return "EmailModel [mailTo=" + mailTo + ", Subject=" + subject + ", message=" + message + "]";
	}
	

}