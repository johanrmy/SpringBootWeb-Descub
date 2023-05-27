package com.integrador.descub.service;

import com.integrador.descub.dao.ScanDao;
import com.integrador.descub.model.Scan;
import com.integrador.descub.repository.ScanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class ScanService implements ScanDao {

    @Autowired
    ScanRepository scanRepository;

    public List<Scan> getMuralesIdUsuario(Long id_usuario)
    {
        List<Scan> scans = new ArrayList<>();
        this.scanRepository.findByUsuarioId(id_usuario).forEach(scans::add);
        return scans;
    }

    public List<Scan> getMuralesIdMural(Long id_mural)
    {
        List<Scan> scans = new ArrayList<>();
        this.scanRepository.findByMuralId(id_mural).forEach(scans::add);
        return scans;
    }

}
