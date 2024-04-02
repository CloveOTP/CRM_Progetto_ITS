package com.dZotti.Crm_ITS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dZotti.Crm_ITS.models.Stato;
import com.dZotti.Crm_ITS.service.StatoService;

@RestController
@RequestMapping("/stato")
public class StatoController {
  @Autowired
  StatoService statoService;

  @GetMapping(value = "/all")
  public ResponseEntity<List<Stato>> getStato() {
    return ResponseEntity.ok(statoService.getAllStato());
  }

  @PostMapping(value = "/save")
  public ResponseEntity<Stato> saveStato(@RequestBody Stato stato) {
    return ResponseEntity.ok(statoService.saveStato(stato));
  }

}
