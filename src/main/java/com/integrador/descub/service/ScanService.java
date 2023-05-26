package com.integrador.descub.service;

import com.integrador.descub.dao.ScanDao;
import com.integrador.descub.model.Scan;
import com.integrador.descub.repository.ScanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScanService implements ScanDao {

    @Autowired
    ScanRepository scanRepository;


    public Scan getMurales(Long id_usuario){return this.scanRepository.findById(Math.toIntExact(id_usuario)).get();}


}
