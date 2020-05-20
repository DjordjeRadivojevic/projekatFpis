package com.fon.fpis.controller;

import com.fon.fpis.domain.dto.GradDTO;
import com.fon.fpis.service.interfaces.GradService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "grad")
public class GradController {

    @Autowired
    private GradService gradService;

    @GetMapping(value = "svi")
    public List<GradDTO> vratiSveGradove(){
        return gradService.vratiSveGradove();
    }
}
