package com.maven.rest.controler;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.maven.exception.ResourceNotFoundException;
import com.maven.rest.UserRepository;
import com.maven.rest.model.UserDetails;
import com.maven.rest.repository.UserDetailsDAO;
import com.maven.rest.repository.UserDetailsDAOImpl;

@Controller
public class LoginControler {
	Logger logg = LoggerFactory.getLogger(LoginControler.class);

	@Autowired
	UserRepository repo;
	@Autowired
	private UserDetailsDAO reo;
	@Autowired
	private UserDetailsDAOImpl userDetailsDAOImpl;
	@Autowired
	private UserDetailsManager userDetailsManager;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@RequestMapping(value = "/landing", method = RequestMethod.GET)
	public String authenticateUser() {
		return "landing";
	}

	@RequestMapping("/login")
	public String firstPage() {
		logg.info("inside login");
		return "login";
	}

	@RequestMapping(value = "/user/details", method = RequestMethod.POST)
	public UserDetails user(@RequestBody String userId) {
		System.out.println("userId : " + userId);
		UserDetails details = repo.getUserDeatils(userId);
		return details;
	}

	@GetMapping("/user/{id}")
	public ResponseEntity<UserDetails> getUserById(@PathVariable(value = "id") Long userId)
			throws ResourceNotFoundException {
		UserDetails employee = reo.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + userId));
		return ResponseEntity.ok().body(employee);
	}

	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public ModelAndView submitDetails(@ModelAttribute UserDetails userId) throws ResourceNotFoundException {
		logg.info("inside submitDetails - userId : " + userId.getUserId());
		UserDetails details = userDetailsDAOImpl.authenticateUser(userId);
		logg.info("UserDetails : " + details);
		ModelAndView view = new ModelAndView();
		view.setViewName("signin");
		view.addObject("details", details);
		return view;
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public ModelAndView submitRequest(@ModelAttribute UserDetails user) throws ResourceNotFoundException {
		logg.info("inside submitRequest - userId : " + user.getUserId());
		String hashedPassword = passwordEncoder.encode(user.getPassword_());
		/*userId.setUserId(userId.getUserName());
		userId.setActive(true);
		userId.setCreatedDate(new Date());*/
		Collection<? extends GrantedAuthority> roles = Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
		User userDetails = new User(user.getUserName(), hashedPassword, roles);
		userDetailsManager.createUser(userDetails);
		//reo.save(userId);
		ModelAndView view = new ModelAndView();
		view.setViewName("login");
		return view;
	}

	@GetMapping({ "/", "/welcome" })
	public ModelAndView welcome(Model model) {
		ModelAndView view = new ModelAndView();
		view.setViewName("welcome");
		return view;
	}
}
