package com.discover.mapper;

import com.discover.model.entity.PassengerAccomodationDetails;
import com.discover.model.request.PassengerAccomodationDetailsRequest;
import com.discover.model.response.PassengerAccomodationDetailsResponse;
import javax.annotation.Generated;

import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-07T19:45:56+0530",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 17.0.2 (Eclipse Adoptium)"
)
public class AccomodationDetailsMapperImpl implements AccomodationDetailsMapper {

    @Override
    public PassengerAccomodationDetails toEntity(PassengerAccomodationDetailsRequest passengerAccomodationDetailsRequest) {
        if ( passengerAccomodationDetailsRequest == null ) {
            return null;
        }

        PassengerAccomodationDetails passengerAccomodationDetails = new PassengerAccomodationDetails();

        passengerAccomodationDetails.setPassengerId( passengerAccomodationDetailsRequest.getPassengerId() );
        passengerAccomodationDetails.setCabinNumber( passengerAccomodationDetailsRequest.getCabinNumber() );
        passengerAccomodationDetails.setCabinCategory( passengerAccomodationDetailsRequest.getCabinCategory() );
        passengerAccomodationDetails.setDeckNumber( passengerAccomodationDetailsRequest.getDeckNumber() );

        return passengerAccomodationDetails;
    }

    @Override
    public PassengerAccomodationDetailsResponse toVo(PassengerAccomodationDetails passengerAccomodationDetails) {
        if ( passengerAccomodationDetails == null ) {
            return null;
        }

        PassengerAccomodationDetailsResponse passengerAccomodationDetailsResponse = new PassengerAccomodationDetailsResponse();

        passengerAccomodationDetailsResponse.setPassengerId( passengerAccomodationDetails.getPassengerId() );
        passengerAccomodationDetailsResponse.setCabinNumber( passengerAccomodationDetails.getCabinNumber() );
        passengerAccomodationDetailsResponse.setCabinCategory( passengerAccomodationDetails.getCabinCategory() );
        passengerAccomodationDetailsResponse.setDeckNumber( passengerAccomodationDetails.getDeckNumber() );

        return passengerAccomodationDetailsResponse;
    }
}
