package com.spring.flight.service;

import com.spring.flight.entity.Country;
import com.spring.flight.repository.ICountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryService implements ICountryService {

    private ICountryRepository iCountryRepository;

//    @Autowired
    public CountryService ( ICountryRepository iCountryRepository ) {
        this.iCountryRepository = iCountryRepository;
    }

    public Optional<Country> getCountryById ( long id ) {
        return iCountryRepository.findById ( id );
    }


}
