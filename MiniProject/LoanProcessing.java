package MiniProject;
import java.util.HashMap;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Map.Entry;

public class LoanProcessing implements IStage, ILoanProcess{
		
	IUser user;
	
	public IUser getUser() {
		return user;
	}

	public void setUser(IUser user) {
		this.user = user;
	}

	dataBase db;
	
	public dataBase getDb() {
		return db;
	}


	public void setDb(dataBase db) {
		this.db = db;
	}

	Scanner sc = new Scanner(System.in);
	
	
	// method for sourcing the applicant information
	@Override
	public void source(IUser user) {
		
		// setting stage variable to SOURCING
		user.setStage(SOURCING);
		
		System.out.println("Enter your user name : ");
		user.setName(sc.next());
		System.out.println("Enter your age : ");
		user.setAge(sc.nextInt());
		
		// entering email with validation
		System.out.println("Enter your e_mail : ");
		String email = sc.next();
		while(email.contains("#$&") || !email.contains("@")) {
			System.out.println("Please Enter a valid e-mail :");
			email = sc.next();
		}
		user.setE_mail(email);
		
		// entering phone number with validation
		System.out.println("Enter your phonenum : ");
		int phonenum = sc.nextInt();
		while(Integer.toString(phonenum).contains("[a-zA-Z]") || Integer.toString(phonenum).length() != 10) {
			System.out.println("Please Enter a valid phone number :");
			phonenum = sc.nextInt();
		}
		user.setPhone_num(phonenum);
		
		// entering the loan requirement details of the user
		System.out.println("Enter the loantype : [car-loan] , [house-loan] , [education-loan] , [business-loan]");
		String type = sc.next();
		user.getLdetails().setLoan_type(type);
		System.out.println("Enter duartion of loan : ");
		user.getLdetails().setDuration(sc.nextInt());
		System.out.println("Enter amount of the loan : ");
		user.getLdetails().setAmount(sc.nextFloat());
		
		// generating the application number for the new Customer
		generateApplinum(user);
		// inserting user data into database
		db.insertSource(user);
		db.setStatus(user.getApplinum(),"SOURCING");
		
		System.out.println("--> SOURCING done... ");
		System.out.println();
		
		System.out.println("Enter [Y/N] to continue or exit -->");
		String choice = sc.next();
		choice.toUpperCase();
		if(choice.contentEquals("Y")) {
			MoveToNextStage(user);
		}
		else {
			System.out.println("Thankyou, for using LoanApp. Exiting...");
			System.exit(1);
		}
		
	}
	
	
	// method to add the identification details of the user.
	public void qde(IUser user) {
		System.out.println("INSIDE QDE");
		// setting stage variable to QDE
		user.setStage(QDE);
		
		// printing the user's info
		if(user.getLdetails().getAmount() != 0.0) {
		System.out.println("Your Application number is : "+user.getApplinum());
		System.out.println("Dear "+user.getName()+", you applied for "+user.getLdetails().getLoan_type()+
							" of INR "+user.getLdetails().getAmount()+" for duration of "+user.getLdetails().getDuration()+"year(s)");
		}
	
		// entering the address details of the user
		System.out.println();
		System.out.println("Enter the House no. / Street details : ");
		user.getAdd().setStreet(sc.next());
		System.out.println("Enter the city name : ");
		user.getAdd().setState(sc.next());
		System.out.println("Enter the state name : ");
		user.getAdd().setState(sc.next());
		
		// entering identity proofs and qualification with check on formats
		// 1. Aadhar card number
		System.out.println("Enter your Aadhar number : ");
		String Aadharnum = sc.next();
		while(Aadharnum.contains("[a-zA-Z]") && Aadharnum.length() != 12) {
			System.out.println("Please enter a valid Aadhar-card numebr : ");
			Aadharnum = sc.next();
		}
		user.getDocs().setAadharnum(Aadharnum);
		
		// 2. Pan card number
		System.out.println("Enter your pan card number : ");
		String pannum = sc.next();
		while(pannum.length() != 11 && pannum.substring(0,5).contains("[1-9]")) {
			System.out.println("Please Enter a valid pan-card number");
			pannum = sc.next();
		}
		user.getDocs().setPannum(pannum);
		
		// 3. Voter id number
		System.out.println("Enter your 8-digit voter id details : ");
		String voternum = sc.next();
		while(voternum.contains("[a-zA-Z]") && voternum.length() != 8) {
			System.out.println("Please enter a valid Aadhar-card numebr : ");
			voternum = sc.next();
		}
		user.getDocs().setVoter_id(voternum);
		
		// 4. Highest Qualification 
		System.out.println("Enter your qualification details [ class10, class12, graduate, postGraduate, phd ]");
		user.getDocs().setQualification(sc.next());
		
		// entering the income of the user
		System.out.println("Enter the income : ");
		user.getLdetails().setIncome(sc.nextFloat());
		
		// enter the asset and liability detail
		HashMap<String,Float> temp_assets = new HashMap<String,Float>();
		System.out.println("Enter your assets with description and value : ");
		String desc = sc.next();
		float value = sc.nextFloat();
		temp_assets.put(desc,value);
		System.out.println("--> Press [1] to add another asset : ");
		int choice = sc.nextInt();
		while(choice == 1) {
			System.out.println("Enter your assets with description and value : ");
			desc = sc.next();
			value = sc.nextFloat();
			temp_assets.put(desc,value);
			System.out.println("--> Press [1] to add another asset : ");
			choice = sc.nextInt();
		}
		user.getLdetails().setAssets(temp_assets);
		
		
		HashMap<String,Float> temp_liability = new HashMap<String,Float>();
		System.out.println("Enter your liability with description and value : ");
		desc = sc.next();
	    value = sc.nextFloat();
		temp_liability.put(desc,value);
		System.out.println("--> Press [1] to add another liability : ");
		choice = sc.nextInt();
		while(choice == 1) {
			System.out.println("Enter your liability with description and value : ");
			desc = sc.next();
			value = sc.nextFloat();
			temp_liability.put(desc,value);
			System.out.println("--> Press [1] to add another liability : ");
			choice = sc.nextInt();
		}
		user.getLdetails().setLiabilities(temp_liability);;
		
		// inserting user data into database
		db.insertQde(user);
		db.setStatus(user.getApplinum(),"QDE");
		
		System.out.println("--> QDE done... ");
		System.out.println("");
		
		System.out.println("Enter [Y/N] to continue or exit -->");
		String choice1 = sc.next();
		choice1.toUpperCase();
		if(choice1.contentEquals("Y")) {
			MoveToNextStage(user);
		}
		else {
			System.out.println("Thankyou, for using LoanApp. Exiting...");
			System.exit(1);
		}
	}
	
	
	// method to check the credibility of the user
	public void dedupe(IUser user) {
		
		// setting the stage variable to DEDUPE
		user.setStage(DEDUPE);
		
		boolean isNegative = false;
		int check = isDefaulter(user);
		
		if(check == 0) {
			System.out.println("--> IDS verified successfully...");
			System.out.println();
			db.setStatus(user.getApplinum(),"DEDUPE");
		}
		else if(check == 1) {
			System.out.println("User found in defaulter list, Negativity %  = 30");
			isNegative = true;
		}
		else if(check == 2) {
			System.out.println("User found in defaulter list, Negativity %  = 60");
			isNegative = true;
		}
		else if(check == 3) {
			System.out.println("User found in defaulter list, Negativity %  = 100");
			isNegative = true;
		}
		
		if(!isNegative) {
			MoveToNextStage(user);
		}
		else {
			db.delete(user.getApplinum());
			System.out.println("Exiting LoanApp...");
			System.exit(1);
		}
	
	}
	
