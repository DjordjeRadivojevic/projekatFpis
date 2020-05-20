package com.fon.fpis.domain.dto;

import java.util.List;

public class UlicaDTO {

    private String sifraUlice;
    private String nazivUlice;
    private GradDTO grad;
//    private List<AdresaDTO> adrese;

    public String getSifraUlice() {
        return sifraUlice;
    }

    public void setSifraUlice(String sifraUlice) {
        this.sifraUlice = sifraUlice;
    }

    public String getNazivUlice() {
        return nazivUlice;
    }

    public void setNazivUlice(String nazivUlice) {
        this.nazivUlice = nazivUlice;
    }

    public GradDTO getGrad() {
        return grad;
    }

    public void setGrad(GradDTO grad) {
        this.grad = grad;
    }

//    public List<AdresaDTO> getAdrese() {
//        return adrese;
//    }
//
//    public void setAdrese(List<AdresaDTO> adrese) {
//        this.adrese = adrese;
//    }
}
