package com.integrador.descub.service;

import com.integrador.descub.dao.PaletaDao;
import com.integrador.descub.model.Paleta;
import com.integrador.descub.repository.PaletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaletaService implements PaletaDao {

    @Autowired
    PaletaRepository paletaRepository;


    public Paleta getPaleta(Long mural)
    {
        return this.paletaRepository.findById(Math.toIntExact(mural)).get();
    }
}