	// method to calculate the credit-score of the user
	public void scoreCalc(IUser user) {
			
		// setting stage variable to SCORING
		user.setStage(SCORING);
			
		float total_assets = user.getLdetails().getIncome();
		float total_liabilities = 0;
			
		// calculating the total assets and liability of the user
		for(Entry<String,Float> entry1 : user.getLdetails().getAssets().entrySet()) {
			total_assets = total_assets + entry1.getValue();
		}
		for(Entry<String,Float> entry2 : user.getLdetails().getLiabilities().entrySet()) {
			total_liabilities = total_liabilities + entry2.getValue();
		}
		
		int totalincome = (int) (total_assets - total_liabilities);
			
		int Agefactor = user.getAge();
			
		if(Agefactor > 20 && Agefactor < 45) {
			Agefactor = Agefactor * 2;
		}
		
		String qualFactor = user.getDocs().getQualification();
		
		if(qualFactor.equals("class10")){
			totalincome = totalincome+50;
		}
		else if(qualFactor.equals("class12")) {
			totalincome = totalincome+60;
		}
		else if(qualFactor.equals("graduate")) {
			totalincome = totalincome+70;
		}
		else if(qualFactor.equals("postGraduate")) {
			totalincome = totalincome+90;
		}
		else if(qualFactor.equals("phd")) {
			totalincome = totalincome+100;
		}
		else {
			
		}	
		int creditScore = (int) ((totalincome*0.60)+Agefactor)/100;
		
		user.getLdetails().setCreditScore(creditScore);
		
		System.out.println("Your credit score is "+creditScore);
		System.out.println("--> SCORING done...");
		System.out.println();
		
		db.insertLdetails(user);
		db.setStatus(user.getApplinum(),"SCORING");
		
		System.out.println("Enter [Y/N] to continue or exit -->");
		String choice = sc.next();
		choice.toUpperCase();
		if(choice.contentEquals("Y")) {
			MoveToNextStage(user);
		}
		else {
			System.out.println("Thankyou, for using LoanApp. Exiting...");
			System.exit(1);
		}
			
	}
		
