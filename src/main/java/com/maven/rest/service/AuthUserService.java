package com.maven.rest.service;

import com.maven.rest.model.UserDetails;

public interface AuthUserService {

	public boolean validateUser(UserDetails userDetails);
}
