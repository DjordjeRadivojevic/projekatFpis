package com.fon.fpis.domain.mapper;

import com.fon.fpis.domain.dto.UlicaDTO;
import com.fon.fpis.domain.model.Ulica;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class UlicaMapper {

    private UlicaMapper() {};

    public static List<UlicaDTO> entitiesToUlicaDTOs(List<Ulica> entities) {
        if(entities == null || entities.isEmpty()) {
            return Collections.emptyList();
        }
        return entities.stream().map(UlicaMapper::entityToUlicaDTO).collect(Collectors.toList());
    }

    public static UlicaDTO entityToUlicaDTO(Ulica entity) {
        // TODO: set missing dto properties if needed
        UlicaDTO dto = new UlicaDTO();
        dto.setSifraUlice(entity.getSifraUlice());
        dto.setNazivUlice(entity.getNazivUlice());
        dto.setGrad(GradMapper.entityToGradDTO(entity.getGrad()));
        return dto;
    }

    public static Ulica dtoToUlica(UlicaDTO dto) {
        // TODO: set missing ulica properties if needed
        Ulica ulica = new Ulica();
        if(dto.getSifraUlice() != null) {
            ulica.setSifraUlice(dto.getSifraUlice());
        }
        ulica.setNazivUlice(dto.getNazivUlice());
        ulica.setGrad(GradMapper.dtoToGrad(dto.getGrad()));
        return ulica;
    }
}
