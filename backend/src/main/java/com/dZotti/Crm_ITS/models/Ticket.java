package com.dZotti.Crm_ITS.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Ticket {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence-generator")
  @SequenceGenerator(name = "sequence-generator", sequenceName = "ticket_seq", allocationSize = 1)
  @Column(name = "id")
  private long id;
  private String titolo;
  private Date data_creazione;
  private Date data_modifica;

  @ManyToOne
  private Lavoratori lavoratori;

  @ManyToOne
  private Stato stato;

  @ManyToOne
  private Segnalatore segnalatore;

  @ManyToOne
  private Categoria categoria;

  Ticket() {
  }

  Ticket(String titolo, Lavoratori lavoratori, Stato stato, Segnalatore segnalatore, Categoria categoria) {
    this.titolo = titolo;
    this.lavoratori = lavoratori;
    this.stato = stato;
    this.segnalatore = segnalatore;
    this.categoria = categoria;
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
   * @return the titolo
   */
  public String getTitolo() {
    return titolo;
  }

  /**
   * @param titolo the titolo to set
   */
  public void setTitolo(String titolo) {
    this.titolo = titolo;
  }

  /**
   * @return the data_creazione
   */
  public Date getData_creazione() {
    return data_creazione;
  }

  /**
   * @param data_creazione the data_creazione to set
   */
  public void setData_creazione(Date data_creazione) {
    this.data_creazione = data_creazione;
  }

  /**
   * @return the data_modifica
   */
  public Date getData_modifica() {
    return data_modifica;
  }

  /**
   * @param data_modifica the data_modifica to set
   */
  public void setData_modifica(Date data_modifica) {
    this.data_modifica = data_modifica;
  }

  /**
   * @return the lavoratori
   */
  public Lavoratori getLavoratori() {
    return lavoratori;
  }

  /**
   * @param lavoratori the lavoratori to set
   */
  public void setLavoratori(Lavoratori lavoratori) {
    this.lavoratori = lavoratori;
  }

  public Stato getStato() {
    return stato;
  }

  public void setStato(Stato stato) {
    this.stato = stato;
  }

  public Segnalatore getSegnalatore() {
    return segnalatore;
  }

  public void setSegnalatore(Segnalatore segnalatore) {
    this.segnalatore = segnalatore;
  }

  public Categoria getCategoria() {
    return categoria;
  }

  public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
  }
}
