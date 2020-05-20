package com.fon.fpis.service.interfaces;

import com.fon.fpis.domain.dto.FakturaDTO;
import java.util.List;

public interface FakturaService {

    public List<FakturaDTO> vratiSveFakture();

//    import java.util.Date;
    public List<FakturaDTO> pronadjiFakture(String datumPrometa);

    public FakturaDTO vratiFakturu(String sifraFakture);

    public boolean zapamtiFakturu(FakturaDTO fakturaDto);

    public void izbrisiFakturu(String sifraFakture);

}
