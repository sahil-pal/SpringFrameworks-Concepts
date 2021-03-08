package MiniProject;

import java.util.ArrayList;

public interface IUser {

	// get and set the name of the applicant
	public String getName();
	public void setName(String name);
	
	// get and set the age of the applicant
	public int getAge();
	public void setAge(int age);
	
	// get and set the email of the applicant
	public String getE_mail();
	public void setE_mail(String e_mail);
	
	// get and set the phone number of the applicant
	public int getPhone_num();
	public void setPhone_num(int phone_num);
	
	// get and set the document information of the applicant
	public documents getDocs();
	public void setDocs(documents docs);
	
	// get and set the address of the applicant
	public Address getAdd();
	public void setAdd(Address add);
	
	// get and set the loan details of the applicant
	public LoanDetails getLdetails();
	public void setLdetails(LoanDetails ldetails);
	
	// get and set the Loan stage
	public String getStage();
	public void setStage(String stage);
	
	// get and set the Application number
	public String getApplinum();
	public void setApplinum(String applinum);
}
