package com.fon.fpis.controller;

import com.fon.fpis.domain.dto.JedinicaMereDTO;
import com.fon.fpis.service.interfaces.JedinicaMereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "jedinicaMere")
public class JedinicaMereController {

    @Autowired
    private JedinicaMereService jedinicaMereService;

    @GetMapping(value = "svi")
    public List<JedinicaMereDTO> vratiSveJediniceMere() {
        return jedinicaMereService.vratiSveJediniceMere();
    }
}
