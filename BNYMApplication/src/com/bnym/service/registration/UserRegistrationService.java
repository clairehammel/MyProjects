package com.bnym.service.registration;

import java.util.List;

import com.bnym.entities.UserRegistration;

public interface UserRegistrationService {
	
		public List<UserRegistration> getAllUsers();
		public UserRegistration getUserById(Long id);
		public boolean saveUser(UserRegistration user);
		public boolean deleteUserById(Long id);
}
