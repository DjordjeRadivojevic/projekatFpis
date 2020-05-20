package com.fon.fpis.service.implemenetation;

import com.fon.fpis.dao.FakturaRepository;
import com.fon.fpis.domain.dto.FakturaDTO;
import com.fon.fpis.domain.dto.StavkaFaktureDTO;
import com.fon.fpis.domain.enums.Status;
import com.fon.fpis.domain.mapper.FakturaMapper;
import com.fon.fpis.domain.mapper.StavkaFaktureMapper;
import com.fon.fpis.domain.model.Faktura;
import com.fon.fpis.domain.model.StavkaFakture;
import com.fon.fpis.service.interfaces.FakturaService;
import com.fon.fpis.service.interfaces.StavkaFaktureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class FakturaServiceImpl implements FakturaService {

    @Autowired
    private FakturaRepository fakturaRepository;

    @Autowired
    private StavkaFaktureService stavkaFaktureService;

    @Override
    public List<FakturaDTO> vratiSveFakture() {
        return FakturaMapper.entitiesToFakturaDTOs(fakturaRepository.findAll());
    }

    @Override
    public List<FakturaDTO> pronadjiFakture(String datumPrometa) {
        try {
            System.out.println("ovo je datum "+java.sql.Date.valueOf(datumPrometa));
            return FakturaMapper.entitiesToFakturaDTOs(fakturaRepository.findByDatumPrometaFakture(
                    new SimpleDateFormat("yyyy-MM-dd").parse(datumPrometa)
                   ));
//        java.sql.Date.valueOf(datumPrometa)
        } catch (ParseException e) {
            return null;
        }
    }

    @Override
    public FakturaDTO vratiFakturu(String sifraFakture) {
        return FakturaMapper.entityToFakturaDTO(fakturaRepository.getOne(sifraFakture));
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = false)
    public boolean zapamtiFakturu(FakturaDTO fakturaDto) {
        Faktura faktura =fakturaRepository.save(FakturaMapper.dtoToFaktura(fakturaDto));
//        prethodna linija-snimi sve o fakturi ali bez liste stavki, jer u dtoToFaktura nema setovanje liste.
//        to se radi u nastavku
        List<StavkaFakture> stavkeFakture = new ArrayList<>();
        for (StavkaFaktureDTO stavkaFaktureDTO : fakturaDto.getStavkeFakture()) {
            if (stavkaFaktureDTO.getStatus() == Status.DELETE) {
                stavkaFaktureService.izbrisiStavkuFakture(stavkaFaktureDTO.getBrojSF(),fakturaDto.getSifraFakture());
            } else {
                stavkaFaktureDTO.setFaktura(FakturaMapper.entityToFakturaDTO(faktura));
                stavkaFaktureService.zapamtiStavkuFakture(stavkaFaktureDTO);
                stavkeFakture.add(StavkaFaktureMapper.dtoToStavkaFakture(stavkaFaktureDTO));
            }
        }
//        ovde se napuni lista sa stavkama pa se onda snimi opet faktura ali i sa listom stavki
        faktura.setStavkeFakture(stavkeFakture);
        fakturaRepository.save(faktura);
        return true;
    }

    @Override
    public void izbrisiFakturu(String sifraFakture) {
            fakturaRepository.deleteById(sifraFakture);
    }
}
