package com.fon.fpis.controller;

import com.fon.fpis.domain.dto.NacinPlacanjaDTO;
import com.fon.fpis.service.interfaces.NacinPlacanjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "nacinPlacanja")
public class NacinPlacanjaController {

    @Autowired
    private NacinPlacanjaService nacinPlacanjaService;

    @GetMapping(value = "svi")
    public List<NacinPlacanjaDTO> vratiSveNacinePlacanja(){
        return nacinPlacanjaService.vratiSveNacinePlacanja();
    }
}
