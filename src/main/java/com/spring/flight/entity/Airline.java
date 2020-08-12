package com.spring.flight.entity;

import javax.persistence.*;

@Entity
@Table(name = "`airline`")
public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "airline_id")
    private long airlineID;
    @Column(name = "airline_name")
    private String airlineName;

    public Airline () {
    }

    public long getAirlineID () {
        return airlineID;
    }

    public void setAirlineID ( long airlineID ) {
        this.airlineID = airlineID;
    }

    public String getAirlineName () {
        return airlineName;
    }

    public void setAirlineName ( String airlineName ) {
        this.airlineName = airlineName;
    }
}
