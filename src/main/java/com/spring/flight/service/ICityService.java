package com.spring.flight.service;

import com.spring.flight.entity.City;

import java.util.Optional;

public interface ICityService {
    Optional<City> getCityById ( long id );
    Optional<City> getCityByCityName ( String cityName );

    void add ( City city );
}
