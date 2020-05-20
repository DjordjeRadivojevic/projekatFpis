package com.fon.fpis.domain.mapper;

import com.fon.fpis.domain.dto.GradDTO;
import com.fon.fpis.domain.model.Grad;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class GradMapper {

    private GradMapper(){

    }

    public static List<GradDTO> entitiesToGradDTOs(List<Grad> entities) {
        if (entities == null || entities.isEmpty()) {
            return Collections.emptyList();
        }
        return entities.stream().map(GradMapper::entityToGradDTO).collect(Collectors.toList());
    }

    public static GradDTO entityToGradDTO(Grad entity) {
        // TODO: set missing dto properties if needed
        GradDTO dto = new GradDTO();
        dto.setPostanskiBroj(entity.getPostanskiBroj());
        dto.setNazivGrada(entity.getNazivGrada());
        return dto;
    }

    public static Grad dtoToGrad(GradDTO dto) {
        // TODO: set missing grad properties if needed
        Grad grad = new Grad();
        if(dto.getPostanskiBroj() >0) {
            grad.setPostanskiBroj(dto.getPostanskiBroj());
        }
        grad.setNazivGrada(dto.getNazivGrada());
        return grad;
    }
}
