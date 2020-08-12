package com.spring.flight.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "`ticket_type`")
public class TicketType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_type_id")
    private long ticketTypeId;

    @Column(name = "ticket_class")
    private String ticketClass;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "available_tickets_number")
    private int availableTicketsNumber;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumns({
            @JoinColumn(name = "flight_name", referencedColumnName = "flight_name") ,
            @JoinColumn(name = "departure_time", referencedColumnName = "departure_time")})
    private Flight flight;

    public TicketType () {
    }

    public long getTicketTypeId () {
        return ticketTypeId;
    }

    public void setTicketTypeId ( long ticketTypeId ) {
        this.ticketTypeId = ticketTypeId;
    }

    public String getTicketClass () {
        return ticketClass;
    }

    public void setTicketClass ( String ticketClass ) {
        this.ticketClass = ticketClass;
    }

    public BigDecimal getPrice () {
        return price;
    }

    public void setPrice ( BigDecimal price ) {
        this.price = price;
    }

    public int getAvailableTicketsNumber () {
        return availableTicketsNumber;
    }

    public void setAvailableTicketsNumber ( int availableTicketsNumber ) {
        this.availableTicketsNumber = availableTicketsNumber;
    }

    public Flight getFlight () {
        return flight;
    }

    public void setFlight ( Flight flight ) {
        this.flight = flight;
    }
}

