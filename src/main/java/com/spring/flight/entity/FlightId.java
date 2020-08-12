package com.spring.flight.entity;

import com.spring.flight.util.LocalDateAttributeConverter;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class FlightId implements Serializable {

    @Column(name = "flight_name")
    private String flightName;

    @Convert(converter = LocalDateAttributeConverter.class)
    @Column(name = "departure_time")
    private LocalDate departureTime;

    public FlightId () {
    }

    public FlightId ( String flightName , LocalDate departureTime ) {
        this.flightName = flightName;
        this.departureTime = departureTime;
    }

    public String getFlightName () {
        return flightName;
    }

    public LocalDate getDepartureTime () {
        return departureTime;
    }

    public void setFlightName ( String flightName ) {
        this.flightName = flightName;
    }

    public void setDepartureTime ( LocalDate departureTime ) {
        this.departureTime = departureTime;
    }

    @Override
    public boolean equals ( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass ( ) != o.getClass ( ) ) return false;

        FlightId flightId = (FlightId) o;

        if ( !flightName.equals ( flightId.flightName ) ) return false;
        return departureTime.equals ( flightId.departureTime );
    }

    @Override
    public int hashCode () {
        return Objects.hash(getFlightName(), getDepartureTime());
    }
}
