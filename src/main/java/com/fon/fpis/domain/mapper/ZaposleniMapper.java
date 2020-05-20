package com.fon.fpis.domain.mapper;

import com.fon.fpis.domain.dto.ZaposleniDTO;
import com.fon.fpis.domain.model.Zaposleni;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ZaposleniMapper {

    private ZaposleniMapper(){

    }

    public static List<ZaposleniDTO> entitiesToZaposleniDTOs(List<Zaposleni> entities) {
        if (entities == null || entities.isEmpty()) {
            return Collections.emptyList();
        }
        return entities.stream().map(ZaposleniMapper::entityToZaposleniDTO).collect(Collectors.toList());
    }

    public static ZaposleniDTO entityToZaposleniDTO(Zaposleni entity) {
        // TODO: set missing dto properties if needed
        ZaposleniDTO dto = new ZaposleniDTO();
        dto.setJmbg(entity.getJmbg());
        dto.setImePrezime(entity.getImePrezime());
        return dto;
    }

    public static Zaposleni dtoToZaposleni(ZaposleniDTO dto) {
        // TODO: set missing zaposleni properties if needed
        Zaposleni zaposleni = new Zaposleni();
        if(dto.getJmbg() != null) {
            zaposleni.setJmbg(dto.getJmbg());
        }
        zaposleni.setImePrezime(dto.getImePrezime());
        return zaposleni;
    }
}
