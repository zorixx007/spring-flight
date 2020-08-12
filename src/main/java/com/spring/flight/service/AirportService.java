package com.spring.flight.service;

import com.spring.flight.entity.Airport;
import com.spring.flight.repository.IAirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AirportService implements IAirportService {
    private IAirportRepository iAirportRepository;


    @Autowired
    public AirportService ( IAirportRepository iAirportRepository ) {
        this.iAirportRepository = iAirportRepository;

    }

    public Optional<Airport> getAirportById ( long id ) {
        return iAirportRepository.findById ( id );
    }

    public Optional<Airport> getAirportByAirportName ( String airportName ) {
        return iAirportRepository.findAirportByAirportName ( airportName );
    }


    @Transactional
    public void add ( Airport airport ) {
        iAirportRepository.save ( airport );
    }

}