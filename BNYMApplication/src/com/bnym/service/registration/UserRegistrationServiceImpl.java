package com.bnym.service.registration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bnym.entities.UserRegistration;
import com.bnym.repository.UserRegistrationRepository;

public class UserRegistrationServiceImpl implements UserRegistrationService{
	
	@Autowired 
	private UserRegistrationRepository repository;

	@Override
	public List<UserRegistration> getAllUsers() {
		List<UserRegistration> list = new ArrayList<UserRegistration>();
		for (UserRegistration user : repository.findAll()) {
			list.add(user);
		}
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public UserRegistration getUserById(Long id) {
		UserRegistration user = repository.findById(id).get();
		// TODO Auto-generated method stub
		return user;
	}

	@Override
	public boolean saveUser(UserRegistration user) {
		try {
			repository.save(user);
			return true;
		}catch(Exception ex) {
		return false;
	}
}
	@Override
	public boolean deleteUserById(Long id) {
		try {
			repository.deleteById(id);
			return true;
		}catch(Exception ex) {
			}
		// TODO Auto-generated method stub
		return false;
	}

}
