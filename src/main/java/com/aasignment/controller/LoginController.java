package com.aasignment.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aasignment.model.User;
import com.aasignment.service.UserService;
import com.aasignment.service.VehicalService;

@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/rest/user/{userId}", method = RequestMethod.GET)
	public @ResponseBody User userLogin(@PathVariable("userId") String userId){
		logger.info(" User id  : "+userId );
		if(userService.userLogin(userId)==null){
		return null;
		}else return userService.userLogin(userId);
	}
	
	/*@RequestMapping(value = "/rest/vehical/{id}", method = RequestMethod.GET)
	public @ResponseBody Vehical getVehical(@PathVariable("id") String vehicalNo) {
		logger.info(" getVehical for id : "+vehicalNo);	
		return vehicalService.getVehical(vehicalNo);
	}*/
	
}
