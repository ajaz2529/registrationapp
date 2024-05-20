package com.registrationapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registrationapp.entity.Registration;
@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Integer> {
	

}
