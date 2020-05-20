package com.fon.fpis.service.interfaces;

import com.fon.fpis.domain.dto.StavkaFaktureDTO;

import java.util.List;

public interface StavkaFaktureService {

//    public List<StavkaFaktureDTO> vratiSveStavkeFakture();

    public boolean zapamtiStavkuFakture(StavkaFaktureDTO stavkaFaktureDTO);

//    eventualno ovde oko parametra razmisli da li menjas nesto
    public void izbrisiStavkuFakture(int brojSF,String sifraFakture);
}
