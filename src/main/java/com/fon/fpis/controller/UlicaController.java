package com.fon.fpis.controller;

import com.fon.fpis.domain.dto.UlicaDTO;
import com.fon.fpis.service.interfaces.UlicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "ulica")
public class UlicaController {

    @Autowired
    private UlicaService ulicaService;

    @GetMapping(value = "svi")
    public List<UlicaDTO> vratiSveUlice() {
        return ulicaService.vratiSveUlice();
    }

    @GetMapping(value = "{postanskiBroj}")
    public List<UlicaDTO> vratiUlice(@PathVariable int postanskiBroj) {
        return ulicaService.vratiUlice(postanskiBroj);
    }
}
