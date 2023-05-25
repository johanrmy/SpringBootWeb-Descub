package com.integrador.descub.controller;

import com.integrador.descub.model.Paleta;
import com.integrador.descub.service.PaletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("paleta")
public class PaletaController {

    @Autowired
    PaletaService paletaService;

    @RequestMapping(value = "getPaleta/{id_mural}")
    public Paleta getPaleta(@PathVariable Long id_mural){ return paletaService.getPaleta(id_mural); }


}
