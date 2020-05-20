package com.fon.fpis.service.interfaces;

import com.fon.fpis.domain.dto.AdresaDTO;

import java.util.List;

public interface AdresaService {

    public List<AdresaDTO> vratiSveAdrese();

    public List<AdresaDTO> vratiAdrese(int postanskiBroj,String sifraUlice);
}
