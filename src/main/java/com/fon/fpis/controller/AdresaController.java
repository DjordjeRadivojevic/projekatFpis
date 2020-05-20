package com.fon.fpis.controller;

import com.fon.fpis.domain.dto.AdresaDTO;
import com.fon.fpis.domain.dto.KupacDTO;
import com.fon.fpis.service.interfaces.AdresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "adresa")
public class AdresaController {

    @Autowired
    private AdresaService adresaService;

    @GetMapping(value = "svi")
    public List<AdresaDTO> vratiSveAdrese() {
        return adresaService.vratiSveAdrese();
    }

    @GetMapping(value = "{postanskiBroj}/{sifraUlice}")
    public List<AdresaDTO> vratiAdrese(@PathVariable int postanskiBroj,@PathVariable String sifraUlice) {
        return adresaService.vratiAdrese(postanskiBroj,sifraUlice);
    }
}
