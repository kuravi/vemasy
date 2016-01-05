package com.aasignment.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.aasignment.dao.GenericDAO;
import com.aasignment.model.Owner;
import com.aasignment.model.User;

public class OwnerServiceImpl implements OwnerService{
	
	@Autowired
	GenericDAO dao;

	@Override
	public Owner getOwner(String ownerId) {
		return dao.ownerById(ownerId);
	}

	

	

}
