package com.spring.flight.entity;

import javax.persistence.*;

@Entity
@Table(name = "`airport`")
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "airport_id")
    private long airportID;
    @Column(name = "iata")
    private String iata;
    @Column(name = "airport_name")
    private String airportName;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "city_id")
    private City city;

    public Airport () {
    }

    public long getAirportID () {
        return airportID;
    }

    public void setAirportID ( long airportID ) {
        this.airportID = airportID;
    }

    public String getIata () {
        return iata;
    }

    public void setIata ( String iata ) {
        this.iata = iata;
    }

    public String getAirportName () {
        return airportName;
    }

    public void setAirportName ( String airportName ) {
        this.airportName = airportName;
    }

    public City getCity () {
        return city;
    }

    public void setCity ( City city ) {
        this.city = city;
    }
}
