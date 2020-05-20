package com.fon.fpis.controller;

import com.fon.fpis.domain.dto.NacinIsporukeDTO;
import com.fon.fpis.domain.dto.ProizvodDTO;
import com.fon.fpis.service.interfaces.NacinIsporukeService;
import com.fon.fpis.service.interfaces.ProizvodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "proizvod")
public class ProizvodController {

    @Autowired
    private ProizvodService proizvodService;

    @GetMapping(value = "svi")
    public List<ProizvodDTO> vratiSveProizvode(){
        return proizvodService.vratiSveProizvode();
    }
}