	// method to check eligibility of user for loan according to his/her credit-score
	public void setStatus(IUser user) {
			
		user.setStage(STATUS);
		int score = user.getLdetails().getCreditScore();
			
		if(score >= db.retrieveCredit(user.getLdetails().getLoan_type())) {
			System.out.println("Congratulations!!! Your loan request is accepted...");
			db.setStatus(user.getApplinum(),"ACCEPTED");
			loanCalc(user);
			System.exit(1);
		}
		else {
			System.out.println("Your Credit Score is not enough to apply for the required loan");
			db.setStatus(user.getApplinum(),"REJECTED");
			System.exit(1);
		}
	}
		
		
	// method to check the Loan status for old user 
	@Override
	public void StageCheck(IUser user,String applinum) {
		
		int check = db.retrieveValidation("select distinct name from user where applinum = '"+applinum+"'");
		if(check == 0) {
			System.out.println("Sorry,the requested User does not exist...");
		}
		else {
			user.setApplinum(applinum);
			user.setStage(db.getStatus(applinum));
			System.out.println();
			System.out.println("Dear,User your loan request is at stage : "+user.getStage());
			user.setStage(db.getStatus(applinum));
				
			System.out.println("--> Press [1] to submit your application for NEXT STAGE -->");
			int choice = sc.nextInt();
			if(choice == 1) {
				MoveToNextStage(user);
			}
			else {
				System.out.println("Thankyou, for visting LoanApp");
				System.out.println("logging out....");
				System.exit(1);
			}
		}
	}
		
		
	public void MoveToNextStage(IUser user) {
			
		if(user.getStage() == "SRC" || user.getStage().contentEquals("SOURCING")) {
			 qde(user);
		}
		else if(user.getStage() == "Q" || user.getStage().contentEquals("QDE")) {
			dedupe(user);
		}
		else if(user.getStage() == "D" || user.getStage().contentEquals("DEDUPE")) {
			scoreCalc(user);
		}
		else if(user.getStage() == "SC" || user.getStage().contentEquals("SCORING")) {
			setStatus(user);
		}
		else if(user.getStage().contentEquals("ACCEPTED")) {
			System.out.println("--> Your Loan Application is approved, we will contact you with in 7 days");
		}
		else if(user.getStage() == "REJECTED") {
			System.out.println("--> Your Loan Application is rejected as credit score < min credit score that you applied.");
		}
	}
	
	
	// method to generate the application number of the new user
	public void generateApplinum(IUser user) {
		String applinum = user.getName().substring(0,3)+"@"+Integer.toString(user.getPhone_num()).substring(3,8);
		user.setApplinum(applinum);
	}
	
	// method to check the user in defaulter's list
	public int isDefaulter(IUser user) {
		
		String query = "select * from defaulter where "+"aadharnum = '"
						+user.getDocs().getAadharnum()+"'"
						+"OR pannum = '"+user.getDocs().getPannum()+"'"
						+"OR voterid = '"+user.getDocs().getVoter_id()+"'";
		
		int check = db.retrieveValidation(query);
		
		return check;
		
	}
	
	// method to calculate rate of interest and emi
	public void loanCalc(IUser user) {
		String temp = db.retrieveLdetails(user.getApplinum());
		System.out.println("Loan Details :  --> EMI and ROI = INR/PerMonth "+temp+" %");
	}
	
	
}
