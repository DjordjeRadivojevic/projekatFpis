package com.fon.fpis.service.implemenetation;

import com.fon.fpis.dao.GradRepository;
import com.fon.fpis.domain.dto.GradDTO;
import com.fon.fpis.domain.mapper.GradMapper;
import com.fon.fpis.service.interfaces.GradService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GradServiceImpl implements GradService {

    @Autowired
    private GradRepository gradRepository;

    @Override
    public List<GradDTO> vratiSveGradove() {
        return GradMapper.entitiesToGradDTOs(gradRepository.findAll());
    }
}
