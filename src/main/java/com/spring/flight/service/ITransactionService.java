package com.spring.flight.service;

import com.spring.flight.entity.Transaction;

import java.util.Optional;

public interface ITransactionService {
    Optional<Transaction> getTransactionById ( long id );


    void add ( Transaction transaction );
}

