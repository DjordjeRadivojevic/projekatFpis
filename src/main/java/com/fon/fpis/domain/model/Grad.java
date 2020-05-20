package com.fon.fpis.domain.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Grad {

    @Id
    @Column(name = "POSTANSKIBROJ")
    private int postanskiBroj;

    @Column(name = "NAZIVGRADA")
    private String nazivGrada;

    @OneToMany(mappedBy = "grad")
    private List<Ulica> ulice;

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

    public List<Ulica> getUlice() {
        return ulice;
    }

    public void setUlice(List<Ulica> ulice) {
        this.ulice = ulice;
    }
}
