package com.fon.fpis.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name = "JEDINICAMERE")
public class JedinicaMere {

    @Id
    @Column(name = "JMID")
    private int jmID;

    @Column(name = "NAZIVJM")
    private String nazivJm;

    @OneToMany(mappedBy = "jedinicaMere")
    private List<Proizvod> proizvodi;

    public int getJmID() {
        return jmID;
    }

    public void setJmID(int jmID) {
        this.jmID = jmID;
    }

    public String getNazivJm() {
        return nazivJm;
    }

    public void setNazivJm(String nazivJm) {
        this.nazivJm = nazivJm;
    }

    public List<Proizvod> getProizvodi() {
        return proizvodi;
    }

    public void setProizvodi(List<Proizvod> proizvodi) {
        this.proizvodi = proizvodi;
    }
}
