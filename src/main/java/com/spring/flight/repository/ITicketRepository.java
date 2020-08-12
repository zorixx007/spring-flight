package com.spring.flight.repository;

import com.spring.flight.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITicketRepository extends JpaRepository<Ticket, Long> {


}
