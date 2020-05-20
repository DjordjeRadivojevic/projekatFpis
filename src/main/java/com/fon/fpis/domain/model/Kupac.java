package com.fon.fpis.domain.model;

import javax.persistence.*;

@Entity
public class Kupac {

    @Id
    @Column(name = "PIB")
    private String pib;

    @Column(name = "NAZIVKUPCA")
    private String nazivKupca;

    @Column(name = "EMAILKUPCA")
    private String emailKupca;

    @Column(name = "TELEFONKUPCA")
    private String telefonKupca;

    @Column(name = "POTPIS")
    private String potpis;

    @ManyToOne
    @JoinColumns(value = {
            @JoinColumn(name = "POSTANSKIBROJ",referencedColumnName = "POSTANSKIBROJ",nullable = false),
            @JoinColumn(name = "SIFRAULICE",referencedColumnName = "SIFRAULICE",nullable = false),
            @JoinColumn(name = "ADRESAID",referencedColumnName = "ADRESAID",nullable = false)
    })
    private Adresa adresa;

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String getNazivKupca() {
        return nazivKupca;
    }

    public void setNazivKupca(String nazivKupca) {
        this.nazivKupca = nazivKupca;
    }

    public String getEmailKupca() {
        return emailKupca;
    }

    public void setEmailKupca(String emailKupca) {
        this.emailKupca = emailKupca;
    }

    public String getTelefonKupca() {
        return telefonKupca;
    }

    public void setTelefonKupca(String telefonKupca) {
        this.telefonKupca = telefonKupca;
    }

    public String getPotpis() {
        return potpis;
    }

    public void setPotpis(String potpis) {
        this.potpis = potpis;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

}
