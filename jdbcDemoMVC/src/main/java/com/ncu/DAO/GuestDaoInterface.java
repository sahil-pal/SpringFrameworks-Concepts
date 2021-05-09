package com.ncu.DAO;

import java.util.List;

import com.ncu.model.User;

public interface GuestDaoInterface {

	public int checkCredential(String username,String password);
	
	public List<User> showEmployees();
	
	public List<User> showEmployeesBySearch(String deptNumber);
}
