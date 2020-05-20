package com.fon.fpis.service.implemenetation;

import com.fon.fpis.dao.NacinPlacanjaRepository;
import com.fon.fpis.domain.dto.NacinPlacanjaDTO;
import com.fon.fpis.domain.mapper.NacinPlacanjaMapper;
import com.fon.fpis.service.interfaces.NacinPlacanjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NacinPlacanjaServiceImpl implements NacinPlacanjaService {

    @Autowired
    private NacinPlacanjaRepository nacinPlacanjaRepository;

    @Override
    public List<NacinPlacanjaDTO> vratiSveNacinePlacanja() {
        return NacinPlacanjaMapper.entitiesToNacinPlacanjaDTOs(nacinPlacanjaRepository.findAll());
    }
}
