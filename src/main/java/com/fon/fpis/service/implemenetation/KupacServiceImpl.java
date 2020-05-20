package com.fon.fpis.service.implemenetation;

import com.fon.fpis.dao.KupacRepository;
import com.fon.fpis.domain.dto.KupacDTO;
import com.fon.fpis.domain.mapper.KupacMapper;
import com.fon.fpis.service.interfaces.AdresaService;
import com.fon.fpis.service.interfaces.KupacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class KupacServiceImpl implements KupacService {

    @Autowired
    private KupacRepository kupacRepository;

    @Autowired
    private AdresaService adresaService;


    @Override
    public List<KupacDTO> vratiSveKupce() {
        return KupacMapper.entitiesToKupacDTOs(kupacRepository.findAll());
    }

    @Override
    public List<KupacDTO> pronadjiKupce(String nazivKupca) {
        return KupacMapper.entitiesToKupacDTOs(kupacRepository.findByNazivKupcaContaining(nazivKupca));
    }

    @Override
    public KupacDTO vratiKupca(String pib) {
        return KupacMapper.entityToKupacDTO(kupacRepository.getOne(pib));
    }

//    proveri da li ti se pamti i nova adresa
    @Override
    public boolean zapamtiKupca(KupacDTO kupacDto) {
        kupacRepository.save(KupacMapper.dtoToKupac(kupacDto));
//        return kupac!=null?true:false;
        return true;
    }

    @Override
    public void izbrisiKupca(String pib) {
        kupacRepository.deleteById(pib);
    }
}
