package com.fon.fpis.service.implemenetation;

import com.fon.fpis.dao.FabrikaRepository;
import com.fon.fpis.domain.dto.FabrikaDTO;
import com.fon.fpis.domain.mapper.FabrikaMapper;
import com.fon.fpis.service.interfaces.FabrikaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FabrikaServiceImpl implements FabrikaService {

    @Autowired
    private FabrikaRepository fabrikaRepository;

    @Override
    public List<FabrikaDTO> vratiSveFabrike() {
        return FabrikaMapper.entitiesToFabrikaDTOs(fabrikaRepository.findAll());
    }
}
