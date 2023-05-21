package com.integrador.descub.dao;

import com.integrador.descub.model.Muralista;

import java.util.List;

public interface MuralistaDao {
    public List<Muralista> getAllMuralistas();
    public Muralista getMuralista(Long id);
}
