package com.integrador.descub.dao;

import com.integrador.descub.model.Muralista;
import com.integrador.descub.model.Scan;

import java.util.List;

public interface ScanDao {

    public List<Scan> getMuralesIdUsuario(Long id_usuario);



    public List<Scan> getMuralesIdMural(Long id_mural);


    public Scan getScanId(Long id);

}
