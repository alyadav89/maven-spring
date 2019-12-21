package com.maven.rest;

import org.springframework.stereotype.Component;

import com.maven.rest.model.UserDetails;

@Component
public class UserRepository {
	
	
	
	
	public UserDetails getUserDeatils(String userId){
		UserDetails details = null;
		System.out.println("inside getUserDeatils");
		if (userId!=null) {
			details = new UserDetails();
			if (userId.equals("ay89")) {
				details.setId(1l);
				details.setUserName("Alok");
				details.setUserId("ay89");
			}
			else if (userId.equals("py89")) {
				details.setId(1l);
				details.setUserName("Priyanka");
				details.setUserId("py89");
			}
		}
		
		return details;
	}
}
