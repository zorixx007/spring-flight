package com.spring.flight.entity;

import javax.persistence.*;


@Entity
@Table(name = "`country`")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private long countryID;
    @Column(name = "country", unique = true)
    private String countryName;

    public Country () {
    }

    public Country ( String countryName ) {
        this.countryName = countryName;
    }

    public long getCountryID () {
        return countryID;
    }

    public void setCountryID ( long countryID ) {
        this.countryID = countryID;
    }

    public String getCountryName () {
        return countryName;
    }

    public void setCountryName ( String countryName ) {
        this.countryName = countryName;
    }


}