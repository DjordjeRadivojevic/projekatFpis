package com.fon.fpis.domain.mapper;

import com.fon.fpis.domain.dto.FakturaDTO;
import com.fon.fpis.domain.dto.StavkaFaktureDTO;
import com.fon.fpis.domain.model.StavkaFakture;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StavkaFaktureMapper {

    private StavkaFaktureMapper() {};

    public static List<StavkaFaktureDTO> entitiesToStavkaFaktureDTOs(List<StavkaFakture> entities) {
        if(entities == null || entities.isEmpty()) {
            return Collections.emptyList();
        }
        return entities.stream().map(StavkaFaktureMapper::entityToStavkaFaktureDTO).collect(Collectors.toList());
    }

    public static StavkaFaktureDTO entityToStavkaFaktureDTO(StavkaFakture entity) {
        // TODO: set missing dto properties if needed
        StavkaFaktureDTO dto = new StavkaFaktureDTO();
        dto.setBrojSF(entity.getBrojSF());
        dto.setEan(entity.getEan());
        dto.setOpis(entity.getOpis());
        dto.setKolicina(entity.getKolicina());
        dto.setProizvod(ProizvodMapper.entityToProizvodDTO(entity.getProizvod()));
//        ova linija dovodi do rekurzije i pucanja memorije
//        dto.setFaktura(FakturaMapper.entityToFakturaDTO(entity.getFaktura()));

//        ovo setovanje fakture i ne treba u stavci kad se vracaju podaci, jer se stavke ionako vracaju samo
//        kao lista u odredjenoj fakturi.
//        !!! a ionako pre snimanja stavke imam liniju stavkaFaktureDTO.setFaktura(FakturaMapper.entityToFakturaDTO(faktura));
//        gde setujem za svaku stavku samu fakturu, pa je takvu stavku snimam.
//        FakturaDTO fakturaDto = new FakturaDTO();
//        fakturaDto.setSifraFakture(entity.getFaktura().getSifraFakture());
//        fakturaDto.setDatumPrometa(entity.getFaktura().getDatumPrometa());
//        fakturaDto.setValuta(entity.getFaktura().getValuta());
//        fakturaDto.setNacinIsporuke(NacinIsporukeMapper.entityToNacinIsporukeDTO(entity.getFaktura().getNacinIsporuke()));
//        fakturaDto.setNacinPlacanja(NacinPlacanjaMapper.entityToNacinPlacanjaDTO(entity.getFaktura().getNacinPlacanja()));
//        fakturaDto.setZaposleni(ZaposleniMapper.entityToZaposleniDTO(entity.getFaktura().getZaposleni()));
//        fakturaDto.setAdresa(AdresaMapper.entityToAdresaDTO(entity.getFaktura().getAdresa()));
//        dto.setFaktura(fakturaDto);
        return dto;
    }

    public static StavkaFakture dtoToStavkaFakture(StavkaFaktureDTO dto) {
        // TODO: set missing stavkaFakture properties if needed
        StavkaFakture stavkaFakture = new StavkaFakture();
        if(dto.getBrojSF() >0) {
            stavkaFakture.setBrojSF(dto.getBrojSF());
        }
        stavkaFakture.setEan(dto.getEan());
        stavkaFakture.setOpis(dto.getOpis());
        stavkaFakture.setKolicina(dto.getKolicina());
//        ovde se setuje i faktura jer je to vazno za pamcenje same stavke
        stavkaFakture.setFaktura(FakturaMapper.dtoToFaktura(dto.getFaktura()));
        stavkaFakture.setProizvod(ProizvodMapper.dtoToProizvod(dto.getProizvod()));
        return stavkaFakture;
    }
    
}
