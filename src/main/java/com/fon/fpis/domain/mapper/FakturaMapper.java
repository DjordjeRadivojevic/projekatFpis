package com.fon.fpis.domain.mapper;

import com.fon.fpis.domain.dto.FakturaDTO;
import com.fon.fpis.domain.model.Faktura;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FakturaMapper {

    private FakturaMapper() {};

    public static List<FakturaDTO> entitiesToFakturaDTOs(List<Faktura> entities) {
        if(entities == null || entities.isEmpty()) {
            return Collections.emptyList();
        }
        return entities.stream().map(FakturaMapper::entityToFakturaDTO).collect(Collectors.toList());
    }

    public static FakturaDTO entityToFakturaDTO(Faktura entity) {
        // TODO: set missing dto properties if needed
        FakturaDTO dto = new FakturaDTO();
        dto.setSifraFakture(entity.getSifraFakture());
        dto.setDatumPrometa(entity.getDatumPrometa());
        dto.setValuta(entity.getValuta());
        dto.setStanje(entity.getStanje());
        dto.setNacinIsporuke(NacinIsporukeMapper.entityToNacinIsporukeDTO(entity.getNacinIsporuke()));
        dto.setNacinPlacanja(NacinPlacanjaMapper.entityToNacinPlacanjaDTO(entity.getNacinPlacanja()));
        dto.setZaposleni(ZaposleniMapper.entityToZaposleniDTO(entity.getZaposleni()));
        dto.setAdresa(AdresaMapper.entityToAdresaDTO(entity.getAdresa()));
        dto.setStavkeFakture(StavkaFaktureMapper.entitiesToStavkaFaktureDTOs(entity.getStavkeFakture()));
        return dto;
    }

    public static Faktura dtoToFaktura(FakturaDTO dto) {
        // TODO: set missing faktura properties if needed
        Faktura faktura = new Faktura();
        if(dto.getSifraFakture() != null) {
            faktura.setSifraFakture(dto.getSifraFakture());
        }
        faktura.setDatumPrometa(dto.getDatumPrometa());
        faktura.setValuta(dto.getValuta());
        faktura.setStanje(dto.getStanje());
        faktura.setNacinPlacanja(NacinPlacanjaMapper.dtoToNacinPlacanja(dto.getNacinPlacanja()));
        faktura.setNacinIsporuke(NacinIsporukeMapper.dtoToNacinIsporuke(dto.getNacinIsporuke()));
        faktura.setZaposleni(ZaposleniMapper.dtoToZaposleni(dto.getZaposleni()));
        faktura.setAdresa(AdresaMapper.dtoToAdresa(dto.getAdresa()));
//        prvo se dto prebaci u model, pa se snimi u bazu, bez liste stavki, a onda se svaka stavka
//        posle snima, gde se dto stavke setuje faktura pa se snimi, a onda se lista modela stavki
//        setuje na model fakture koji smo snimili, pa je opet snimimo ali sada sa setovanom listom.
//        faktura.setStavkeFakture(StavkaFaktureMapper.dtosToStavkeFakture(dto.getStavkeFakture()));
        return faktura;
    }
}
