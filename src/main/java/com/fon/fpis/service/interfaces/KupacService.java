package com.fon.fpis.service.interfaces;

import com.fon.fpis.domain.dto.KupacDTO;

import java.util.List;

public interface KupacService {

    public List<KupacDTO> vratiSveKupce();

    public List<KupacDTO> pronadjiKupce(String podaci);

    public KupacDTO vratiKupca(String pib);

    public boolean zapamtiKupca(KupacDTO kupacDto);

    public void izbrisiKupca(String pib);
}
