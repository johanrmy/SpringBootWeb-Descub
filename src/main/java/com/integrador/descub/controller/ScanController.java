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

    @RequestMapping(value = "getMuralesIdUsuario/{id_usuario}")
    public List<Scan> getMuralesIdUsuario(@PathVariable Long id_usuario){return scanService.getMuralesIdUsuario(id_usuario);}

    @RequestMapping(value = "getMuralesIdMural/{id_mural}")
    public List<Scan> getMuralesIdMural(@PathVariable Long id_mural){return scanService.getMuralesIdMural(id_mural);}



}
