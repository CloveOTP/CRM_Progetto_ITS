package com.dZotti.Crm_ITS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dZotti.Crm_ITS.models.Categoria;
import com.dZotti.Crm_ITS.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
  @Autowired
  CategoriaService categoriaService;

  @GetMapping(value = "/all")
  public ResponseEntity<List<Categoria>> getCategoria() {
    return ResponseEntity.ok(categoriaService.getAllCategoria());
  }

  @PostMapping(value = "/save")
  public ResponseEntity<Categoria> saveCategoria(@RequestBody Categoria categoria) {
    return ResponseEntity.ok(categoriaService.saveCategoria(categoria));
  }

}
