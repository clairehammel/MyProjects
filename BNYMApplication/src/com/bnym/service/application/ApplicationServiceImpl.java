package com.bnym.service.application;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bnym.entities.Applicant;
import com.bnym.repository.ApplicantRepository;

@Service
@Transactional
public class ApplicationServiceImpl implements ApplicationService{
	
	@Autowired
	private ApplicantRepository repository; //dependency injection

	@Override
	public List<Applicant> getAllApplications() {
		//Local Copy of Applicant Table
		List<Applicant> list = new ArrayList<Applicant>();
		
		for (Applicant applicant : repository.findAll()) { //repository is an iterable class
			list.add(applicant);
		}
		// TODO Auto-generated method stub
		return list;
	}
	
	//Second method from DAO
	@Override
	public Applicant getApplicantionById(Long id) {
		Applicant applicant = repository.findById(id).get();
		// TODO Auto-generated method stub
		return applicant;
	}
	
	//Third method from DAO
	@Override
	public boolean saveApplication(Applicant applicant) {
		try {
			repository.save(applicant);
			return true;
		}catch(Exception ex) {
		return false;
		}
	}

	//Forth method from DAO
	@Override
	public boolean deleteapplicationById(Long id) {
		try {
			repository.deleteById(id);
			return true;
		}catch(Exception ex) {
			}
		// TODO Auto-generated method stub
		return false;
	}
	
}
