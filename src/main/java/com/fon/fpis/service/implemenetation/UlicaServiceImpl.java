package com.fon.fpis.service.implemenetation;

import com.fon.fpis.dao.UlicaRepository;
import com.fon.fpis.domain.dto.UlicaDTO;
import com.fon.fpis.domain.mapper.UlicaMapper;
import com.fon.fpis.service.interfaces.UlicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UlicaServiceImpl implements UlicaService {

    @Autowired
    private UlicaRepository ulicaRepository;

    @Override
    public List<UlicaDTO> vratiSveUlice() {
        return UlicaMapper.entitiesToUlicaDTOs(ulicaRepository.findAll());
    }

    @Override
    public List<UlicaDTO> vratiUlice(int postanskiBroj) {
        return UlicaMapper.entitiesToUlicaDTOs(ulicaRepository.vratiUliceGrada(postanskiBroj));
    }
}
