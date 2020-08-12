package com.spring.flight.service;

import com.spring.flight.entity.Card;

import java.util.Optional;

public interface ICardService {
    Optional<Card> getCardById ( long id );
    Optional<Card> getCardByCardNumber ( String cardNumber );

    void add ( Card card );
}