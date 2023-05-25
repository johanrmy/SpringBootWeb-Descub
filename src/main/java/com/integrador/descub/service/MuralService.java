package com.integrador.descub.service;

import com.integrador.descub.dao.MuralDao;
import com.integrador.descub.model.Mural;
import com.integrador.descub.repository.MuralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MuralService implements MuralDao {

    @Autowired
    MuralRepository muralRepository;



    public List<Mural> getAllMurales()
    {
        List<Mural> murales = new ArrayList<Mural>();
        this.muralRepository.findAll().forEach(murales::add);
        return murales;
    }


    public Mural getMural(Long id)
    {
        return this.muralRepository.findById(Math.toIntExact(id)).get();
    }





}
