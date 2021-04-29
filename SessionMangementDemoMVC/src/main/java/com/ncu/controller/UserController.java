package com.ncu.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.ncu.model.User;

@Controller
@SessionAttributes("user")
public class UserController {
	

	@ModelAttribute("user")
	public User setUpAttrubutes(){
	      return new User();
	}
	
	@RequestMapping("/signin")
	public String showForm(Model model) {
		model.addAttribute("userModel", new User());
		return "Form";
	}
	
	@RequestMapping(value="/welcome",method=RequestMethod.POST)
	public String homepage(@ModelAttribute("userModel") User user,Model model) {
		
		if (user.getEmail().equals("sahil@gmail.com") && user.getPassword().equals("sahil")) {
	         user.setName("sahil pal");
	         user.setEmail("sahil@gmail.com");
	    	 user.setAge(19);
	    	 user.setCity("Gurugram");
	    	 user.setState("Haryana");
	    	 user.setInterest("Football");
	    	 
	         model.addAttribute("user",user);
	         return "welcome";
		}
		else {
	         model.addAttribute("message","Login failed. Enter correct details and Try again!");
	         return "Form";
	      }
	 }
	
	
	@RequestMapping("/update")
	public String updateInfoPage(@ModelAttribute("userModel") User user,Model model) {
		
		model.addAttribute("userModel", user);
		
		Map<String,String> cities = getCities();
		Map<String,String> states = getStates();
		Map<String,String> hobbies = getHobby();
		
		model.addAttribute("city",cities);
		model.addAttribute("state",states);	
		model.addAttribute("interest",hobbies);	
	
		return "update";
	}
	
	// method for creating city list
	public Map<String,String> getCities(){

		Map<String,String> cities = new LinkedHashMap<String,String>();
		cities.put("Gurugram","Gurugram");
		cities.put("Noida","Noida");
		cities.put("Faridabad","Faridabad");
		cities.put("Indore","Indore");
		cities.put("Banglore","Banglore");
		return cities;
	}

	// method for creating state list
	public Map<String,String> getStates(){

		Map<String,String> states = new LinkedHashMap<String,String>();
		states.put("Haryana","Haryana");
		states.put("Uttar Pradesh","Uttar Pradesh");
		states.put("Madhya Pradesh","Madhya Pradesh");
		states.put("Karnatka","Karnatka");
		states.put("Punjab","Punjab");
		return states;
	}

	// method for creating interests list
	public Map<String,String> getHobby(){

		Map<String,String> hobbies = new LinkedHashMap<String,String>();
		hobbies.put("Football","Football");
		hobbies.put("Gaming","Gaming");
		hobbies.put("Podcasting","Podcasting");
		return hobbies;
	}

	
}
	
