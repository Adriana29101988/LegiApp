package com.Adriana.legiapp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity // indica faptul ca e o entitate
public class Lege {

    //cheie primara
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Titel;
    private String Artikel;
    private String Inhalt;
    private String Beschreibung;
    private String Kategorie;
    private LocalDate veroeffentlichAm;


    // Constructori
    public Lege(String titel, String artikel, String inhalt, String beschreibung, String kategorie, LocalDate veroeffentlichAm) {
        Titel = titel;
        Artikel = artikel;
        Inhalt = inhalt;
        Beschreibung = beschreibung;
        Kategorie = kategorie;
        this.veroeffentlichAm = veroeffentlichAm;
    }

    public Lege() {}


    // Getteri si Setteri


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitel() {
        return Titel;
    }

    public void setTitel(String titel) {
        Titel = titel;
    }

    public String getArtikel() {
        return Artikel;
    }

    public void setArtikel(String artikel) {
        Artikel = artikel;
    }

    public String getInhalt() {
        return Inhalt;
    }

    public void setInhalt(String inhalt) {
        Inhalt = inhalt;
    }

    public String getBeschreibung() {
        return Beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        Beschreibung = beschreibung;
    }

    public String getKategorie() {
        return Kategorie;
    }

    public void setKategorie(String kategorie) {
        Kategorie = kategorie;
    }

    public LocalDate getVeroeffentlichAm() {
        return veroeffentlichAm;
    }

    public void setVeroeffentlichAm(LocalDate veroeffentlichAm) {
        this.veroeffentlichAm = veroeffentlichAm;
    }
}
