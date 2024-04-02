package com.dZotti.Crm_ITS.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dZotti.Crm_ITS.models.Segnalatore;
import com.dZotti.Crm_ITS.repository.SegnalatoreRepository;
import com.dZotti.Crm_ITS.service.SegnalatoreService;

@Service
public class SegnalatoreServiceImpl implements SegnalatoreService {

  @Autowired
  SegnalatoreRepository SegnalatoreRepository;

  @Override
  public List<Segnalatore> getAll() {
    List<Segnalatore> segnalatores = new ArrayList<>();
    for (Segnalatore segnalatore : SegnalatoreRepository.findAll()) {
      segnalatores.add(segnalatore);
    }
    return segnalatores;
  }

  @Override
  public Segnalatore saveSegnalatore(Segnalatore segnalatore) {
    return SegnalatoreRepository.save(segnalatore);
  }

}
