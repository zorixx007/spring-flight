package com.spring.flight.repository;

import com.spring.flight.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface ICustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findCustomerByEmail ( String email );
}