package com.fon.fpis.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name = "NACINISPORUKE")
public class NacinIsporuke {

    @Id
    @Column(name = "NIID")
    private int niID;

    @Column(name = "TIPNACINAISPORUKE")
    private String tipNacinaIsporuke;

    @OneToMany(mappedBy = "nacinIsporuke")
    private List<Faktura> fakture;

    public int getNiID() {
        return niID;
    }

    public void setNiID(int niID) {
        this.niID = niID;
    }

    public String getTipNacinaIsporuke() {
        return tipNacinaIsporuke;
    }

    public void setTipNacinaIsporuke(String tipNacinaIsporuke) {
        this.tipNacinaIsporuke = tipNacinaIsporuke;
    }

    public List<Faktura> getFakture() {
        return fakture;
    }

    public void setFakture(List<Faktura> fakture) {
        this.fakture = fakture;
    }
}
