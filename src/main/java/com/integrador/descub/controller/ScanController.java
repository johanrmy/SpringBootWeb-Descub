package com.integrador.descub.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.integrador.descub.model.Muralista;
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

    //@RequestMapping(value = "getMuralesIdUsuario/{id_usuario}")
    //public List<Scan> getMuralesIdUsuario(@PathVariable Long id_usuario) {
        //List<Scan> scans = scanService.getMuralesIdUsuario(id_usuario);

        // Iterar sobre los scans y establecer el campo 'mural' como null para que no se incluya en la respuesta
        //scans.forEach(scan -> scan.setMural(null));

        //return scans;
    //}


    @RequestMapping(value = "getMuralesIdUsuario/{id_usuario}")
    public List<Scan> getMuralesIdUsuario(@PathVariable Long id_usuario){return scanService.getMuralesIdUsuario(id_usuario);}


    @RequestMapping(value = "getMuralesIdMural/{id_mural}")
    public List<Scan> getMuralesIdMural(@PathVariable Long id_mural) {
        List<Scan> scans = scanService.getMuralesIdMural(id_mural);

        // Iterar sobre los scans y establecer el campo 'mural' como null para que no se incluya en la respuesta
        scans.forEach(scan -> scan.setUsuario(null));

        return scans;
    }

    //@RequestMapping(value = "getMuralesIdMural/{id_mural}")
    //public List<Scan> getMuralesIdMural(@PathVariable Long id_mural){return scanService.getMuralesIdMural(id_mural);}

    @RequestMapping(value = "getScanId/{id}")
    public Scan getScanId(@PathVariable Long id){
        return scanService.getScanId(id);
    }


}
