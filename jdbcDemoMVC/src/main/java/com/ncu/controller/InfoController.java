package com.ncu.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ncu.DAO.AdminDaoInterface;
import com.ncu.DAO.GuestDaoInterface;
import com.ncu.model.User;

@Controller
public class InfoController {

	@Autowired
	private AdminDaoInterface admin;
	
	@Autowired
	private GuestDaoInterface guest;
		
	@RequestMapping(value="adminProfile",method = RequestMethod.GET)
	public String viewDetailsofAdmin(@SessionAttribute("user") User user,Model model) {
		user = admin.getUserobj(user.getUsername());
		model.addAttribute("user",user);
		return "adminProfile";
	}
	
	@RequestMapping(value="/showEmployees")
	public String manageEmployee(@SessionAttribute("user")User user,Model model) {
		 if(user.getAccType().equals("Admin")) {
			 List<User> employeeList = admin.showEmployees();
			 model.addAttribute("key",1);
			 model.addAttribute("employeeList", employeeList);
		 }
		 else {
			 List<User> employeeList = guest.showEmployees();
			 model.addAttribute("key",0);
			 model.addAttribute("employeeList", employeeList);
		 }
	     return "showEmployees";
	}
	
	@RequestMapping(value="/editEmp/{username}")
	public String geteditForm(@PathVariable("username")String username,Model model) {
			model.addAttribute("username",username);
			return "editEmp";
	}
	
	@RequestMapping(value="/editEmp/processEdit")
	public String edittheEmployee(HttpServletRequest request) {
		User user = new User();
		user.setDno(Integer.parseInt(request.getParameter("departmentNum")));
		user.setSuperSsn(Integer.parseInt(request.getParameter("superSsn")));
		user.setSalary(Integer.parseInt(request.getParameter("salary")));
		user.setAddress(request.getParameter("address"));
		admin.editEmployee(request.getParameter("username"),user);

		return "redirect:/showEmployees";
	}
	
	@RequestMapping(value="/deleteEmp/{username}")
	public String deleteEmployee(@PathVariable("username") String username,Model model) {
		admin.deleteEmployeeData(username);
		return "redirect:/showEmployees";
	}
	
	@RequestMapping("/search")
	public String searchEmployeesByDept(@RequestParam("departmentNum") String departmentNum,Model model) {
		List<User> employeeList = guest.showEmployeesBySearch(departmentNum);
		model.addAttribute("key",0);
		model.addAttribute("employeeList", employeeList);
		return "showEmployees";
	}
	
	
}
