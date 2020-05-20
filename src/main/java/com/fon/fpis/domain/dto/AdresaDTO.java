package com.fon.fpis.domain.dto;

import java.util.List;

public class AdresaDTO {

    private int adresaID;
    private String brojAdrese;
    private UlicaDTO ulica;
//    private List<KupacDTO> kupci;
//    private List<FakturaDTO> fakture;

    public int getAdresaID() {
        return adresaID;
    }

    public void setAdresaID(int adresaID) {
        this.adresaID = adresaID;
    }

    public String getBrojAdrese() {
        return brojAdrese;
    }

    public void setBrojAdrese(String brojAdrese) {
        this.brojAdrese = brojAdrese;
    }

    public UlicaDTO getUlica() {
        return ulica;
    }

    public void setUlica(UlicaDTO ulica) {
        this.ulica = ulica;
    }

//    public List<KupacDTO> getKupci() {
//        return kupci;
//    }
//
//    public void setKupci(List<KupacDTO> kupci) {
//        this.kupci = kupci;
//    }
}
