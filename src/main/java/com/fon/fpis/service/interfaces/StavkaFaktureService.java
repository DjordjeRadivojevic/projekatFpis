package com.fon.fpis.service.interfaces;

import com.fon.fpis.domain.dto.StavkaFaktureDTO;

import java.util.List;

public interface StavkaFaktureService {

//    public List<StavkaFaktureDTO> vratiSveStavkeFakture();

    boolean zapamtiStavkuFakture(StavkaFaktureDTO stavkaFaktureDTO);

    void izbrisiStavkuFakture(int brojSF,String sifraFakture);
}
