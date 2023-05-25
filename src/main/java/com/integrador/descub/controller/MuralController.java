package com.integrador.descub.controller;

import com.integrador.descub.model.Mural;
import com.integrador.descub.service.MuralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mural")
public class MuralController {

    @Autowired
    MuralService muralService;

    @RequestMapping(value = "getAllMurales")
    public List<Mural> getAllMurales(){
        return muralService.getAllMurales();
    }

    @RequestMapping(value = "getMural/{id}")
    public Mural getMural(@PathVariable Long id){ return muralService.getMural(id); }


}
