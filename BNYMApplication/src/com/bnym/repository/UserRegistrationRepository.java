package com.bnym.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bnym.entities.UserRegistration;

@Repository
public interface UserRegistrationRepository extends CrudRepository<UserRegistration, Long>{

	
	
}
