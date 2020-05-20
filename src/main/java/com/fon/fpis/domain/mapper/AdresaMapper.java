package com.fon.fpis.domain.mapper;

import com.fon.fpis.domain.dto.AdresaDTO;
import com.fon.fpis.domain.model.Adresa;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AdresaMapper {

    private AdresaMapper() {};

    public static List<AdresaDTO> entitiesToAdresaDTOs(List<Adresa> entities) {
        if(entities == null || entities.isEmpty()) {
            return Collections.emptyList();
        }
        return entities.stream().map(AdresaMapper::entityToAdresaDTO).collect(Collectors.toList());
    }

    public static AdresaDTO entityToAdresaDTO(Adresa entity) {
        // TODO: set missing dto properties if needed
        AdresaDTO dto = new AdresaDTO();
        dto.setAdresaID(entity.getAdresaID());
        dto.setBrojAdrese(entity.getBrojAdrese());
        dto.setUlica(UlicaMapper.entityToUlicaDTO(entity.getUlica()));
        return dto;
    }

    public static Adresa dtoToAdresa(AdresaDTO dto) {
        // TODO: set missing adresa properties if needed
        Adresa adresa = new Adresa();
        if(dto.getAdresaID() >0) {
            adresa.setAdresaID(dto.getAdresaID());
        }
        adresa.setBrojAdrese(dto.getBrojAdrese());
        // TODO: set missing ulica properties if needed
        adresa.setUlica(UlicaMapper.dtoToUlica(dto.getUlica()));
        return adresa;
    }
}
