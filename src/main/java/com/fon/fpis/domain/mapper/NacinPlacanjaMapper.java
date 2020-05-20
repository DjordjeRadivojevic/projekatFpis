package com.fon.fpis.domain.mapper;

import com.fon.fpis.domain.dto.NacinPlacanjaDTO;
import com.fon.fpis.domain.model.NacinPlacanja;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NacinPlacanjaMapper {

    private NacinPlacanjaMapper(){

    }

    public static List<NacinPlacanjaDTO> entitiesToNacinPlacanjaDTOs(List<NacinPlacanja> entities) {
        if (entities == null || entities.isEmpty()) {
            return Collections.emptyList();
        }
        return entities.stream().map(NacinPlacanjaMapper::entityToNacinPlacanjaDTO).collect(Collectors.toList());
    }

    public static NacinPlacanjaDTO entityToNacinPlacanjaDTO(NacinPlacanja entity) {
        // TODO: set missing dto properties if needed
        NacinPlacanjaDTO dto = new NacinPlacanjaDTO();
        dto.setNpID(entity.getNpID());
        dto.setVrstaPlacanja(entity.getVrstaPlacanja());
        return dto;
    }

    public static NacinPlacanja dtoToNacinPlacanja(NacinPlacanjaDTO dto) {
        // TODO: set missing nacinPlacanja properties if needed
        NacinPlacanja nacinPlacanja = new NacinPlacanja();
        if(dto.getNpID() >0) {
            nacinPlacanja.setNpID(dto.getNpID());
        }
        nacinPlacanja.setVrstaPlacanja(dto.getVrstaPlacanja());
        return nacinPlacanja;
    }
}
