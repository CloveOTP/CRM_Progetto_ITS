package com.dZotti.Crm_ITS.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dZotti.Crm_ITS.models.Ticket;
import com.dZotti.Crm_ITS.repository.TicketRepository;
import com.dZotti.Crm_ITS.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

  @Autowired
  TicketRepository ticketRepository;

  @Override
  public List<Ticket> getAllTicket() {
    List<Ticket> ticketList = new ArrayList<>();
    for (Ticket ticket : ticketRepository.findAll()) {
      ticketList.add(ticket);
    }
    return ticketList;
  }

}
