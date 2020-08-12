package com.spring.flight.repository;

import com.spring.flight.entity.Airline;
import com.spring.flight.entity.TicketType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITicketTypeRepository extends JpaRepository<TicketType, Long> {
}
