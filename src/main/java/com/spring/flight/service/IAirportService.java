package com.spring.flight.service;

import com.spring.flight.entity.Airport;

import java.util.Optional;

public interface IAirportService {
    Optional<Airport> getAirportById ( long id );

    Optional<Airport> getAirportByAirportName ( String airportName );

    void add ( Airport airport );
}
