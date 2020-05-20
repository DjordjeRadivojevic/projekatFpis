package com.fon.fpis.domain.mapper;

import com.fon.fpis.domain.dto.GradDTO;
import com.fon.fpis.domain.dto.NacinIsporukeDTO;
import com.fon.fpis.domain.model.Grad;
import com.fon.fpis.domain.model.NacinIsporuke;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NacinIsporukeMapper {

    private NacinIsporukeMapper(){

    }

    public static List<NacinIsporukeDTO> entitiesToNacinIsporukeDTOs(List<NacinIsporuke> entities) {
        if (entities == null || entities.isEmpty()) {
            return Collections.emptyList();
        }
        return entities.stream().map(NacinIsporukeMapper::entityToNacinIsporukeDTO).collect(Collectors.toList());
    }

    public static NacinIsporukeDTO entityToNacinIsporukeDTO(NacinIsporuke entity) {
        // TODO: set missing dto properties if needed
        NacinIsporukeDTO dto = new NacinIsporukeDTO();
        dto.setNiID(entity.getNiID());
        dto.setTipNacinaIsporuke(entity.getTipNacinaIsporuke());
        return dto;
    }

    public static NacinIsporuke dtoToNacinIsporuke(NacinIsporukeDTO dto) {
        // TODO: set missing nacinIsporuke properties if needed
        NacinIsporuke nacinIsporuke = new NacinIsporuke();
        if(dto.getNiID() >0) {
            nacinIsporuke.setNiID(dto.getNiID());
        }
        nacinIsporuke.setTipNacinaIsporuke(dto.getTipNacinaIsporuke());
        return nacinIsporuke;
    }
}
