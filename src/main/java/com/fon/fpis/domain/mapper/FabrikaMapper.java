package com.fon.fpis.domain.mapper;

import com.fon.fpis.domain.dto.FabrikaDTO;
import com.fon.fpis.domain.model.Fabrika;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FabrikaMapper {

    private FabrikaMapper(){

    }

    public static List<FabrikaDTO> entitiesToFabrikaDTOs(List<Fabrika> entities) {
        if (entities == null || entities.isEmpty()) {
            return Collections.emptyList();
        }
        return entities.stream().map(FabrikaMapper::entityToFabrikaDTO).collect(Collectors.toList());
    }

    public static FabrikaDTO entityToFabrikaDTO(Fabrika entity) {
        // TODO: set missing dto properties if needed
        FabrikaDTO dto = new FabrikaDTO();
        dto.setFabrikaID(entity.getFabrikaID());
        dto.setNazivFabrike(entity.getNazivFabrike());
        return dto;
    }

    public static Fabrika dtoToFabrika(FabrikaDTO dto) {
        // TODO: set missing fabrika properties if needed
        Fabrika fabrika = new Fabrika();
        if(dto.getFabrikaID() > 0) {
            fabrika.setFabrikaID(dto.getFabrikaID());
        }
        fabrika.setNazivFabrike(dto.getNazivFabrike());
        return fabrika;
    }
}
