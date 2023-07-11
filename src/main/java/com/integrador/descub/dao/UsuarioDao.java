package com.integrador.descub.dao;

import com.integrador.descub.model.Usuario;

public interface UsuarioDao {

    public Usuario buscar(Integer id);

    public Usuario registrar(Usuario usuario);



}
