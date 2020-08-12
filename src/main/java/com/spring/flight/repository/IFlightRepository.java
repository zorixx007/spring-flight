package com.spring.flight.repository;

import com.spring.flight.entity.Flight;
import com.spring.flight.entity.FlightId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface IFlightRepository extends JpaRepository<Flight, Long> {
    Optional<Flight> findFlightByFlightId ( FlightId flightId );
}