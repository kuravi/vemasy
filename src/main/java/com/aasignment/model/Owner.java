package com.aasignment.model;

import java.io.Serializable;
import java.util.Date;

public class Owner implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userId;
	private String userName;
	private String firstName;
	private String lastName;
	private String driverLiceneNumber;
	private String nic;
	private String companyName;
	private Date reNewDate;
	
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDriverLiceneNumber() {
		return driverLiceneNumber;
	}
	public void setDriverLiceneNumber(String driverLiceneNumber) {
		this.driverLiceneNumber = driverLiceneNumber;
	}
	public String getNic() {
		return nic;
	}
	public void setNic(String nic) {
		this.nic = nic;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Date getReNewDate() {
		return reNewDate;
	}
	public void setReNewDate(Date reNewDate) {
		this.reNewDate = reNewDate;
	}
	
	

}
