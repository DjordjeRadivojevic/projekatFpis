package com.fon.fpis.service.implemenetation;

import com.fon.fpis.dao.AdresaRepository;
import com.fon.fpis.domain.dto.AdresaDTO;
import com.fon.fpis.domain.mapper.AdresaMapper;
import com.fon.fpis.service.interfaces.AdresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdresaServiceImpl implements AdresaService {

    @Autowired
    private AdresaRepository adresaRepository;

    @Override
    public List<AdresaDTO> vratiSveAdrese() {
        return AdresaMapper.entitiesToAdresaDTOs(adresaRepository.findAll());
    }

    @Override
    public List<AdresaDTO> vratiAdrese(int postanskiBroj, String sifraUlice) {
        return AdresaMapper.entitiesToAdresaDTOs(adresaRepository.vratiAdreseUlice(postanskiBroj, sifraUlice));
    }
}
