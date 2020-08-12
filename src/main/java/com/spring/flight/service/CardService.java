package com.spring.flight.service;

import com.spring.flight.entity.Card;
import com.spring.flight.repository.ICardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CardService implements ICardService {
    private ICardRepository iCardRepository;


    @Autowired
    public CardService ( ICardRepository iCardRepository ) {
        this.iCardRepository = iCardRepository;

    }

    public Optional<Card> getCardById ( long id ) {
        return iCardRepository.findById ( id );
    }

    public Optional<Card> getCardByCardNumber ( String cardName ) {
        return iCardRepository.findCardByCardNumber ( cardName );
    }


    @Transactional
    public void add ( Card card ) {
        iCardRepository.save ( card );
    }

}