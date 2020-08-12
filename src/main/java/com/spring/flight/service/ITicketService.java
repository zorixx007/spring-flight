package com.spring.flight.service;

import com.spring.flight.entity.Ticket;

import java.util.Optional;

public interface ITicketService {
    Optional<Ticket> getTicketById ( long id );


    void add ( Ticket ticket );
}