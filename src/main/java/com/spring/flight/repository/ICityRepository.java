package com.spring.flight.repository;
import com.spring.flight.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ICityRepository extends JpaRepository<City, Long> {
    Optional<City> findCityByCityName ( String cityName );

}