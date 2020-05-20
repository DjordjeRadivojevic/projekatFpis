package com.fon.fpis.service.interfaces;

import com.fon.fpis.domain.dto.UlicaDTO;

import java.util.List;

public interface UlicaService {

    public List<UlicaDTO> vratiSveUlice();

    public List<UlicaDTO> vratiUlice(int postanskiBroj);
}
