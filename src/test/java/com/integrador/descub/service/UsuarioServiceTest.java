package com.integrador.descub.service;

import com.integrador.descub.model.Usuario;
import com.integrador.descub.repository.UsuarioRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class UsuarioServiceTest {

    @Mock
    private UsuarioRepository usuarioRepository;

    @InjectMocks
    private UsuarioService usuarioService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void buscar() {
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("Rafael");
        usuario.setApellidos("Reynoso");

        // Definir el comportamiento del repositorio mock
        when(usuarioRepository.findById(1)).thenReturn(java.util.Optional.of(usuario));

        // Llamar al método del servicio
        Usuario resultado = usuarioService.buscar(1L);

        // Verificar el resultado
        assertNotNull(resultado);
        assertEquals(1L, resultado.getId());
        assertEquals("Rafael", resultado.getNombre());
        assertEquals("Reynoso", resultado.getApellidos());

        // Verificar que se llamó al repositorio con el id correcto
        verify(usuarioRepository, times(1)).findById(1);
    }

    @Test
    void registrar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Rafael");
        usuario.setApellidos("Reynoso");

        // Definir el comportamiento del repositorio mock
        when(usuarioRepository.save(usuario)).thenReturn(usuario);

        // Llamar al método del servicio
        Usuario resultado = usuarioService.registrar(usuario);

        // Verificar el resultado
        assertNotNull(resultado);
        assertEquals("Rafael", resultado.getNombre());
        assertEquals("Reynoso", resultado.getApellidos());

        // Verificar que se llamó al repositorio para guardar el usuario
        verify(usuarioRepository, times(1)).save(usuario);
    }
}