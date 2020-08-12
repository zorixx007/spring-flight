package com.spring.flight.service;

import com.spring.flight.entity.Customer;

import java.util.Optional;

public interface ICustomerService {
    Optional<Customer> getCustomerById ( long id );

    Optional<Customer> getCustomerByEmail ( String email );

    void add ( Customer customer );
}
