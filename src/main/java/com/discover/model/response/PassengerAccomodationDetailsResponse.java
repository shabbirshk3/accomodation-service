package com.discover.model.response;

import javax.persistence.Entity;
import javax.persistence.Id;

public class PassengerAccomodationDetailsResponse {
	
	private String passengerId;
	private String cabinNumber;	
	private String cabinCategory;
	private String deckNumber;
	public String getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(String passengerId) {
		this.passengerId = passengerId;
	}
	public String getCabinNumber() {
		return cabinNumber;
	}
	public void setCabinNumber(String cabinNumber) {
		this.cabinNumber = cabinNumber;
	}
	public String getCabinCategory() {
		return cabinCategory;
	}
	public void setCabinCategory(String cabinCategory) {
		this.cabinCategory = cabinCategory;
	}
	public String getDeckNumber() {
		return deckNumber;
	}
	public void setDeckNumber(String deckNumber) {
		this.deckNumber = deckNumber;
	}
	

	
	

}
