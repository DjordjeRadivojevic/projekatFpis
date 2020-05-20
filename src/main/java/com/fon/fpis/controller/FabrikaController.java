package com.fon.fpis.controller;

import com.fon.fpis.domain.dto.FabrikaDTO;
import com.fon.fpis.service.interfaces.FabrikaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "fabrika")
public class FabrikaController {

    @Autowired
    private FabrikaService fabrikaService;

    @GetMapping(value = "svi")
    public List<FabrikaDTO> vratiSveFabrike() {
        return fabrikaService.vratiSveFabrike();
    }
}
