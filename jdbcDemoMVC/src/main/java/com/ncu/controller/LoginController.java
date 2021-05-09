package com.ncu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.ncu.DAO.AdminDAO;
import com.ncu.DAO.AdminDaoInterface;
import com.ncu.DAO.GuestDaoInterface;
import com.ncu.model.User;


@Controller
@SessionAttributes("user")
public class LoginController {

	@Autowired
	private AdminDaoInterface admin;
	
	@Autowired
	private GuestDaoInterface guest;
	
	@ModelAttribute("user")
	public User setUpAttributes(){
	      return new User();
	}
	
	@RequestMapping("/Login")
	public String showLoginPage(Model model) {
		model.addAttribute("userModel", new User());
		return "Login";
	}
	
	@RequestMapping("/process")
	public String processUser(@ModelAttribute("user") User user, Model model) {
		
		String email = user.getUsername();
		String password = user.getPassword();
		
		
		if(user.getAccType().equals("Admin")) {
			if(admin.checkCredential(email, password) == 1) {
				return "HomepageAdmin";
			}
			else {
				model.addAttribute("message","Invalid credentials !");
				model.addAttribute("userModel", new User());
				return "Login";
			}
		}
		else {
			if(guest.checkCredential(email, password) == 1) {
				return "HomepageGuest";
			}
			else {
				model.addAttribute("message","Invalid credentials !");
				model.addAttribute("userModel", new User());
				return "Login";
			}
		}
	}
	
	@RequestMapping("/HomepageAdmin")
	public String showHomepageAdmin(@SessionAttribute("user") User user,Model model) {
		return "HomepageAdmin";
	}
	
	@RequestMapping("/HomepageGuest")
	public String showHomepageGuest(@SessionAttribute("user") User user,Model model) {
		return "HomepageGuest";
	}
	
	@RequestMapping("/logout")
	public String logoutUser(SessionStatus status) {
		status.setComplete();
		return "redirect:/Login";
	}
	
}
