package com.bnym.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bnym.entities.Applicant;
import com.bnym.entities.UserRegistration;
import com.bnym.service.UserRegistrationService_old;

//this controller maps to 1)create new user form and 2)to validate new user credentials

@Controller
public class UserRegistrationController {

	@Autowired
	UserRegistrationService_old userRegistrationService;
	
	@RequestMapping("/allUsers")
	public ModelAndView viewAllUsers() {
		ModelAndView model = new ModelAndView("allUsers");
		model.addObject("allUsers",userRegistrationService.getAllUsers());
		return model;
	}
	
	@RequestMapping("/newUser")
	public ModelAndView getRegistrationForm() {
		
		ModelAndView model = new ModelAndView("newuser");
		return model;
	}

	
	@RequestMapping(value= "validatenew", method=RequestMethod.POST)
	public ModelAndView validatePassword(@RequestParam Map<String, String> userData, Model applicant) {
		applicant.addAttribute("applicant", new Applicant());

		//if email credential exists in database redirect to registration page again!
		//code will go below to set boolean to true or false
		boolean userDoesNotExists = true;
		
		//get credentials from the registration page
		
		String email = userData.get("email");
		String password = userData.get("password");
		String confirm = userData.get("confPassword");
		
		if(userDoesNotExists ) {
			
			//check to see if password entries match
			if(password.equals(confirm)) {
				UserRegistration newUser = new UserRegistration();
				newUser.setID(userRegistrationService.getAllUsers().size()+1);
				newUser.setEmail(email);
				newUser.setPassword(password);
				
				//if passwords match, present admission form to user
				userRegistrationService.getAllUsers().add(newUser);
				
				System.out.println(userRegistrationService.getAllUsers().size() + "User List Size");
				ModelAndView model = new ModelAndView("allUsers");
				model.addObject("allUsers", userRegistrationService.getAllUsers());
				return model;
				
			//if passwords don't match, return to registration page and message user	
			}else {
				ModelAndView model = new ModelAndView("newuser");
				model.addObject("msg", "Your passwords did not match, try again.");
				return model;
			}
		//if user exists in database, go back to registration page	
		}else {
			ModelAndView model = new ModelAndView("newuser");
			model.addObject("msg", "User found with the same email, use another");
			return model;
		}
	}

	
}


