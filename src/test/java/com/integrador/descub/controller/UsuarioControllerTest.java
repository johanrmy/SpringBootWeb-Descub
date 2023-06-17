package com.integrador.descub.controller;

import com.integrador.descub.model.Usuario;
import com.integrador.descub.service.UsuarioService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class UsuarioControllerTest {

    @Mock
    private UsuarioService usuarioService;

    @InjectMocks
    private UsuarioController usuarioController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void buscar() {
        Long id = 1L;
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Rafael");
        usuario.setApellidos("Reynoso");
        usuario.setEmail("rafael.reynoso@tecsup.com");

        when(usuarioService.buscar(id)).thenReturn(usuario);

        Usuario result = usuarioController.buscar(id);

        assertEquals(id, result.getId());
        assertEquals("Rafael", result.getNombre());
        assertEquals("Reynoso", result.getApellidos());
        assertEquals("rafael.reynoso@tecsup.com", result.getEmail());
    }

    @Test
    void registrar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Rafael");
        usuario.setApellidos("Reynoso");
        usuario.setEmail("rafael.reynoso@tecsup.com");

        when(usuarioService.registrar(usuario)).thenReturn(usuario);

        Usuario result = usuarioController.registrar(usuario);

        assertEquals("Rafael", result.getNombre());
        assertEquals("Reynoso", result.getApellidos());
        assertEquals("rafael.reynoso@tecsup.com", result.getEmail());
    }
}