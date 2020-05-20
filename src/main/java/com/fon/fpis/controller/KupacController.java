package com.fon.fpis.controller;

import com.fon.fpis.domain.dto.KupacDTO;
import com.fon.fpis.service.interfaces.KupacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "kupac")
public class KupacController {

    @Autowired
    private KupacService kupacService;

    @GetMapping(value = "svi")
    public List<KupacDTO> vratiSveKupce() {
        return kupacService.vratiSveKupce();
    }

    @GetMapping(value = "pronadji/{nazivKupca}")
    public List<KupacDTO> pronadjiKupce(@PathVariable String nazivKupca) {
        return kupacService.pronadjiKupce(nazivKupca);
    }

    @GetMapping(value = "{pib}")
    public KupacDTO vratiKupca(@PathVariable String pib) {
        return kupacService.vratiKupca(pib);
    }

    @PostMapping(value = "zapamti")
    public boolean zapamtiKupca(@RequestBody KupacDTO kupacDto) {
        return kupacService.zapamtiKupca(kupacDto);
    }

    @DeleteMapping(value = "izbrisi/{pib}")
    public void izbrisiKupca(@PathVariable String pib) {
        kupacService.izbrisiKupca(pib);
    }

    @PutMapping(value = "izmeni")
    public boolean izmeniKupca(@RequestBody KupacDTO kupacDto) {
        return kupacService.zapamtiKupca(kupacDto);
    }
}
