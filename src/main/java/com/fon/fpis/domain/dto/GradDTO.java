package com.fon.fpis.domain.dto;

import java.util.List;

public class GradDTO {

    private int postanskiBroj;
    private String nazivGrada;
//    ovo da zapamtim da u dto idem u dubinu ali samo u smeru ManyToOne tj samo kad objekat ima objekat u sebi
//    a nikako da imam liste bilo kakvih objekata
//    ali mozda i treba za one komboboxeve ali to da vidim na frontu, pa ako treba onda da ovo sve odkomentarisem
//    a da odem u mapere i da setujem ove liste donjih objekata u sebi mada dijagram sekvenci
//    kaze da kad se odabere ulica zove se servis za adrese, ne pre
//    private List<UlicaDTO> ulice;

    public int getPostanskiBroj() {
        return postanskiBroj;
    }

    public void setPostanskiBroj(int postanskiBroj) {
        this.postanskiBroj = postanskiBroj;
    }

    public String getNazivGrada() {
        return nazivGrada;
    }

    public void setNazivGrada(String nazivGrada) {
        this.nazivGrada = nazivGrada;
    }

//    public List<UlicaDTO> getUlice() {
//        return ulice;
//    }
//
//    public void setUlice(List<UlicaDTO> ulice) {
//        this.ulice = ulice;
//    }
}
