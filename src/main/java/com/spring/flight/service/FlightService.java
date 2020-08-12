package com.spring.flight.service;

import com.spring.flight.entity.Flight;
import com.spring.flight.entity.FlightId;
import com.spring.flight.repository.IFlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class FlightService implements IFlightService {
    private IFlightRepository iFlightRepository;


    @Autowired
    public FlightService ( IFlightRepository iFlightRepository ) {
        this.iFlightRepository = iFlightRepository;

    }

    public Optional<Flight> getFlightByFlightId ( Flight id ) {
        return iFlightRepository.findFlightByFlightId ( id.getId () );
    }


    @Transactional
    public void add ( Flight flight ) {
        iFlightRepository.save ( flight );
    }

}