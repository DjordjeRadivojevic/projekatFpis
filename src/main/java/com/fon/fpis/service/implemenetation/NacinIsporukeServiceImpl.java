package com.fon.fpis.service.implemenetation;

import com.fon.fpis.dao.NacinIsporukeRepository;
import com.fon.fpis.domain.dto.NacinIsporukeDTO;
import com.fon.fpis.domain.mapper.NacinIsporukeMapper;
import com.fon.fpis.service.interfaces.NacinIsporukeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NacinIsporukeServiceImpl implements NacinIsporukeService {

    @Autowired
    private NacinIsporukeRepository nacinIsporukeRepository;

    @Override
    public List<NacinIsporukeDTO> vratiSveNacineIsporuke() {
        return NacinIsporukeMapper.entitiesToNacinIsporukeDTOs(nacinIsporukeRepository.findAll());
    }
}
