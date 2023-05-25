package com.integrador.descub.controller;

import com.integrador.descub.model.Muralista;
import com.integrador.descub.service.MuralistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("muralista")
@CrossOrigin(origins = "http://localhost:5173")
public class MuralistaController {
    @Autowired
    MuralistaService muralistaService;

    @RequestMapping(value = "getAllMuralistas")
    public List<Muralista> getAllMuralistas(){
        return muralistaService.getAllMuralistas();
    }
    @RequestMapping(value = "getMuralista/{id}")
    public Muralista getMuralista(@PathVariable Long id){
        return muralistaService.getMuralista(id);
    }

}
