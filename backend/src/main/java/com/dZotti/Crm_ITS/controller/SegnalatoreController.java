package com.dZotti.Crm_ITS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dZotti.Crm_ITS.models.Segnalatore;
import com.dZotti.Crm_ITS.service.SegnalatoreService;

@RestController
@RequestMapping("/segnalatore")
public class SegnalatoreController {
  @Autowired
  SegnalatoreService segnalatoreService;

  @GetMapping(value = "/all")
  public ResponseEntity<List<Segnalatore>> getSegnalatore() {
    return ResponseEntity.ok(segnalatoreService.getAll());
  }

  @PostMapping(value = "/save")
  public ResponseEntity<Segnalatore> saveSegnalatore(@RequestBody Segnalatore segnalatore) {
    return ResponseEntity.ok(segnalatoreService.saveSegnalatore(segnalatore));
  }

}
