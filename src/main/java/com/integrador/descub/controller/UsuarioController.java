package com.integrador.descub.controller;


import com.integrador.descub.model.Mural;
import com.integrador.descub.model.Usuario;
import com.integrador.descub.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @RequestMapping(value = "buscar/{id}")
    public Usuario buscar(@PathVariable Long id){return usuarioService.buscar(id);}

    @PostMapping(value = "registrar")
    public Usuario registrar(@RequestBody Usuario usuario){return usuarioService.registrar(usuario);}

    @RequestMapping(value = "getAllUsuarios")
    public List<Usuario> getAllUsuarios(){
        return usuarioService.getAllUsuarios();
    }

}
