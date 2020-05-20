package com.fon.fpis.domain.dto;

import com.fon.fpis.domain.enums.Status;

public class StavkaFaktureDTO {

    private int brojSF;
    private String opis;
    private int ean;
    private int kolicina;
    private FakturaDTO faktura;
    private ProizvodDTO proizvod;
    private Status status;

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

    public FakturaDTO getFaktura() {
        return faktura;
    }

    public void setFaktura(FakturaDTO faktura) {
        this.faktura = faktura;
    }

    public ProizvodDTO getProizvod() {
        return proizvod;
    }

    public void setProizvod(ProizvodDTO proizvod) {
        this.proizvod = proizvod;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
