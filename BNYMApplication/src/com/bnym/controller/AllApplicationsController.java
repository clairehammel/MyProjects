package com.bnym.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.bnym.service.ApplicationService_old;


@Controller
public class AllApplicationsController {

	@Autowired
	ApplicationService_old applicationService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
	//change format from entry format of 01/01/1980 => 1980-01-01 which Java recognizes
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, "sDOB", new CustomDateEditor(sdf, false));
	}

	@RequestMapping("/listApplicant")
		public ModelAndView listApplicant() {
		ModelAndView model = new ModelAndView("allApplications");
		model.addObject("allApplications", applicationService.getAllApplicants());
		return model;
	}
	
	@RequestMapping(value="/saveApplication", method=RequestMethod.POST)//step 3
	public ModelAndView submitAdmissionForm(
		@Valid @ModelAttribute("applicant") Applicant applicant, BindingResult result) {
		//@ModelAttribute allows you to bring in all the data and match it up to your class Applicant
		
			if(result.hasErrors()) {//return user to form if there are errors instead of Error Form
				ModelAndView model = new ModelAndView("newapplication");
				return model;
			}
			applicationService.getAllApplicants().add(applicant);
			ModelAndView model = new ModelAndView("allApplications");
			//send the data ==>tell it what it is called "listApplicant"
			model.addObject("listApplicant", applicationService.getAllApplicants()); //should match what is in jsp file forEach
				return model;
	}


}
