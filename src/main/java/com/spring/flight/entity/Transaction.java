package com.spring.flight.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "`transaction`")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
         private long transactionId;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "card_id")
    private Card card;


        @Column(name = "transaction_amount")
    private BigDecimal transactionAmount;

    @Column(name = "transaction_status")
    private String transactionStatus;

    public Transaction () {
    }

    public long getTransactionId () {
        return transactionId;
    }

    public void setTransactionId ( long transactionId ) {
        this.transactionId = transactionId;
    }

    public Card getCard () {
        return card;
    }

    public void setCard ( Card card ) {
        this.card = card;
    }

    public BigDecimal getTransactionAmount () {
        return transactionAmount;
    }

    public void setTransactionAmount ( BigDecimal transactionAmount ) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionStatus () {
        return transactionStatus;
    }

    public void setTransactionStatus ( String transactionStatus ) {
        this.transactionStatus = transactionStatus;
    }
}
