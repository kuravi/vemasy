package com.aasignment.controller;


/**
 * The following class is the entry point for the web service for vehicle object related 
 * opertaions.
 * This class uses Autowired to load service class for service requirements.
 */

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aasignment.model.Vehical;
import com.aasignment.service.VehicalService;

@Controller
public class VehicalController {
	private static final Logger logger = LoggerFactory.getLogger(VehicalController.class);
	
	
	@Autowired
	private VehicalService vehicalService;
	
	
	/**
	 * This method to get a specific vehical
	 * @param vehId 
	 * @return
	 */  
	
	@RequestMapping(value = "/rest/vehical/{id}", method = RequestMethod.GET)
	public @ResponseBody Vehical getVehical(@PathVariable("id") String vehicalNo) {
		logger.info(" getVehical for id : "+vehicalNo);	
		return vehicalService.getVehical(vehicalNo);
	}
	
	
	
	
	@RequestMapping(value = "/rest/getVehicalbyOwner/{ownerId}", method = RequestMethod.GET)
	public @ResponseBody List<Vehical> getVehicalbyOwner(@PathVariable("ownerId") String ownerId) {
		logger.info("Method called getVehical for id : "+ownerId);	
		return vehicalService.getVehicalforOwner(ownerId);
		
		
	}
	
	/*@RequestMapping(value = "/rest/updateVehical", method = RequestMethod.GET)
	public @ResponseBody Vehical addVehical(@PathVariable("id") Vehical vehical) {
		logger.info("Start getEmployee. ID="+vehical);
		vehicalService.updateVehical(vehical);
	}*/
	
	@RequestMapping(value = "/rest/updateVehical/{vehicalNumber}", method = RequestMethod.GET)
	public @ResponseBody Vehical updateVehical(@PathVariable("vehicalNumber") Vehical vehical) {
		logger.info("update vehical = " + vehical.toString());
		vehicalService.updateVehical(vehical);
		return vehical;
	}
	
	
	

}


	 

