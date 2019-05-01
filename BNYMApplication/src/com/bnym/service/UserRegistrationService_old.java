package com.bnym.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bnym.entities.UserRegistration;

@Service("userRegistrationService")
public class UserRegistrationService_old {
	
	private List<UserRegistration> allUsers = new ArrayList<UserRegistration>();
	public List<UserRegistration> getAllUsers(){
		return allUsers;
	}
}
