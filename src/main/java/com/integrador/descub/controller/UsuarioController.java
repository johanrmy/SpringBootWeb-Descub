package com.integrador.descub.controller;


import com.integrador.descub.model.Usuario;
import com.integrador.descub.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuario")
@CrossOrigin(origins = "http://localhost:5173")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @RequestMapping(value = "buscar/{id}")
    public Usuario buscar(@PathVariable Integer id){return usuarioService.buscar(id);}

    @PostMapping(value = "registrar")
    public Usuario registrar(@RequestBody Usuario usuario){return usuarioService.registrar(usuario);}

}
