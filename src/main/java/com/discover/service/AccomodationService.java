package com.discover.service;


import com.discover.model.request.PassengerAccomodationDetailsRequest;
import com.discover.model.response.PassengerAccomodationDetailsResponse;

public interface AccomodationService {
	
	public boolean addPassengerAccomodationDetails(PassengerAccomodationDetailsRequest passengerAccomodationDetailsRequest);
	
	public PassengerAccomodationDetailsResponse getPassengerAccomodationDetails(String passengerId);

}
