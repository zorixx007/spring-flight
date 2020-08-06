package com.spring.flight.entity;
import javax.persistence.*;

@Entity
@Table(name = "`city`")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private long cityID;
    @Column(name = "city_name")
    private String cityName;
    @Column(name = "timezone_offset")
    private int timezoneOffset;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id")
    private Country country;

    public City () {
    }

    public long getCityID () {
        return cityID;
    }

    public void setCityID ( long cityID ) {
        this.cityID = cityID;
    }

    public String getCityName () {
        return cityName;
    }

    public void setCityName ( String cityName ) {
        this.cityName = cityName;
    }

    public int getTimezoneOffset () {
        return timezoneOffset;
    }

    public void setTimezoneOffset ( int timezoneOffset ) {
        this.timezoneOffset = timezoneOffset;
    }

    public Country getCountry () {
        return country;
    }

    public void setCountry ( Country country ) {
        this.country = country;
    }
}
