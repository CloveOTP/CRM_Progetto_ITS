package com.dZotti.Crm_ITS.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Stato {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence-generator")
  @SequenceGenerator(name = "sequence-generator", sequenceName = "stato_seq", allocationSize = 1)
  @Column(name = "id")
  private long id;
  private String stato;

  /**
   * @return the id
   */
  public long getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(long id) {
    this.id = id;
  }

  /**
   * @return the stato
   */
  public String getStato() {
    return stato;
  }

  /**
   * @param stato the stato to set
   */
  public void setStato(String stato) {
    this.stato = stato;
  }

}
