package com.bnym.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bnym.entities.Applicant;

@Service("applicationService")
public class ApplicationService_old {
	
	private List<Applicant> applicantList = new ArrayList<Applicant>();
	
	public List getAllApplicants() {
		return applicantList;
	}

}
