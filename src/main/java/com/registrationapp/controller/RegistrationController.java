package com.registrationapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.registrationapp.emailservice.EmailService;
import com.registrationapp.entity.Registration;
import com.registrationapp.service.RegistrationService;


@Controller
public class RegistrationController {
	@Autowired
	private RegistrationService registrationService;
	@Autowired
	private EmailService emailService;
	
	@GetMapping("/")
	public String home() {
		return "Home";
	}
	@GetMapping("/registration")
	public String registration() {
		return "registration";
	}
	
	
	@PostMapping("/newregistration")
	public String addRegistration(@ModelAttribute Registration registration) {
		registrationService.addRegistration(registration);
		emailService.sendSimpleMessage(registration.getEmail(), "registration", "you have sucessfully registered in our app");
		return "registration";
	}
	@GetMapping("/viewregistration")
	public String viewRegistrations(Model mod) {
		List<Registration> allRegistrations = registrationService.getAllRegistrations();
		mod.addAttribute("allregistrations",allRegistrations);
		return "viewRegistration";
	}
	@GetMapping("/deleteregistration")
	public String deleteRegistration(@RequestParam("id") int id , Model model){
		registrationService.deleteRegistration(id);
		List<Registration> allRegistrations = registrationService.getAllRegistrations();
		model.addAttribute("allregistrations",allRegistrations);
		return "viewRegistration";
	}
	@GetMapping("/updatebyid")
	public String deleteGetById(@RequestParam("id") int id , Model m){
		Registration registration = registrationService.getRegistration(id);
		m.addAttribute("registration",registration);
		return "UpdateRegistration";
	}
	@PostMapping("/updateregistration")
	public String updateRegistration(@ModelAttribute Registration registration, Model model) {
		registrationService.updateRegistration(registration);
		List<Registration> allRegistrations = registrationService.getAllRegistrations();
		model.addAttribute("allregistrations",allRegistrations);
		return "viewRegistration";
	}




	

}
