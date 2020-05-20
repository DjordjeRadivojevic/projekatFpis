package com.fon.fpis.domain.model;

import com.fon.fpis.domain.enums.Stanje;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Faktura {

    @Id
    @Column(name = "SIFRAFAKTURE")
    private String sifraFakture;

    @Column(name = "DATUMPROMETA")
    @Temporal(TemporalType.DATE)
    private Date datumPrometa;

    @Column(name = "VALUTA")
    @Temporal(TemporalType.DATE)
    private Date valuta;

    @Column(name = "STANJE")
    @Enumerated(EnumType.STRING)
    private Stanje stanje;

    @ManyToOne
    @JoinColumn(name = "NIID",referencedColumnName = "NIID")
    private NacinIsporuke nacinIsporuke;

    @ManyToOne
    @JoinColumn(name = "NPID",referencedColumnName = "NPID")
    private NacinPlacanja nacinPlacanja;

    @ManyToOne
    @JoinColumn(name = "JMBG",referencedColumnName = "JMBG")
    private Zaposleni zaposleni;

    @ManyToOne
    @JoinColumns(value = {
            @JoinColumn(name = "POSTANSKIBROJ",referencedColumnName = "POSTANSKIBROJ",nullable = false),
            @JoinColumn(name = "SIFRAULICE",referencedColumnName = "SIFRAULICE",nullable = false),
            @JoinColumn(name = "ADRESAID",referencedColumnName = "ADRESAID",nullable = false)
    })
    private Adresa adresa;

    @OneToMany(mappedBy = "faktura",cascade = CascadeType.REMOVE)
    private List<StavkaFakture> stavkeFakture;

    public String getSifraFakture() {
        return sifraFakture;
    }

    public void setSifraFakture(String sifraFakture) {
        this.sifraFakture = sifraFakture;
    }

    public Date getDatumPrometa() {
        return datumPrometa;
    }

    public void setDatumPrometa(Date datumPrometa) {
        this.datumPrometa = datumPrometa;
    }

    public Date getValuta() {
        return valuta;
    }

    public void setValuta(Date valuta) {
        this.valuta = valuta;
    }

    public Stanje getStanje() {
        return stanje;
    }

    public void setStanje(Stanje stanje) {
        this.stanje = stanje;
    }

    public NacinIsporuke getNacinIsporuke() {
        return nacinIsporuke;
    }

    public void setNacinIsporuke(NacinIsporuke nacinIsporuke) {
        this.nacinIsporuke = nacinIsporuke;
    }

    public NacinPlacanja getNacinPlacanja() {
        return nacinPlacanja;
    }

    public void setNacinPlacanja(NacinPlacanja nacinPlacanja) {
        this.nacinPlacanja = nacinPlacanja;
    }

    public Zaposleni getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(Zaposleni zaposleni) {
        this.zaposleni = zaposleni;
    }

    public List<StavkaFakture> getStavkeFakture() {
        return stavkeFakture;
    }

    public void setStavkeFakture(List<StavkaFakture> stavkeFakture) {
        this.stavkeFakture = stavkeFakture;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }
}
