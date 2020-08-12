package com.spring.flight.entity;

import javax.persistence.*;

@Entity
@Table(name = "`ticket`")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id")
    private long ticketId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ticket_type_id")
    private TicketType ticketType;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String LastName;

    @Column(name = "title")
    private String title;

    @Column(name = "status")
    private String status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "transaction_id")
    private Transaction transaction;

    public Ticket () {
    }

    public long getTicketId () {
        return ticketId;
    }

    public void setTicketId ( long ticketId ) {
        this.ticketId = ticketId;
    }

    public TicketType getTicketType () {
        return ticketType;
    }

    public void setTicketType ( TicketType ticketType ) {
        this.ticketType = ticketType;
    }

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName ( String firstName ) {
        this.firstName = firstName;
    }

    public String getLastName () {
        return LastName;
    }

    public void setLastName ( String lastName ) {
        LastName = lastName;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle ( String title ) {
        this.title = title;
    }

    public String getStatus () {
        return status;
    }

    public void setStatus ( String status ) {
        this.status = status;
    }

    public Transaction getTransaction () {
        return transaction;
    }

    public void setTransaction ( Transaction transaction ) {
        this.transaction = transaction;
    }
}
