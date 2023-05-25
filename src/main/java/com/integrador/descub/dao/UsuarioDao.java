package com.integrador.descub.dao;

import com.integrador.descub.model.Usuario;

public interface UsuarioDao {

    public Usuario buscar(Long id);

    public Usuario registrar(Usuario usuario);



}
