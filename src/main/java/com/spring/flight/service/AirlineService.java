package com.spring.flight.service;

import com.spring.flight.entity.Airline;
import com.spring.flight.repository.IAirlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AirlineService implements IAirlineService {
    private IAirlineRepository iAirlineRepository;


    @Autowired
    public AirlineService ( IAirlineRepository iAirlineRepository ) {
        this.iAirlineRepository = iAirlineRepository;

    }

    public Optional<Airline> getAirlineById ( long id ) {
        return iAirlineRepository.findById ( id );
    }

    public Optional<Airline> getAirlineByAirlineName ( String airlineName ) {
        return iAirlineRepository.findAirlineByAirlineName ( airlineName );
    }


    @Transactional
    public void add ( Airline airline ) {
        iAirlineRepository.save ( airline );
    }

}
