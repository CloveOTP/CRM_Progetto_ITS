package com.dZotti.Crm_ITS.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dZotti.Crm_ITS.models.Categoria;
import com.dZotti.Crm_ITS.repository.CategoriaRepository;
import com.dZotti.Crm_ITS.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {

  @Autowired
  CategoriaRepository categoriaRepository;

  @Override
  public List<Categoria> getAllCategoria() {
    List<Categoria> categorias = new ArrayList<>();
    for (Categoria categoria : categoriaRepository.findAll()) {
      categorias.add(categoria);
    }
    return categorias;
  }

  @Override
  public Categoria saveCategoria(Categoria categoria) {
    return categoriaRepository.save(categoria);
  }

}
