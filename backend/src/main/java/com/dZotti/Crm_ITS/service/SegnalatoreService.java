package com.dZotti.Crm_ITS.service;

import java.util.List;

import com.dZotti.Crm_ITS.models.Segnalatore;

public interface SegnalatoreService {

  public List<Segnalatore> getAll();

  public Segnalatore saveSegnalatore(Segnalatore segnalatore);

}
