package com.integrador.descub.service;

import com.integrador.descub.dao.PaletaDao;
import com.integrador.descub.model.Paleta;
import com.integrador.descub.repository.PaletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaletaService {

    @Autowired
    PaletaRepository paletaRepository;


    public List<Paleta> getPaletaMural(Long id_mural){
        List<Paleta> paletas = new ArrayList<>();
        this.paletaRepository.findByMuralId(id_mural).forEach(paletas::add);
        return paletas;
    }
}
