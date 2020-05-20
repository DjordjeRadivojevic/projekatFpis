package com.fon.fpis.domain.mapper;

import com.fon.fpis.domain.dto.JedinicaMereDTO;
import com.fon.fpis.domain.model.JedinicaMere;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class JedinicaMereMapper {

    private JedinicaMereMapper(){

    }

    public static List<JedinicaMereDTO> entitiesToJedinicaMereDTOs(List<JedinicaMere> entities) {
        if (entities == null || entities.isEmpty()) {
            return Collections.emptyList();
        }
        return entities.stream().map(JedinicaMereMapper::entityToJedinicaMereDTO).collect(Collectors.toList());
    }

    public static JedinicaMereDTO entityToJedinicaMereDTO(JedinicaMere entity) {
        // TODO: set missing dto properties if needed
        JedinicaMereDTO dto = new JedinicaMereDTO();
        dto.setJmID(entity.getJmID());
        dto.setNazivJm(entity.getNazivJm());
        return dto;
    }

    public static JedinicaMere dtoToJedinicaMere(JedinicaMereDTO dto) {
        // TODO: set missing jedinicaMere properties if needed
        JedinicaMere jedinicaMere = new JedinicaMere();
        if(dto.getJmID() > 0) {
            jedinicaMere.setJmID(dto.getJmID());
        }
        jedinicaMere.setJmID(dto.getJmID());
        return jedinicaMere;
    }
}
