package com.spring.flight.service;

import com.spring.flight.entity.City;
import com.spring.flight.repository.ICityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CityService implements ICityService {
    private ICityRepository iCityRepository;


    @Autowired
    public CityService ( ICityRepository iCityRepository ) {
        this.iCityRepository = iCityRepository;

    }

    public Optional<City> getCityById ( long id ) {
        return iCityRepository.findById ( id );
    }

    public Optional<City> getCityByCityName ( String cityName ) {
        return iCityRepository.findCityByCityName ( cityName );
    }


    @Transactional
    public void add ( City city ) {
        iCityRepository.save ( city );
    }

}
