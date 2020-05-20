package com.fon.fpis.service.implemenetation;

import com.fon.fpis.dao.StavkaFaktureRepository;
import com.fon.fpis.domain.dto.StavkaFaktureDTO;
import com.fon.fpis.domain.mapper.StavkaFaktureMapper;
import com.fon.fpis.domain.model.StavkaFakture;
import com.fon.fpis.service.interfaces.StavkaFaktureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StavkaFaktureServiceImpl implements StavkaFaktureService {

    @Autowired
    private StavkaFaktureRepository stavkaFaktureRepository;

//    @Override
//    public List<StavkaFaktureDTO> vratiSveStavkeFakture() {
//        return StavkaFaktureMapper.entitiesToStavkaFaktureDTOs(stavkaFaktureRepository.findAll());
//    }

    @Override
    public boolean zapamtiStavkuFakture(StavkaFaktureDTO stavkaFaktureDTO) {
        stavkaFaktureRepository.save(StavkaFaktureMapper.dtoToStavkaFakture(stavkaFaktureDTO));
        return true;
    }

    @Override
    public void izbrisiStavkuFakture(int brojSF,String sifraFakture) {
        stavkaFaktureRepository.deleteById(new StavkaFakture.StavkaFaktureID(brojSF,sifraFakture));
    }
}
