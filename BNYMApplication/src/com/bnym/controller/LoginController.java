package com.bnym.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bnym.entities.Applicant;





@Controller
public class LoginController {

	@RequestMapping("/")
	public ModelAndView getIndex() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	
	@RequestMapping(value = "submitlogin", method=RequestMethod.POST)
	public ModelAndView login(@RequestParam Map<String, String> loginData, Model applicant) {
	
		//this sends an Applicant object into the form to compare with any constraints
		applicant.addAttribute("applicant", new Applicant());

		//get credentials from login screen
		String email = loginData.get("email");
		String password = loginData.get("password");	
		
		//compare with known credentials -- later this will be compared to DB info
		if(email.equals("claire@gmail.com") && password.equals("123456")) {

			//if known user, save user and show user list
			
			ModelAndView model = new ModelAndView("loginsuccess");
			return model;
		}
		//otherwise send message to user and repeat login process
		ModelAndView model = new ModelAndView("index");
		model.addObject("msg", "Invalid credentials. Try again.");
		return model;

	}
}
