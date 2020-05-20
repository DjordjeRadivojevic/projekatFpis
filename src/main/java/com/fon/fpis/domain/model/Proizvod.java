package com.fon.fpis.domain.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Proizvod {

    @Id
    @Column(name = "SIFRAPROIZVODA")
    private String sifraproizvoda;

    @Column(name = "NAZIVPROIZVODA")
    private String nazivProizvoda;

    @Column(name = "IZNOSPROIZVODA")
    private int iznosProizvoda;

    @ManyToOne
    @JoinColumn(name = "FABRIKAID",referencedColumnName = "FABRIKAID")
    private Fabrika fabrika;

    @ManyToOne
    @JoinColumn(name = "JMID",referencedColumnName = "JMID")
    private JedinicaMere jedinicaMere;

    @OneToMany(mappedBy = "proizvod")
    private List<StavkaFakture> stavkeFakture;

    public String getSifraproizvoda() {
        return sifraproizvoda;
    }

    public void setSifraproizvoda(String sifraproizvoda) {
        this.sifraproizvoda = sifraproizvoda;
    }

    public String getNazivProizvoda() {
        return nazivProizvoda;
    }

    public void setNazivProizvoda(String nazivProizvoda) {
        this.nazivProizvoda = nazivProizvoda;
    }

    public int getIznosProizvoda() {
        return iznosProizvoda;
    }

    public void setIznosProizvoda(int iznosProizvoda) {
        this.iznosProizvoda = iznosProizvoda;
    }

    public Fabrika getFabrika() {
        return fabrika;
    }

    public void setFabrika(Fabrika fabrika) {
        this.fabrika = fabrika;
    }

    public JedinicaMere getJedinicaMere() {
        return jedinicaMere;
    }

    public void setJedinicaMere(JedinicaMere jedinicaMere) {
        this.jedinicaMere = jedinicaMere;
    }

    public List<StavkaFakture> getStavkeFakture() {
        return stavkeFakture;
    }

    public void setStavkeFakture(List<StavkaFakture> stavkeFakture) {
        this.stavkeFakture = stavkeFakture;
    }
}
