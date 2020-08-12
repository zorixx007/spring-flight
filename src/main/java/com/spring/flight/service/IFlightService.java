package com.spring.flight.service;

import com.spring.flight.entity.Flight;

import java.util.Optional;

public interface IFlightService {
    Optional<Flight> getFlightByFlightId ( Flight id );

    void add ( Flight flight );
}
