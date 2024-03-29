package com.dZotti.Crm_ITS.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Stato {

  @Id
  @GeneratedValue
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
