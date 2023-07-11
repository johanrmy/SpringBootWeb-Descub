package com.integrador.descub.repository;

import com.integrador.descub.model.Scan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ScanRepository extends CrudRepository<Scan, Integer> {

    List<Scan> findByUsuarioId(Integer id_usuario);

    List<Scan> findByMuralId(Integer id_mural);

    List<Scan> findByUsuario_Email(String email);
}
