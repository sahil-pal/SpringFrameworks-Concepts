package MiniProject;
import java.sql.*;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class dataBase {
	
	private String register;
	private String database;
	private String username;
	private String password;
	private String query="";
	
	// getters and setter for class variables
	public String getRegister() {
		return register;
	}
	public void setRegister(String register) {
		this.register = register;
	}
	public String getDatabase() {
		return database;
	}
	public void setDatabase(String database) {
		this.database = database;
	}
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
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	
	// method for inserting the personal information of user
	public void insertSource(IUser user) {
		
		try {
			Class.forName(getRegister());
			Connection con = DriverManager.getConnection(database,username,password);
			Statement stmt = con.createStatement();
			String query = "insert into user values("
					+"'"+user.getApplinum()+"',"
					+"'"+user.getName()+"',"
					+""+user.getAge()+","
					+"'"+user.getE_mail()+"',"
					+"'"+Integer.toString(user.getPhone_num())+"',"
					+"'"+user.getLdetails().getLoan_type()+"',"
					+""+user.getLdetails().getDuration()+","
				    +""+user.getLdetails().getAmount()+","
				    		+ "'unknown')";
			stmt.execute(query);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	// method for inserting the QDE of user
	public void insertQde(IUser user) {
     	try {
	     		Class.forName(register);
		    	Connection con = DriverManager.getConnection(database,username,password);
				Statement stmt = con.createStatement();
				String query = "insert into qde values("
						+"'"+user.getApplinum()+"',"
						+"'"+user.getAdd().toString()+"',"
						+"'"+user.getDocs().aadharnum+"',"
						+"'"+user.getDocs().pannum+"',"
						+"'"+user.getDocs().voter_id+"',"
						+"'"+user.getDocs().qualification+"',"
						+ ""+user.getLdetails().getIncome()+","
						+"'"+user.getLdetails().getAssets().toString()+"',"
						+"'"+user.getLdetails().getLiabilities().toString()+"')";
				stmt.execute(query);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			
	}
	
	// method to insert the loan details of the user
	public void insertLdetails(IUser user) {
     	try {
	     		Class.forName(register);
		    	Connection con = DriverManager.getConnection(database,username,password);
				Statement stmt = con.createStatement();
				String query = "insert into loandetails(applinum,credit_score) values("
						+"'"+user.getApplinum()+"',"
						+""+user.getLdetails().getCreditScore()+")";
				stmt.execute(query);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			
	}
	
	// method for retrieving information
	public int retrieveValidation(String query) {
		int check = 0;
		try {
			Class.forName(register);
			Connection con = DriverManager.getConnection(database,username,password);
			Statement stmt = con.createStatement();
		    ResultSet rs = stmt.executeQuery(query);
		    
		    int i=1;
		    while(rs.next()) {
		    	String temp = rs.getString(i);
		    	i++;
		    	check++;
		    }  
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return check;
	}
	
	// method to calculate emi and roi
	public String retrieveLdetails(String applinum) {
		String emi1 = "";
	    String roi1 = "";
		try {
			Class.forName(register);
			Connection con = DriverManager.getConnection(database,username,password);
			Statement stmt = con.createStatement();
			String query = "select loan_type,duration,loan_amount from user where applinum='"+applinum+"'";
		    ResultSet rs = stmt.executeQuery(query);
		    int duration = 1;
		    float amount = 1;
		    String loan_type = "";
		    
		    while(rs.next()) {
		    	 loan_type = rs.getString(1);
		    	 duration = rs.getInt(2);
		    	 amount = rs.getFloat(3);
		    }  
		    
		    float roi = 0;
		    if(loan_type.contentEquals("car-loan")) {
		    	roi = (float) 1.5;
		    }
		    else if(loan_type.contentEquals("house-loan")) {
		    	roi = (float) 1.3;
		    }
		    else if(loan_type.contentEquals("education-loan")) {
		    	roi = (float) 1;
		    }
		    else if(loan_type.contentEquals("business-loan")) {
		    	roi = (float) 1.2;
		    }
		    float emi = amount*roi/(duration*12);
		    emi1 = Float.toString(emi);
		    roi1 = Float.toString(roi);
		    query = "update loandetails set roi='"+roi+"',emi='"+emi1+"' where applinum='"+applinum+"'";
		    stmt.execute(query);
		    
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return emi1+"@"+roi1;
	}
	
	
	// method to match the loan criteria
	public int retrieveCredit(String loan_type) {
		String credit = "";
		try {
			Class.forName(register);
			Connection con = DriverManager.getConnection(database,username,password);
			Statement stmt = con.createStatement();
			String query = "select credit from loan_criteria where loan_type='"+loan_type+"'";
		    ResultSet rs = stmt.executeQuery(query);
		    
		    while(rs.next()) {
		    	 credit = rs.getNString(1);
		    	 rs.next();
		    }
		    
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return Integer.parseInt(credit);
		
	}
	
	
	// method for retrieving the loan process status
	public String getStatus(String applinum) {
		String status="";
		try {
			Class.forName(register);
			Connection con = DriverManager.getConnection(database,username,password);
			Statement stmt = con.createStatement();
		    String query = "select status from user where applinum ='"+applinum+"'";
		    ResultSet rs = stmt.executeQuery(query);
		    int i=1;
		    while(rs.next()) {
		    	status = rs.getString(i);
		    	i++;
		    }  
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return status;
	}
	
	// method to set loan status at each stage
	public void setStatus(String applinum,String status) {
		try {
			Class.forName(register);
			Connection con = DriverManager.getConnection(database,username,password);
			Statement stmt = con.createStatement();
		    String query = "update user set status='"+status+"' where applinum='"+applinum+"'";
		    stmt.execute(query);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	
	}
	
	// method to remove data from database if the user is negative
	public void delete(String applinum) {
		
		try {
			Class.forName(getRegister());
			Connection con = DriverManager.getConnection(database,username,password);
			Statement stmt = con.createStatement();
			String query1 = "delete from user where applinum='"+applinum+"'";
			String query2 = "delete from qde where applinum='"+applinum+"'";
			stmt.execute(query1);
			stmt.execute(query2);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}