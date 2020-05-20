package com.fon.fpis.controller;

import com.fon.fpis.service.interfaces.StavkaFaktureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "stavkaFakture")
public class StavkaFaktureController {

    @Autowired
    private StavkaFaktureService stavkaFaktureService;

//    proveriti ali milsim da ovde ne treba nista jer se ovo ne gadja zasebno od fakture nikad
}
