package com.fon.fpis.controller;

import com.fon.fpis.domain.dto.ZaposleniDTO;
import com.fon.fpis.service.interfaces.ZaposleniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "zaposleni")
public class ZaposleniController {

    @Autowired
    private ZaposleniService zaposleniService;

    @GetMapping(value = "svi")
    public List<ZaposleniDTO> vratiSveZaposlene(){
        return zaposleniService.vratiSveZaposlene();
    }
}
