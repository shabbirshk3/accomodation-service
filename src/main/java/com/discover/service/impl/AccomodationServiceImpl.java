package com.discover.service.impl;

import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.discover.exception.NotFoundException;
import com.discover.mapper.AccomodationDetailsMapper;
import com.discover.mapper.AccomodationDetailsMapperImpl;
import com.discover.model.entity.PassengerAccomodationDetails;
import com.discover.model.request.PassengerAccomodationDetailsRequest;
import com.discover.model.response.PassengerAccomodationDetailsResponse;
import com.discover.repository.AccomodationRepository;
import com.discover.service.AccomodationService;

@Service
public class AccomodationServiceImpl implements AccomodationService {

	@Autowired
	private AccomodationRepository accomodationRepository;

	private AccomodationDetailsMapper accomodationDetailsMapper = Mappers.getMapper(AccomodationDetailsMapper.class);

	private static final Logger logger = LoggerFactory.getLogger(AccomodationServiceImpl.class);

	@Override
	public boolean addPassengerAccomodationDetails(
			PassengerAccomodationDetailsRequest passengerAccomodationDetailsRequest) {
		try {
			accomodationRepository.save(accomodationDetailsMapper.toEntity(passengerAccomodationDetailsRequest));
			return true;
		} catch (Exception exception) {
			logger.debug("Exception while saving Accomodation details");
		}
		return false;
	}

	@Override
	public PassengerAccomodationDetailsResponse getPassengerAccomodationDetails(String passengerId)
			throws NotFoundException {
		PassengerAccomodationDetailsResponse passengerAccomodationDetailsResponse = new PassengerAccomodationDetailsResponse();
		PassengerAccomodationDetails accomodationDetails = null;
		try {
			accomodationDetails = accomodationRepository.findById(passengerId).get();
		} catch (Exception exception) {
			logger.debug("Accomodation details not found for the passenger: " + passengerId);
			throw new NotFoundException("Accomodation details not found for the passenger");
		}
		if (accomodationDetails != null) {
			passengerAccomodationDetailsResponse = accomodationDetailsMapper.toVo(accomodationDetails);
		}
		return passengerAccomodationDetailsResponse;
	}

}
