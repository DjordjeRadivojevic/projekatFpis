package com.fon.fpis.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Fabrika {

    @Id
    @Column(name = "FABRIKAID")
    private int fabrikaID;

    @Column(name = "NAZIVFABRIKE")
    private String nazivFabrike;

    @OneToMany(mappedBy = "fabrika")
    private List<Proizvod> proizvodi;

    public int getFabrikaID() {
        return fabrikaID;
    }

    public void setFabrikaID(int fabrikaID) {
        this.fabrikaID = fabrikaID;
    }

    public String getNazivFabrike() {
        return nazivFabrike;
    }

    public void setNazivFabrike(String nazivFabrike) {
        this.nazivFabrike = nazivFabrike;
    }

    public List<Proizvod> getProizvodi() {
        return proizvodi;
    }

    public void setProizvodi(List<Proizvod> proizvodi) {
        this.proizvodi = proizvodi;
    }
}
