package com.integrador.descub.dao;

import com.integrador.descub.model.Mural;
import java.util.List;

public interface MuralDao {

    public List<Mural> getAllMurales();

    public Mural getMural(Long id);


}
