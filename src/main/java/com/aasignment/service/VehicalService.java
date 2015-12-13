package com.aasignment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aasignment.model.Vehical;

@Service
public interface VehicalService {
	public Vehical getVehical(String vehicalNumber);
	public void updateVehical(Vehical vehical);
	public List<Vehical> getVehicalforOwner(String ownerId);
	public void deleteVehical(String vehicalNumber);

}
