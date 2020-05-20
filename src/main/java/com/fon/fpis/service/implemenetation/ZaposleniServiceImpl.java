package com.fon.fpis.service.implemenetation;

import com.fon.fpis.dao.ZaposleniRepository;
import com.fon.fpis.domain.dto.ZaposleniDTO;
import com.fon.fpis.domain.mapper.ZaposleniMapper;
import com.fon.fpis.service.interfaces.ZaposleniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZaposleniServiceImpl implements ZaposleniService {

    @Autowired
    private ZaposleniRepository zaposleniRepository;

    @Override
    public List<ZaposleniDTO> vratiSveZaposlene() {
        return ZaposleniMapper.entitiesToZaposleniDTOs(zaposleniRepository.findAll());
    }
}
