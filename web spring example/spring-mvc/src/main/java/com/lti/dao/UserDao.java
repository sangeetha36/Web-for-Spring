package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.lti.model.User;

@Component("usrDao")
public class UserDao {

	@PersistenceContext 
	private EntityManager em;
	
	@Transactional
	public void addUser(User user) {
		em.persist(user);
	}
	
	public User fetch(String email) {
		return em.find(User.class,email);
	}
}
