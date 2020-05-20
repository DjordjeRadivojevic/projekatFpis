package com.fon.fpis.controller;

import com.fon.fpis.domain.dto.NacinIsporukeDTO;
import com.fon.fpis.service.interfaces.NacinIsporukeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "nacinIsporuke")
public class NacinIsporukeController {

    @Autowired
    private NacinIsporukeService nacinIsporukeService;

    @GetMapping(value = "svi")
    public List<NacinIsporukeDTO> vratiSveNacineIsporuka(){
        return nacinIsporukeService.vratiSveNacineIsporuke();
    }
}
