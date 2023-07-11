package com.integrador.descub.controller;

import com.integrador.descub.model.Mural;
import com.integrador.descub.service.MuralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("mural")
@CrossOrigin(origins = "http://localhost:5173")
public class MuralController {

    @Autowired
    MuralService muralService;

    @RequestMapping(value = "getAllMurales")
    public List<Mural> getAllMurales(){
        return muralService.getAllMurales();
    }

    @RequestMapping(value = "getMural/{id}")
    public Mural getMural(@PathVariable Integer id){ return muralService.getMural(id); }

    @GetMapping("/getMuralesByIdMuralista/{muralistaId}")
    public List<Mural> getMuralsByMuralistaId(@PathVariable Integer muralistaId) {
        return muralService.getMuralsByMuralistaId(muralistaId);
    }
}
