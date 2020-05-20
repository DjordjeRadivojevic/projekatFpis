package com.fon.fpis.domain.dto;

import com.fon.fpis.domain.enums.Stanje;
import java.util.Date;
import java.util.List;

public class FakturaDTO {

    private String sifraFakture;
    private Date datumPrometa;
    private Date valuta;
    private Stanje stanje;
    private NacinIsporukeDTO nacinIsporuke;
    private NacinPlacanjaDTO nacinPlacanja;
    private ZaposleniDTO zaposleni;
    private AdresaDTO adresa;
    private List<StavkaFaktureDTO> stavkeFakture;

    public String getSifraFakture() {
        return sifraFakture;
    }

    public void setSifraFakture(String sifraFakture) {
        this.sifraFakture = sifraFakture;
    }

    public Date getDatumPrometa() {
        return datumPrometa;
    }

    public void setDatumPrometa(Date datumPrometa) {
        this.datumPrometa = datumPrometa;
    }

    public Date getValuta() {
        return valuta;
    }

    public void setValuta(Date valuta) {
        this.valuta = valuta;
    }

    public Stanje getStanje() {
        return stanje;
    }

    public void setStanje(Stanje stanje) {
        this.stanje = stanje;
    }

    public NacinIsporukeDTO getNacinIsporuke() {
        return nacinIsporuke;
    }

    public void setNacinIsporuke(NacinIsporukeDTO nacinIsporuke) {
        this.nacinIsporuke = nacinIsporuke;
    }

    public NacinPlacanjaDTO getNacinPlacanja() {
        return nacinPlacanja;
    }

    public void setNacinPlacanja(NacinPlacanjaDTO nacinPlacanja) {
        this.nacinPlacanja = nacinPlacanja;
    }

    public ZaposleniDTO getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(ZaposleniDTO zaposleni) {
        this.zaposleni = zaposleni;
    }

    public AdresaDTO getAdresa() {
        return adresa;
    }

    public void setAdresa(AdresaDTO adresa) {
        this.adresa = adresa;
    }

    public List<StavkaFaktureDTO> getStavkeFakture() {
        return stavkeFakture;
    }

    public void setStavkeFakture(List<StavkaFaktureDTO> stavkeFakture) {
        this.stavkeFakture = stavkeFakture;
    }
}
