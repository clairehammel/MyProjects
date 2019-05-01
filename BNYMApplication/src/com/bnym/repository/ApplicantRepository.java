package com.bnym.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bnym.entities.Applicant;

@Repository //was T now Applicant & was ID now Long
public interface ApplicantRepository extends CrudRepository<Applicant, Long> {

}
