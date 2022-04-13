package com.discover.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.discover.model.entity.PassengerAccomodationDetails;

@Repository
public interface AccomodationRepository extends JpaRepository<PassengerAccomodationDetails, String> {

}
