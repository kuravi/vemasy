package com.aasignment.dao;

/**
 * Interface for DAO s
 * first define the model object related CRUD operations here 
 */
import java.util.List;

import com.aasignment.model.User;
import com.aasignment.model.Vehical;

public interface GenericDAO {
	
	// vehical
	public Vehical findVehicalbyNumber(String id);
	public List<Vehical> getAllVehicalsbyOwner(String ownerId);
	public void updateVehical(Vehical vehical);
	public void deleteVehical(String id);
	
	
	public User loginUser(String userId);
	// owner
	
	
	//Licene
	
	//

}
