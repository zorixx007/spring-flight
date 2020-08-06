package com.spring.flight.api;

import com.github.openjson.JSONObject;
import com.spring.flight.entity.Country;
import com.spring.flight.service.CountryService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RestController
@RequestMapping("/country")
public class CountryController {
    private CountryService countryService;

    @Autowired
    public CountryController ( CountryService countryService ) {
        this.countryService = countryService;
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Country> getPost ( @PathVariable Long id ) {
        return countryService.getCountryById ( id );
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String getCountryNameFromJSON ( @RequestBody String message ) {
        JSONObject json = new JSONObject ( message );
        String countryNameFromRequest = json.getString ( "countryName" );
        if ( StringUtils.isNotBlank ( countryNameFromRequest ) ) {
            Country newCountry = new Country ( countryNameFromRequest );
            countryService.add ( newCountry );
        }
            return "done";

    }

}
