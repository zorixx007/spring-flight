package com.spring.flight.entity;


import javax.persistence.*;


@Entity(name = "Flight")
@Table(name = "`flight`")
public class Flight {
    @EmbeddedId
    private FlightId id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "airline_id")
    private Airline airline;

    @Column(name = "flight_time")
    private Long flightTime;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "departure_airport_id")
    private Airport departureAirport;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "arrival_airport_id")
    private Airport arrivalAirport;

    @Column(name = "flight_status")
    private String flightStatus;


    public Flight () {
    }

    public FlightId getId () {
        return id;
    }

    public void setId ( FlightId id ) {
        this.id = id;
    }

    public Airline getAirline () {
        return airline;
    }

    public void setAirline ( Airline airline ) {
        this.airline = airline;
    }

    public Long getFlightTime () {
        return flightTime;
    }

    public void setFlightTime ( Long flightTime ) {
        this.flightTime = flightTime;
    }

    public Airport getDepartureAirport () {
        return departureAirport;
    }

    public void setDepartureAirport ( Airport departureAirport ) {
        this.departureAirport = departureAirport;
    }

    public Airport getArrivalAirport () {
        return arrivalAirport;
    }

    public void setArrivalAirport ( Airport arrivalAirport ) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getFlightStatus () {
        return flightStatus;
    }

    public void setFlightStatus ( String flightStatus ) {
        this.flightStatus = flightStatus;
    }
}
