package com.fon.fpis.domain.model;

import com.fon.fpis.domain.dto.FakturaDTO;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "STAVKAFAKTURE")
@IdClass(value = StavkaFakture.StavkaFaktureID.class)
public class StavkaFakture {

    @Id
    @Column(name = "BROJSF")
    private int brojSF;

    @Column(name = "OPIS")
    private String opis;

    @Column(name = "EAN")
    private int ean;

    @Column(name = "KOLICINA")
    private int kolicina;

    @Id
    @ManyToOne
    @JoinColumn(name = "SIFRAFAKTURE",referencedColumnName = "SIFRAFAKTURE",nullable = false)
    private Faktura faktura;

    @ManyToOne
    @JoinColumn(name = "SIFRAPROIZVODA",referencedColumnName = "SIFRAPROIZVODA",nullable = false)
    private Proizvod proizvod;

    public static class StavkaFaktureID implements Serializable {
        private int brojSF;
        private String faktura;

        public StavkaFaktureID() {
        }

        public StavkaFaktureID(int brojSF, String faktura) {
            this.brojSF = brojSF;
            this.faktura = faktura;
        }
    }

    public int getBrojSF() {
        return brojSF;
    }

    public void setBrojSF(int brojSF) {
        this.brojSF = brojSF;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public int getEan() {
        return ean;
    }

    public void setEan(int ean) {
        this.ean = ean;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    public Faktura getFaktura() {
        return faktura;
    }

    public void setFaktura(Faktura faktura) {
        this.faktura = faktura;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }
}
