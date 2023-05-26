package com.integrador.descub.controller;

import com.integrador.descub.model.Scan;
import com.integrador.descub.service.ScanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mural")
public class ScanController {

    @Autowired
    ScanService scanService;

    @RequestMapping(value = "getMurales")
    public List<Scan> getMurales(){
        return scanService.getMurales();
    }

    //@RequestMapping(value = "getMurales/{id_usuario}")
    //public Scan getScan(@PathVariable Long id_usuario){ return scanService.getMurales(id_usuario);}

    @RequestMapping(value = "getMuralesId/{id_mural}")
    public Scan getScanMural(@PathVariable Long id_mural){ return scanService.getMuralesId(id_mural);}



}
