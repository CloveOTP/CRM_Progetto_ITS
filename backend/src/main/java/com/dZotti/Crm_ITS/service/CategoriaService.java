package com.dZotti.Crm_ITS.service;

import java.util.List;

import com.dZotti.Crm_ITS.models.Categoria;

public interface CategoriaService {

  public List<Categoria> getAllCategoria();

  public Categoria saveCategoria(Categoria categoria);

}
