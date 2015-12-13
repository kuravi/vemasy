package com.aasignment.dao;

import java.util.List;

import com.aasignment.model.Vehical;

public interface GenericDAO {
	
	public Vehical findVehicalbyNumber(String id);
	public List<Vehical> getAllVehicalsbyOwner(String ownerId);
	public void updateVehical(Vehical vehical);
	public void deleteVehical(String id);

}
