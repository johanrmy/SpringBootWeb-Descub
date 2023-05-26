package com.integrador.descub.dao;

import com.integrador.descub.model.Scan;

import java.util.List;

public interface ScanDao {

    public List<Scan> getMurales();

    //public Scan getMurales(Long id_usuario);


    public Scan getMuralesId(Long id_mural);

}
