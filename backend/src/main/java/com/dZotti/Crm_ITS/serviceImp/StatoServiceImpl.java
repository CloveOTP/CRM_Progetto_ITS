package com.dZotti.Crm_ITS.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dZotti.Crm_ITS.models.Stato;
import com.dZotti.Crm_ITS.repository.StatoRepository;
import com.dZotti.Crm_ITS.service.StatoService;

@Service
public class StatoServiceImpl implements StatoService {

  @Autowired
  StatoRepository StatoRepository;

  @Override
  public List<Stato> getAllStato() {
    List<Stato> Statos = new ArrayList<>();
    for (Stato Stato : StatoRepository.findAll()) {
      Statos.add(Stato);
    }
    return Statos;
  }

  @Override
  public Stato saveStato(Stato stato) {
    return StatoRepository.save(stato);
  }

}
