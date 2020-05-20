package com.fon.fpis.domain.dto;

public class KupacDTO {

    private String pib;
    private String nazivKupca;
    private String emailKupca;
    private String telefonKupca;
    private String potpis;
    private AdresaDTO adresa;

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String getNazivKupca() {
        return nazivKupca;
    }

    public void setNazivKupca(String nazivKupca) {
        this.nazivKupca = nazivKupca;
    }

    public String getEmailKupca() {
        return emailKupca;
    }

    public void setEmailKupca(String emailKupca) {
        this.emailKupca = emailKupca;
    }

    public String getTelefonKupca() {
        return telefonKupca;
    }

    public void setTelefonKupca(String telefonKupca) {
        this.telefonKupca = telefonKupca;
    }

    public String getPotpis() {
        return potpis;
    }

    public void setPotpis(String potpis) {
        this.potpis = potpis;
    }

    public AdresaDTO getAdresa() {
        return adresa;
    }

    public void setAdresa(AdresaDTO adresa) {
        this.adresa = adresa;
    }
}
