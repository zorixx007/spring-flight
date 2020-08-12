package com.spring.flight.repository;

import com.spring.flight.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ITransactionRepository extends JpaRepository<Transaction, Long> {


}