package com.spring.flight.service;
import com.spring.flight.entity.TicketType;
import com.spring.flight.repository.ITicketTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class TicketTypeService implements ITicketTypeService {
    private ITicketTypeRepository iTicketTypeRepository;


    @Autowired
    public TicketTypeService ( ITicketTypeRepository iTicketTypeRepository ) {
        this.iTicketTypeRepository = iTicketTypeRepository;

    }

    public Optional<TicketType> getTicketTypeById ( long id ) {
        return iTicketTypeRepository.findById ( id );
    }


    @Transactional
    public void add ( TicketType ticketType ) {
        iTicketTypeRepository.save ( ticketType );
    }

}