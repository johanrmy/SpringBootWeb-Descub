package com.integrador.descub.controller;

import com.integrador.descub.model.Paleta;
import com.integrador.descub.service.PaletaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("paleta")
@CrossOrigin(origins = "http://localhost:5173")
public class PaletaController {

    @Autowired
    PaletaService paletaService;

    @RequestMapping(value = "getPaletaMural/{id_mural}")
    public List<Paleta> getPaletaMural(@PathVariable Long id_mural){
        return paletaService.getPaletaMural(id_mural);
    }


}
