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

    public List<Scan> getMurales()
    {
        List<Scan> scans = new ArrayList<Scan>();
        this.scanRepository.findAll().forEach(scans::add);
        return scans;
    }


    //public Scan getMurales(Long id_usuario){return this.scanRepository.findById(Math.toIntExact(id_usuario)).get();}


    public Scan getMuralesId(Long id_mural){return this.scanRepository.findById(Math.toIntExact(id_mural)).get();}


}
