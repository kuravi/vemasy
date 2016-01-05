package com.aasignment.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aasignment.model.Owner;
import com.aasignment.service.OwnerService;;


@Controller
public class OwnerController {
	
	private static final Logger logger = LoggerFactory.getLogger(OwnerController.class);
	
	@Autowired
	private OwnerService ownerService;
	
	@RequestMapping(value = "/rest/owner/{ownerId}", method = RequestMethod.GET)
	public @ResponseBody Owner userLogin(@PathVariable("ownerId") String ownerId){
		logger.info(" User id  : "+ownerId );
			return ownerService.getOwner(ownerId);
		
	}
	

}
