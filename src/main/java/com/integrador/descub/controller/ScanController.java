package com.integrador.descub.controller;

import com.integrador.descub.model.Scan;
import com.integrador.descub.service.ScanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mural")
public class ScanController {

    @Autowired
    ScanService scanService;

    @RequestMapping(value = "getMurales/{id_usuario}")
    public Scan getScan(@PathVariable Long id_usuario){ return scanService.getMurales(id_usuario);}



}
