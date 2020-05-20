package com.fon.fpis.domain.mapper;

import com.fon.fpis.domain.dto.KupacDTO;
import com.fon.fpis.domain.model.Kupac;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class KupacMapper {

    private KupacMapper() {};

    public static List<KupacDTO> entitiesToKupacDTOs(List<Kupac> entities) {
        if(entities == null || entities.isEmpty()) {
            return Collections.emptyList();
        }
        return entities.stream().map(KupacMapper::entityToKupacDTO).collect(Collectors.toList());
    }

    public static KupacDTO entityToKupacDTO(Kupac entity) {
        // TODO: set missing dto properties if needed
        KupacDTO dto = new KupacDTO();
        dto.setPib(entity.getPib());
        dto.setNazivKupca(entity.getNazivKupca());
        dto.setEmailKupca(entity.getEmailKupca());
        dto.setTelefonKupca(entity.getTelefonKupca());
        dto.setPotpis(entity.getPotpis());
        dto.setAdresa(AdresaMapper.entityToAdresaDTO(entity.getAdresa()));
        return dto;
    }

    public static Kupac dtoToKupac(KupacDTO dto) {
        // TODO: set missing kupac properties if needed
        Kupac kupac = new Kupac();
        if(dto.getPib() !=null) {
            kupac.setPib(dto.getPib());
        }
        kupac.setNazivKupca(dto.getNazivKupca());
        kupac.setEmailKupca(dto.getEmailKupca());
        kupac.setTelefonKupca(dto.getTelefonKupca());
        kupac.setPotpis(dto.getPotpis());
        kupac.setAdresa(AdresaMapper.dtoToAdresa(dto.getAdresa()));
        return kupac;
    }
}
