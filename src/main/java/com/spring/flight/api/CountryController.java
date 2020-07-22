package com.spring.flight.api;

import com.spring.flight.entity.Country;
import com.spring.flight.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RestController
@RequestMapping("/country")
public class CountryController {
    private  CountryService countryService;

    @Autowired
    public CountryController ( CountryService countryService ) {
        this.countryService = countryService;
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Country> getPost ( @PathVariable Long id ) {
        return countryService.getCountryById ( id );
    }

}
