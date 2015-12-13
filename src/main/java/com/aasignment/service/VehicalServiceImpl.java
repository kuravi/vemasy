package com.aasignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aasignment.dao.GenericDAO;
import com.aasignment.model.Vehical;


@Service
public class VehicalServiceImpl  implements VehicalService{
	
	
	@Autowired
	GenericDAO  dao;

	public Vehical getVehical(String vehicalNumber) {
		return dao.findVehicalbyNumber(vehicalNumber);
		
	}

	public List<Vehical> getVehicalforOwner(String ownerId) {
		return dao.getAllVehicalsbyOwner(ownerId);
		
	}

	@Override
	public void updateVehical(Vehical vehical) {
		dao.updateVehical(vehical);
	}

	@Override
	public void deleteVehical(String vehicalNumber) {
		dao.deleteVehical(vehicalNumber);
		
	}
	
	

}


