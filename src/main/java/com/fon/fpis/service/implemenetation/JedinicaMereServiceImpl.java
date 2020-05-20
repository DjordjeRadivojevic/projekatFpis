package com.fon.fpis.service.implemenetation;

import com.fon.fpis.dao.JedinicaMereRepository;
import com.fon.fpis.domain.dto.JedinicaMereDTO;
import com.fon.fpis.domain.mapper.JedinicaMereMapper;
import com.fon.fpis.service.interfaces.JedinicaMereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JedinicaMereServiceImpl implements JedinicaMereService {

    @Autowired
    private JedinicaMereRepository jedinicaMereRepository;

    @Override
    public List<JedinicaMereDTO> vratiSveJediniceMere() {
        return JedinicaMereMapper.entitiesToJedinicaMereDTOs(jedinicaMereRepository.findAll());
    }
}
