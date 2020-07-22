package com.spring.flight.repository;

import com.spring.flight.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICountryRepository extends JpaRepository<Country, Long> {
}
