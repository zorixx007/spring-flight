package com.spring.flight.repository;
import com.spring.flight.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface IAirportRepository extends JpaRepository<Airport, Long> {
        Optional<Airport> findAirportByAirportName ( String airportName );
}
