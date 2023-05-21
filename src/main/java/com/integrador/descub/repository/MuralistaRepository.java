package com.integrador.descub.repository;

import com.integrador.descub.model.Muralista;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

public interface MuralistaRepository extends CrudRepository<Muralista,Integer> {
}
