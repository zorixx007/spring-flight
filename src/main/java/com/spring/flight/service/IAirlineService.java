package com.spring.flight.service;

import com.spring.flight.entity.Airline;

import java.util.Optional;

public interface IAirlineService {
    Optional<Airline> getAirlineById ( long id );

    Optional<Airline> getAirlineByAirlineName ( String airlineName );

    void add ( Airline airline );
}

