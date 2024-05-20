package com.registrationapp.service;
import java.util.List;

import com.registrationapp.entity.Registration;
public interface RegistrationService {
	
	public void addRegistration(Registration registration);
	public Registration getRegistration(int id);
	public List<Registration> getAllRegistrations();
	public void deleteRegistration(int id);
	public void updateRegistration(Registration registration);

}
