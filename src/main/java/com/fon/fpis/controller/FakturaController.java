package com.fon.fpis.controller;

import com.fon.fpis.domain.dto.FakturaDTO;
import com.fon.fpis.service.interfaces.FakturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "faktura")
public class FakturaController {

    @Autowired
    private FakturaService fakturaService;

    @GetMapping(value = "svi")
    public List<FakturaDTO> vratiSveFakture() {
        return fakturaService.vratiSveFakture();
    }

    @GetMapping(value = "pronadji/{datumPrometa}")
    public List<FakturaDTO> pronadjiFakture(@PathVariable String datumPrometa) {
        return fakturaService.pronadjiFakture(datumPrometa);
    }

    @GetMapping(value = "{sifraFakture}")
    public FakturaDTO vratiFakturu(@PathVariable String sifraFakture) {
        return fakturaService.vratiFakturu(sifraFakture);
    }

    @PostMapping(value = "zapamti")
    public boolean zapamtiFakturu(@RequestBody FakturaDTO fakturaDto) {
        return fakturaService.zapamtiFakturu(fakturaDto);
    }

    @DeleteMapping(value = "izbrisi/{sifraFakture}")
    public void izbrisiFakturu(@PathVariable String sifraFakture) {
        fakturaService.izbrisiFakturu(sifraFakture);
    }

    @PutMapping(value = "izmeni")
    public boolean izmeniFakturu(@RequestBody FakturaDTO fakturaDto) {
        return fakturaService.zapamtiFakturu(fakturaDto);
    }
}