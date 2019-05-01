package com.bnym.service.application;

import java.util.List;

import com.bnym.entities.Applicant;

public interface ApplicationService {
	
	public List<Applicant> getAllApplications();
	public Applicant getApplicantionById(Long id);
	public boolean saveApplication(Applicant applicant);
	public boolean deleteapplicationById(Long id);

}
