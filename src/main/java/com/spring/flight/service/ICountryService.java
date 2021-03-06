package com.spring.flight.service;

import com.spring.flight.entity.Country;

import java.util.Optional;

public interface ICountryService {
    Optional<Country> getCountryById ( long id );
    Optional<Country> getCountryByCountryName ( String countryName );

    void add ( Country country );
}
