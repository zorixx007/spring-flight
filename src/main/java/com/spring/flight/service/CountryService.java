package com.spring.flight.service;

import com.spring.flight.entity.Country;
import com.spring.flight.repository.ICountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CountryService implements ICountryService {

    private ICountryRepository iCountryRepository;

    @Autowired
    public CountryService ( ICountryRepository iCountryRepository ) {
        this.iCountryRepository = iCountryRepository;
    }

    public Optional<Country> getCountryById ( long id ) {
        return iCountryRepository.findById ( id );
    }

    public Optional<Country> getCountryByCountryName ( String countryName ) {
        return iCountryRepository.findCountryByCountryName ( countryName );
    }

    @Transactional
    public void add ( Country country ) {
//        if ( !country.equals ( getCountryByCountryName ( country.getCountryName ( ) ) ) ) {
            iCountryRepository.save ( country );
//        }
    }

}
