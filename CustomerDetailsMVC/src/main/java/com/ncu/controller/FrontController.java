package com.ncu.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.ncu.model.Customer;

@Controller
public class FrontController {
	
	@RequestMapping("/userform")
	public String Form(Model model) {
		
		model.addAttribute("customerModel", new Customer());
		
		Map<String,String> cities = getCities();
		Map<String,String> states = getStates();
		Map<String,String> hobbies1 = getHobby1();
		Map<String,String> hobbies2 = getHobby2();
		 
		model.addAttribute("city",cities);
		model.addAttribute("state",states);	
		model.addAttribute("interest1",hobbies1);	
		model.addAttribute("interest2",hobbies2);	
		
		return "userform";
	}
	
	@RequestMapping(path="/thankyou",method = RequestMethod.POST)
	public String thankyou_page(@ModelAttribute("userModel") Customer user,Model model) {
		model.addAttribute("name", user.getName());
		model.addAttribute("email", user.getEmail());
		model.addAttribute("phone", user.getContactnumber());
		model.addAttribute("i1", user.getInterest1());
		model.addAttribute("i2", user.getInterest2());
		model.addAttribute("gender", user.getGender());
		model.addAttribute("city", user.getCity());
		model.addAttribute("state", user.getState());
		model.addAttribute("feedback", user.getFeedback());
		return "thankyou";
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
	public Map<String,String> getHobby1(){
			
		Map<String,String> hobbies = new LinkedHashMap<String,String>();
		hobbies.put("Writing","Writing");
		hobbies.put("Gaming","Gaming");
		hobbies.put("Podcasting","Podcasting");
		hobbies.put("Community service","Community service");
		hobbies.put("Playing an instrument","Playing an instrument");
		return hobbies;
	}
	
	// method for creating interests list
	public Map<String,String> getHobby2(){
				
		Map<String,String> hobbies = new LinkedHashMap<String,String>();
		hobbies.put("Travel","Travel");
		hobbies.put("Nature","Nature");
		hobbies.put("History","History");
		hobbies.put("Theater","Theater");
		hobbies.put("painting","painting");
		return hobbies;
	}
}
