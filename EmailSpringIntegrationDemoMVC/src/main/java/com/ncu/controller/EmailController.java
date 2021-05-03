package com.ncu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ncu.model.*;

import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.internet.MimeMessage;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;

@Controller
public class EmailController {
	
	static String emailToRecipient;
	static String emailSubject;
	static String emailMessage;
	static String emailFileName;
	
	static final String emailFromRecipient = "sahilpal67@gmail.com";
	
	//	static ModelAndView modelViewObj;
	
	@Autowired
	private JavaMailSender mailSenderObj;
	
	@RequestMapping("/EmailForm")
	public String showEmailForm(@ModelAttribute("email") EmailModel email ) {
		return "EmailForm";
	}
	
	@RequestMapping("/send")
	public String send(Model model , @Valid @ModelAttribute("email") EmailModel email,BindingResult br) {
		
		if(br.hasErrors()) {
			String name = "sahil";
			model.addAttribute("name", name);
			model.addAttribute("exception", new Exception());
			return "Error";
		}
		System.out.println(email);
		
		emailSubject = email.getSubject();
		emailMessage = email.getMessage();
		emailToRecipient = email.getMailTo();
		emailFileName = "/Users/sahilpal/Desktop/"+email.getFileName();
		System.out.println("file name is : "+emailFileName);
		mailSenderObj.send(new MimeMessagePreparator() {
			
			@Override
			public void prepare(MimeMessage mimeMessage) throws Exception {
				// TODO Auto-generated method stub
				MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true, "UTF-8");
				mimeMessageHelper.setTo(emailToRecipient);
				mimeMessageHelper.setFrom(emailFromRecipient);
				mimeMessageHelper.setText(emailMessage);
				mimeMessageHelper.setSubject(emailSubject);
				if(emailFileName !="") {
					DataSource datasource = new FileDataSource(emailFileName);  
					mimeMessageHelper.addAttachment(emailFileName, datasource);
				
				}
				
				
			}
		});
		System.out.println("--> email sent successfully");
		model.addAttribute("email", email);
		return "success";
	}
	
	

}