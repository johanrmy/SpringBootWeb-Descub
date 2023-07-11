package com.integrador.descub.service;

import com.integrador.descub.dao.ScanDao;
import com.integrador.descub.model.Mural;
import com.integrador.descub.model.Muralista;
import com.integrador.descub.model.Scan;
import com.integrador.descub.repository.ScanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScanService implements ScanDao {

    @Autowired
    ScanRepository scanRepository;

    public List<Scan> getMuralesIdUsuario(Integer id_usuario)
    {
        List<Scan> scans = new ArrayList<>();
        this.scanRepository.findByUsuarioId(id_usuario).forEach(scans::add);
        return scans;
    }

    public List<Scan> getAllScan() {
        List<Scan > scans = new ArrayList<Scan>();
        this.scanRepository.findAll().forEach(scans::add);
        return scans;
    }

    public List<Scan> getMuralesIdMural(Integer id_mural) {
        List<Scan> scans = scanRepository.findByMuralId(id_mural);

        // Iterar sobre los scans y establecer el campo 'mural' como null para que no se incluya en la respuesta
        scans.forEach(scan -> scan.setUsuario(null));

        return scans;
    }

    public Scan getScanId(Integer id){
        return this.scanRepository.findById(id).get();
    }

    public List<Scan> getScannedMuralsByEmail(String email) {
        return scanRepository.findByUsuario_Email(email);
    }
}
