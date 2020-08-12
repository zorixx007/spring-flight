package com.spring.flight.api;

import com.github.openjson.JSONObject;
import com.spring.flight.entity.City;
import com.spring.flight.service.CityService;
import com.spring.flight.service.CountryService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RestController
@RequestMapping("/city")
public class CityController {
    private CityService cityService;
    private CountryService countryService;

    @Autowired
    public CityController ( CityService cityService , CountryService countryService ) {
        this.cityService = cityService;
        this.countryService = countryService;
    }

        @GetMapping(value = "/{id}")
        public ResponseEntity<City> getCityById ( @PathVariable Long id ) {
            return new ResponseEntity<> ( cityService.getCityById ( id ).orElse ( null ) , HttpStatus.OK );
        }
    //        try {
    //            return new ResponseEntity<> (cityService.getCityById ( id ) , HttpStatus.OK );
    //        } catch (RuntimeException e) {
    //            return new ResponseEntity<> ( HttpStatus.INTERNAL_SERVER_ERROR );
    //        }
    //    }
    //
//    @GetMapping(value = "/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    public Optional<City> getPost ( @PathVariable Long id ) {
//        return cityService.getCityById ( id );
//    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String getCityNameFromJSON ( @RequestBody String message ) {
        JSONObject json = new JSONObject ( message );
        String cityNameFromRequest = json.getString ( "cityName" );
        int timezoneOffset = json.getInt ( "timezoneOffset" );
        String country = json.getString ( "countryName" );
        if ( StringUtils.isNotBlank ( cityNameFromRequest ) ) {
            City newCity = new City ( );
            newCity.setCityName ( cityNameFromRequest );
            newCity.setTimezoneOffset ( timezoneOffset );
            newCity.setCountry ( countryService.getCountryByCountryName ( country ).orElse ( null ) );
            cityService.add ( newCity );
        }
        return "done";
    }

}