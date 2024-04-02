package com.dZotti.Crm_ITS.service;

import java.util.List;

import com.dZotti.Crm_ITS.models.Stato;

public interface StatoService {

  public List<Stato> getAllStato();

  public Stato saveStato(Stato stato);

}
