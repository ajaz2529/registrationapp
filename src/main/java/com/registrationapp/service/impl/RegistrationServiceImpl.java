package com.registrationapp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registrationapp.entity.Registration;
import com.registrationapp.repository.RegistrationRepository;
import com.registrationapp.service.RegistrationService;
@Service
public class RegistrationServiceImpl implements RegistrationService {
	@Autowired
	RegistrationRepository registrationRepository;

	@Override
	public void addRegistration(Registration registration) {
		try {
		registrationRepository.save(registration);
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public Registration getRegistration(int id) {
		Optional<Registration> byId = registrationRepository.findById(id);
		Registration registration = byId.get();
		return registration;
	}

	@Override
	public List<Registration> getAllRegistrations() {
		List<Registration> allregistrations = registrationRepository.findAll();
		return allregistrations;
	}

	@Override
	public void deleteRegistration(int id) {
		registrationRepository.deleteById(id);
	}

	@Override
	public void updateRegistration(Registration registration) {
		registrationRepository.save(registration);

	}

}
