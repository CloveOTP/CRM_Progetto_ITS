package com.dZotti.Crm_ITS.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Lavoratori {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence-generator")
  @SequenceGenerator(name = "sequence-generator", sequenceName = "lavoratori_seq", allocationSize = 1)
  @Column(name = "id")
  private long id;
  private String nome;
  private String cognome;
  private String email;

  Lavoratori() {
  }

  Lavoratori(String nome, String cognome, String email) {
    this.nome = nome;
    this.cognome = cognome;
    this.email = email;
  }
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
   * @return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * @param nome the nome to set
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * @return the cognome
   */
  public String getCognome() {
    return cognome;
  }

  /**
   * @param cognome the cognome to set
   */
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

}
