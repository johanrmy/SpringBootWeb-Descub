package com.integrador.descub.dao;

import com.integrador.descub.model.Mural;
import com.integrador.descub.model.Usuario;

import java.util.List;

public interface UsuarioDao {

    public Usuario buscar(Long id);

    public Usuario registrar(Usuario usuario);

    public List<Usuario> getAllUsuarios();



}
