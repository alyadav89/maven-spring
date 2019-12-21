package com.maven.rest.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;

import com.maven.rest.model.UserDetails;

@Component
public class UserDetailsDAOImpl {

	@PersistenceContext
	private EntityManager entityManager;

	public UserDetails authenticateUser(UserDetails details) {
		String hql = "FROM UserDetails e WHERE e.userId = :userId and e.password_ = :password_";
		TypedQuery<UserDetails> query = entityManager.createQuery(hql, UserDetails.class);
		query.setParameter("userId", details.getUserId());
		query.setParameter("password_", details.getPassword_());
		UserDetails user = query.getSingleResult();
		return user;
	}
}
