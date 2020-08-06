package com.spring.flight.repository;

import com.spring.flight.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ICountryRepository extends JpaRepository<Country, Long> {
    Optional<Country> findCountryByCountryName ( String countryName );

}
