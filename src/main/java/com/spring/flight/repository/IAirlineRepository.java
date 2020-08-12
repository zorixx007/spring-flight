package com.spring.flight.repository;

import com.spring.flight.entity.Airline;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface IAirlineRepository extends JpaRepository<Airline, Long> {
    Optional<Airline> findAirlineByAirlineName ( String airlineName );
}
