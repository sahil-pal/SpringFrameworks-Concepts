package com.ncu.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ncu.model.student;

@Controller
public class FormContoller {

	// Init binder is used to convert/trim input strings by remove leading and trailing whitespace and resolve issue for our validation
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	@RequestMapping("/register")
	public String showFormEnglish(Model model) {
		
		Map<String,String> year = new LinkedHashMap<String,String>();
		year.put("first","I");
		year.put("second","II");
		year.put("third","III");
		year.put("fourth","IV");
		
		model.addAttribute("Student", new student());
		model.addAttribute("years",year);
		
		return "registration";
	}
	
	@RequestMapping("/welcome")
	public String processForm(
			@Valid @ModelAttribute("Student") student stu,BindingResult theBindingResult, Model model) {
		
		
		if (theBindingResult.hasErrors()) {
			Map<String,String> year = new LinkedHashMap<String,String>();
			year.put("first","I");
			year.put("second","II");
			year.put("third","III");
			year.put("fourth","IV");
			model.addAttribute("years",year);
			return "registration";
		}
		else {
			return "welcome";
		}
	}
}
