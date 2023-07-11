package com.integrador.descub.dao;

import com.integrador.descub.model.Muralista;
import com.integrador.descub.model.Scan;

import java.util.List;

public interface ScanDao {

    public List<Scan> getMuralesIdUsuario(Integer id_usuario);

    public List<Scan> getAllScan();

    public List<Scan> getMuralesIdMural(Integer id_mural);

    public Scan getScanId(Integer id);

    public List<Scan> getScannedMuralsByEmail(String email);

}
