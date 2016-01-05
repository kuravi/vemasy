package com.aasignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aasignment.dao.GenericDAO;
import com.aasignment.model.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	GenericDAO dao;

	@Override
	public User userLogin(String userId) {
		return dao.loginUser(userId);
	}
	
	

}
