package com.integrador.descub.service;

import com.integrador.descub.dao.MuralistaDao;
import com.integrador.descub.model.Muralista;
import com.integrador.descub.repository.MuralistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MuralistaService implements MuralistaDao{
    @Autowired
    MuralistaRepository muralistaRepository;

    public List<Muralista> getAllMuralistas()
    {
        List<Muralista> muralistas = new ArrayList<Muralista>();
        this.muralistaRepository.findAll().forEach(muralistas::add);
        return muralistas;
    }
    public Muralista getMuralista(Long id)
    {
        return this.muralistaRepository.findById(Math.toIntExact(id)).get();
    }
}
