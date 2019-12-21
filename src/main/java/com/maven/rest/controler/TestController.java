package com.maven.rest.controler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maven.exception.ResourceNotFoundException;
import com.maven.rest.UserRepository;
import com.maven.rest.model.UserDetails;
import com.maven.rest.repository.UserDetailsDAO;

@Controller
public class TestController {

	@Autowired
	UserRepository repo;

	@Autowired
	private UserDetailsDAO reo;
	
	@RequestMapping("/welcome")
	public String firstPage() {
		return "welcome";
	}

	/*@RequestMapping("/login")
	public String firstPage1() {
		return "login";
	}*/
	
	@GetMapping("/employees2/{id}")
	public ResponseEntity<UserDetails> getUserById(@PathVariable(value = "id") Long userId)
			throws ResourceNotFoundException {
		UserDetails employee = reo.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + userId));
		return ResponseEntity.ok().body(employee);
	}
}
