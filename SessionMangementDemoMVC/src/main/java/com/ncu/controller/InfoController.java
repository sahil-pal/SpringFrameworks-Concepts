package com.ncu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ncu.model.User;

@Controller
public class InfoController {
	
	 @RequestMapping(value="/profile",method = RequestMethod.GET)
	 public String userInfoPage1(@SessionAttribute("user") User user) {
		 return "profile";
	}
	 
	 @RequestMapping(value="/profile2",method = RequestMethod.GET)
	 public String userInfoPage2(@SessionAttribute("user") User user) {
		 return "profile2";
	}
}
