package com.discover.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.discover.exception.NotFoundException;
import com.discover.model.request.PassengerAccomodationDetailsRequest;
import com.discover.model.response.PassengerAccomodationDetailsResponse;
import com.discover.service.AccomodationService;

@RestController
@CrossOrigin
@RequestMapping("/accomodation-service")
public class AccomodationController {
	
	@Autowired
	private AccomodationService accomodationService;
	
	@PostMapping("/addaccomodationdetails")
	public boolean addAccomodationDetails(@RequestBody @Valid PassengerAccomodationDetailsRequest passengerAccomodationDetailsRequest) {
		
		return accomodationService.addPassengerAccomodationDetails(passengerAccomodationDetailsRequest);
	}
	
	@GetMapping("/getaccomodationdetails/{passengerId}")
	public ResponseEntity<PassengerAccomodationDetailsResponse> getAccomodationDetails(@PathVariable String passengerId) {
		PassengerAccomodationDetailsResponse accomodationDetails = null;
		try {
			accomodationDetails = accomodationService.getPassengerAccomodationDetails(passengerId);
		} catch (NotFoundException exception) {
			return new ResponseEntity<>(accomodationDetails, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(accomodationDetails, HttpStatus.OK);
	}

}
