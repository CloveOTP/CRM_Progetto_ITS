package com.dZotti.Crm_ITS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dZotti.Crm_ITS.models.Stato;

@Repository
public interface StatoRepository extends JpaRepository<Stato, Long> {

}
