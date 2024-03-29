package com.dZotti.Crm_ITS.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dZotti.Crm_ITS.models.Lavoratori;
import com.dZotti.Crm_ITS.repository.LavoratoriRepository;
import com.dZotti.Crm_ITS.service.LavoratoriService;

@Service
public class LavoratoriServiceImpl implements LavoratoriService {

  @Autowired
  LavoratoriRepository lavoratoriRepository;

  @Override
  public List<Lavoratori> getAllLavoratori() {
    List<Lavoratori> lavoratori = new ArrayList<>();
    for (Lavoratori lavoratore : lavoratoriRepository.findAll()) {
      lavoratori.add(lavoratore);
    }
    return lavoratori;
  }

  @Override
  public Lavoratori saveLavoratore(Lavoratori lavoratore) {
    return lavoratoriRepository.save(lavoratore);
  }

}
