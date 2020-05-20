package com.fon.fpis.domain.mapper;

import com.fon.fpis.domain.dto.ProizvodDTO;
import com.fon.fpis.domain.model.Proizvod;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ProizvodMapper {

    private ProizvodMapper() {};

    public static List<ProizvodDTO> entitiesToProizvodDTOs(List<Proizvod> entities) {
        if(entities == null || entities.isEmpty()) {
            return Collections.emptyList();
        }
        return entities.stream().map(ProizvodMapper::entityToProizvodDTO).collect(Collectors.toList());
    }

    public static ProizvodDTO entityToProizvodDTO(Proizvod entity) {
        // TODO: set missing dto properties if needed
        ProizvodDTO dto = new ProizvodDTO();
        dto.setSifraproizvoda(entity.getSifraproizvoda());
        dto.setNazivProizvoda(entity.getNazivProizvoda());
        dto.setIznosProizvoda(entity.getIznosProizvoda());
        dto.setJedinicaMere(JedinicaMereMapper.entityToJedinicaMereDTO(entity.getJedinicaMere()));
        dto.setFabrika(FabrikaMapper.entityToFabrikaDTO(entity.getFabrika()));
        return dto;
    }

    public static Proizvod dtoToProizvod(ProizvodDTO dto) {
        // TODO: set missing proizvod properties if needed
        Proizvod proizvod = new Proizvod();
        if(dto.getSifraproizvoda() !=null) {
            proizvod.setSifraproizvoda(dto.getSifraproizvoda());
        }
        proizvod.setNazivProizvoda(dto.getNazivProizvoda());
        proizvod.setIznosProizvoda(dto.getIznosProizvoda());
//        proizvod.setJedinicaMere(JedinicaMereMapper.dtoToJedinicaMere(dto.getJedinicaMere()));
//        proizvod.setFabrika(FabrikaMapper.dtoToFabrika(dto.getFabrika()));
        return proizvod;
    }
}
