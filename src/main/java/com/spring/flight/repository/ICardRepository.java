package com.spring.flight.repository;

import com.spring.flight.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ICardRepository extends JpaRepository<Card, Long> {
    Optional<Card> findCardByCardNumber ( String cardNumber );

}