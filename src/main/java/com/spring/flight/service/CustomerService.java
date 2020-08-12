package com.spring.flight.service;


import com.spring.flight.entity.Customer;
import com.spring.flight.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {
    private ICustomerRepository iCustomerRepository;


    @Autowired
    public CustomerService ( ICustomerRepository iCustomerRepository ) {
        this.iCustomerRepository = iCustomerRepository;

    }

    public Optional<Customer> getCustomerById ( long id ) {
        return iCustomerRepository.findById ( id );
    }

    public Optional<Customer> getCustomerByEmail ( String email ) {
        return iCustomerRepository.findCustomerByEmail ( email );
    }


    @Transactional
    public void add ( Customer customer ) {
        iCustomerRepository.save ( customer );
    }

}
