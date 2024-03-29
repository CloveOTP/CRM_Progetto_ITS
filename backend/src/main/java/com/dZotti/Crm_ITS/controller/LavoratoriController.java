package com.dZotti.Crm_ITS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dZotti.Crm_ITS.models.Lavoratori;
import com.dZotti.Crm_ITS.service.LavoratoriService;

@RestController
@RequestMapping("/lavoratori")
public class LavoratoriController {
  @Autowired
  LavoratoriService lavoratoriService;

  @GetMapping(value = "/all")
  public ResponseEntity<List<Lavoratori>> getLavoratori() {
    return ResponseEntity.ok(lavoratoriService.getAllLavoratori());
  }

  @PostMapping(value = "/save")
  public ResponseEntity<Lavoratori> saveLavoratori(@RequestBody Lavoratori lavoratore) {
    return ResponseEntity.ok(lavoratoriService.saveLavoratore(lavoratore));
  }

}
