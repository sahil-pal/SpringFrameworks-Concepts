package com.ncu.DAO;

import java.util.List;

import com.ncu.model.User;

public interface AdminDaoInterface {
	
	public int checkCredential(String username,String password);
	
	public User getUserobj(String username);
	
	public List<User> showEmployees();
	
	public void editEmployee(String target, User user);
	
	public void deleteEmployeeData(String username);


}
