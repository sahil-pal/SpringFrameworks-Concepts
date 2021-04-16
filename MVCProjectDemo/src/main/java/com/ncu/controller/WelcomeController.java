package com.ncu.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ncu.models.User;

@Controller
public class WelcomeController {

	// to get data from Model to JSP
	
	// 1. HTTP request
	@RequestMapping("/login1")
	public String doLogin1(Model model) {
		return "login1";
	}
	
//	@RequestMapping("/welcome")
//	public String welcomeMessage(HttpServletRequest request,Model model) {
//		String userid = request.getParameter("userId");
//		String password = request.getParameter("pass");
//		if(userid.equals("sahil07") && password.equals("sahil")) {
//			model.addAttribute("msg1","hello, "+userid);
//			model.addAttribute("msg2","Login successfull!");
//		}
//		else {
//			model.addAttribute("msg1","invalid userid!");
//			model.addAttribute("msg2","Login unsuccessfull!");
//		}
//		return "welcome1";
//	}
	
//	 2. @RequestParam
//	@RequestMapping(path = "/welcome",method = RequestMethod.POST)
//	public String welcomeMessage(@RequestParam("userId") String userid, @RequestParam("pass") String password, Model model) {
//		if(userid.equals("sahil07") && password.equals("sahil")) {
//			model.addAttribute("msg1","hello, "+userid);
//			model.addAttribute("msg2","Login successfull!");
//		}
//		else {
//			model.addAttribute("msg1","invalid userid!");
//			model.addAttribute("msg2","Login unsuccessfull!");
//		}
//		return "welcome1";
//	}
	
	// 3. @ModelAttribute
	@RequestMapping("/login2")
	public String doLogin2(Model model) {
		model.addAttribute("userModel", new User());
		return"login2";
	}
	
	@RequestMapping(path="/welcome",method = RequestMethod.POST)
	public String welcomeMessage(@ModelAttribute("userModel") User user,Model model) {
		
		if(user.getUserid().equals("sahil07") && user.getPassword().equals("sahil")) {
			model.addAttribute("msg1","hello, "+user.getUserid());
			model.addAttribute("msg2", "Login successfull!");
		}
		else {
			model.addAttribute("msg1","invalid userid!");
			model.addAttribute("msg2", "Login unsuccessfull!");
		}
		return "welcome1";
	}
	
}
