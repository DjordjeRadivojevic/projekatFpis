package com.fon.fpis.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name = "NACINPLACANJA")
public class NacinPlacanja {

    @Id
    @Column(name = "NPID")
    private int npID;

    @Column(name = "VRSTAPLACANJA")
    private String vrstaPlacanja;

    @OneToMany(mappedBy = "nacinPlacanja")
    private List<Faktura> fakture;

    public int getNpID() {
        return npID;
    }

    public void setNpID(int npID) {
        this.npID = npID;
    }

    public String getVrstaPlacanja() {
        return vrstaPlacanja;
    }

    public void setVrstaPlacanja(String vrstaPlacanja) {
        this.vrstaPlacanja = vrstaPlacanja;
    }

    public List<Faktura> getFakture() {
        return fakture;
    }

    public void setFakture(List<Faktura> fakture) {
        this.fakture = fakture;
    }
}
