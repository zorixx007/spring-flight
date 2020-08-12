package com.spring.flight.entity;

import javax.persistence.*;

@Entity
@Table(name = "`card`")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "card_id")
    private long cardId;

    @Column(name = "cardtype")
    private String cardType;

    @Column(name = "card_number")
    private String cardNumber;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id")
    private Customer customer;


    @Column(name = "expiration_date")
    private String expirationDate;

    @Column(name = "cvv")
    private String cvv;

    public Card () {
    }

    public long getCardId () {
        return cardId;
    }

    public void setCardId ( long cardId ) {
        this.cardId = cardId;
    }

    public String getCardType () {
        return cardType;
    }

    public void setCardType ( String cardType ) {
        this.cardType = cardType;
    }

    public String getCardNumber () {
        return cardNumber;
    }

    public void setCardNumber ( String cardNumber ) {
        this.cardNumber = cardNumber;
    }

    public Customer getCustomer () {
        return customer;
    }

    public void setCustomer ( Customer customer ) {
        this.customer = customer;
    }

    public String getExpirationDate () {
        return expirationDate;
    }

    public void setExpirationDate ( String expirationDate ) {
        this.expirationDate = expirationDate;
    }

    public String getCvv () {
        return cvv;
    }

    public void setCvv ( String cvv ) {
        this.cvv = cvv;
    }
}
