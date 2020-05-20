package com.fon.fpis.domain.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@IdClass(value = Adresa.AdresaID.class)
public class Adresa {

//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ADRESAID")
    private int adresaID;

    @Column(name = "BROJADRESE")
    private String brojAdrese;

    @Id
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "POSTANSKIBROJ",referencedColumnName = "POSTANSKIBROJ",nullable = false),
            @JoinColumn(name = "SIFRAULICE",referencedColumnName = "SIFRAULICE",nullable = false)
    })
    private Ulica ulica;

    @OneToMany(mappedBy = "adresa")
    private List<Kupac> kupci;

    @OneToMany(mappedBy = "adresa")
    private List<Faktura> fakture;

    public static class AdresaID implements Serializable{
//        ovde se stavljaju pod imenom objekta koji se private Ulica ulica; referencira, tj gde imam ManyToOne
//        zapravo promenljive koje su tipa primarnog kljuca koji odgovara objektu koji se referencira
//        i naravno deo pk od same klase tj adresaID a sve to mora da gadja imena atributa klase na koju se odnosi
//        ovaj slozeni kljuc.
        private int adresaID;
        private Ulica.UlicaID ulica;

        public AdresaID() {
        }

        public AdresaID(int adresaID, Ulica.UlicaID ulica) {
            this.adresaID=adresaID;
            this.ulica = ulica;
        }
    }

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

    public Ulica getUlica() {
        return ulica;
    }

    public void setUlica(Ulica ulica) {
        this.ulica = ulica;
    }

    public List<Kupac> getKupci() {
        return kupci;
    }

    public void setKupci(List<Kupac> kupci) {
        this.kupci = kupci;
    }
}
