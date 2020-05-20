package com.fon.fpis.domain.dto;

public class ProizvodDTO {

    private String sifraproizvoda;
    private String nazivProizvoda;
    private int iznosProizvoda;
    private FabrikaDTO fabrika;
    private JedinicaMereDTO jedinicaMere;

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

    public FabrikaDTO getFabrika() {
        return fabrika;
    }

    public void setFabrika(FabrikaDTO fabrika) {
        this.fabrika = fabrika;
    }

    public JedinicaMereDTO getJedinicaMere() {
        return jedinicaMere;
    }

    public void setJedinicaMere(JedinicaMereDTO jedinicaMere) {
        this.jedinicaMere = jedinicaMere;
    }
}
