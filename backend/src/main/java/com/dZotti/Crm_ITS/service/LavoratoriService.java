package com.dZotti.Crm_ITS.service;

import java.util.List;

import com.dZotti.Crm_ITS.models.Lavoratori;

public interface LavoratoriService {

  public List<Lavoratori> getAllLavoratori();

  public Lavoratori saveLavoratore(Lavoratori lavoratore);
}
