package com.spring.flight.service;

import com.spring.flight.entity.TicketType;

import java.util.Optional;

public interface ITicketTypeService {
    Optional<TicketType> getTicketTypeById ( long id );

    void add ( TicketType ticketType );
}