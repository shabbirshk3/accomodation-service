package com.discover.mapper;

import org.mapstruct.Mapper;

import com.discover.model.entity.PassengerAccomodationDetails;
import com.discover.model.request.PassengerAccomodationDetailsRequest;
import com.discover.model.response.PassengerAccomodationDetailsResponse;

@Mapper
public interface AccomodationDetailsMapper {
	
	public PassengerAccomodationDetails  toEntity(PassengerAccomodationDetailsRequest passengerAccomodationDetailsRequest);
	public PassengerAccomodationDetailsResponse  toVo(PassengerAccomodationDetails passengerAccomodationDetails);
}
