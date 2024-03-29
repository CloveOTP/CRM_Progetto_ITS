package com.dZotti.Crm_ITS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dZotti.Crm_ITS.models.Ticket;
import com.dZotti.Crm_ITS.service.TicketService;

@RestController
@RequestMapping("/ticket")
public class TicketController {
  @Autowired
  TicketService ticketService;

  @GetMapping(value = "/all")
  public ResponseEntity<List<Ticket>> getTicket() {
    return ResponseEntity.ok(ticketService.getAllTicket());
  }

}
