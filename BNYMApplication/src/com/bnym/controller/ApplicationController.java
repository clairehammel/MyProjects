package com.bnym.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bnym.entities.Applicant;


@Controller
public class ApplicationController {
	
	//this annotation looks for a particular data type (date in this case) 
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	//change format from entry format of 01/01/1980 => 1980-01-01 which Java recognizes
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, "sDOB", new CustomDateEditor(sdf, false));
	}

	@RequestMapping("apply")
	public ModelAndView getAdmissionForm(Model applicant) {
		
		applicant.addAttribute("applicant", new Applicant());
		
		ModelAndView mnv = new ModelAndView("newapplication");
	
		return mnv;
	}
	
//	//change to save application...
//	@RequestMapping(value="/saveApplication", method=RequestMethod.POST)//step 3
//	public ModelAndView submitAdmissionForm(
//			@Valid @ModelAttribute Applicant applicant, BindingResult result) {
//	
//		if(result.hasErrors()) {//return user to form if there are errors instead of Error Form
//			ModelAndView model = new ModelAndView("newapplication");
//			return model;
//		}
//		
		//send data to the database
//		try {
//		ApplicantService appser = New ApplicantService();
//		resultFlag = appser.newApplicant(applicant);
//		appser.deleteApplicant(applicant.id);
//		listapp = appser.getallapp();
//		if (true)
//			add "msg success.." to model object
//		}else add msg error
		
//		
//		
//		//@ModelAttribute allows you to bring in all the data and match it up to your class Applicant	
//		ModelAndView model = new ModelAndView("applysuccess");
//		
//			return model;
//		
//	}



}
