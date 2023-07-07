package com.integrador.descub.service;

import com.integrador.descub.model.Mural;
import com.integrador.descub.model.Usuario;
import com.integrador.descub.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;


    public Usuario buscar(Long id) {return this.usuarioRepository.findById(Math.toIntExact(id)).get();}

    public Usuario registrar(Usuario usuario){return this.usuarioRepository.save(usuario);}

    public List<Usuario> getAllUsuarios()
    {
        List<Usuario> usuarios = new ArrayList<Usuario>();
        this.usuarioRepository.findAll().forEach(usuarios::add);
        return usuarios;
    }

}
