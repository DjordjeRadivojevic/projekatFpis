package com.fon.fpis.domain.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@IdClass(value = Ulica.UlicaID.class)
public class Ulica {

//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "SIFRAULICE")
    private String sifraUlice;

    @Id
    @ManyToOne
    @JoinColumn(name = "POSTANSKIBROJ",referencedColumnName = "POSTANSKIBROJ",nullable = false)
    private Grad grad;

    @Column(name = "NAZIVULICE")
    private String nazivUlice;

    @OneToMany(mappedBy = "ulica")
    private List<Adresa> adrese;

    public static class UlicaID implements Serializable{
        private String sifraUlice;
        private int grad;

        public UlicaID() {
        }

        public UlicaID(String sifraUlice, int grad) {
            this.sifraUlice = sifraUlice;
            this.grad = grad;
        }
    }

    public String getSifraUlice() {
        return sifraUlice;
    }

    public void setSifraUlice(String sifraUlice) {
        this.sifraUlice = sifraUlice;
    }

    public Grad getGrad() {
        return grad;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    public String getNazivUlice() {
        return nazivUlice;
    }

    public void setNazivUlice(String nazivUlice) {
        this.nazivUlice = nazivUlice;
    }

    public List<Adresa> getAdrese() {
        return adrese;
    }

    public void setAdrese(List<Adresa> adrese) {
        this.adrese = adrese;
    }
}
