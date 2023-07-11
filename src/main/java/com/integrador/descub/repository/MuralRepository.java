package com.integrador.descub.repository;

import com.integrador.descub.model.Mural;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MuralRepository extends CrudRepository<Mural, Integer> {

    List<Mural> findByMuralistaId(Integer muralistaId);

}
