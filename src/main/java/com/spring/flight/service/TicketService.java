package com.spring.flight.service;


import com.spring.flight.entity.Ticket;
import com.spring.flight.repository.ITicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class TicketService implements ITicketService {
    private ITicketRepository iTicketRepository;


    @Autowired
    public TicketService ( ITicketRepository iTicketRepository ) {
        this.iTicketRepository = iTicketRepository;

    }

    public Optional<Ticket> getTicketById ( long id ) {
        return iTicketRepository.findById ( id );
    }


    @Transactional
    public void add ( Ticket ticket ) {
        iTicketRepository.save ( ticket );
    }

}
