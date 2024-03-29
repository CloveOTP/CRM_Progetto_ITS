package com.dZotti.Crm_ITS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dZotti.Crm_ITS.models.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
