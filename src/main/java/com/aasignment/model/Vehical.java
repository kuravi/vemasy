package com.aasignment.model;

import java.io.Serializable;

/**
 * This is he model object for vehical 
 * @author Vajira
 *
 */
public class Vehical implements Serializable{

	private static final long serialVersionUID = 1L;
	private String description;
	private String number;
	private String type;
	private String ownerId;
	
	
	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public Vehical(){}
	
	public Vehical(String number, String description, String type,String ownerId) {
		super();
		this.number = number;
		this.description = description;
		this.type = type;
	}
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Vehical [description=" + description + ", number=" + number
				+ ", type=" + type + "]";
	}
		
}
