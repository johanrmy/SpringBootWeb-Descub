package com.integrador.descub.repository;

import com.integrador.descub.model.Paleta;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PaletaRepository extends CrudRepository<Paleta, Long> {

    List<Paleta> findByMuralId(Long id_mural);
}
