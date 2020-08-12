package com.spring.flight.service;

import com.spring.flight.entity.Transaction;
import com.spring.flight.repository.ITransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class TransactionService implements ITransactionService {
    private ITransactionRepository iTransactionRepository;


    @Autowired
    public TransactionService ( ITransactionRepository iTransactionRepository ) {
        this.iTransactionRepository = iTransactionRepository;

    }

    public Optional<Transaction> getTransactionById ( long id ) {
        return iTransactionRepository.findById ( id );
    }


    @Transactional
    public void add ( Transaction transaction ) {
        iTransactionRepository.save ( transaction );
    }

}
