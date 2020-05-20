package com.fon.fpis.service.implemenetation;

import com.fon.fpis.dao.ProizvodRepository;
import com.fon.fpis.domain.dto.ProizvodDTO;
import com.fon.fpis.domain.mapper.ProizvodMapper;
import com.fon.fpis.service.interfaces.ProizvodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProizvodServiceImpl implements ProizvodService {

    @Autowired
    private ProizvodRepository proizvodRepository;

    @Override
    public List<ProizvodDTO> vratiSveProizvode() {
        return ProizvodMapper.entitiesToProizvodDTOs(proizvodRepository.findAll());
    }
}
