package com.integrador.descub.service;

import com.integrador.descub.model.Muralista;
import com.integrador.descub.repository.MuralistaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MuralistaServiceTest {

    @Mock
    private MuralistaRepository muralistaRepository;

    @InjectMocks
    private MuralistaService muralistaService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getAllMuralistas() {
        List<Muralista> muralistas = new ArrayList<>();

        Muralista muralista1 = new Muralista();
        muralista1.setId(1);
        muralista1.setNombre("Muralista 1");
        muralistas.add(muralista1);

        Muralista muralista2 = new Muralista();
        muralista2.setId(2);
        muralista2.setNombre("Muralista 2");
        muralistas.add(muralista2);

        // Definir el comportamiento del repositorio
        when(muralistaRepository.findAll()).thenReturn(muralistas);

        // Llamar al método del servicio
        List<Muralista> resultado = muralistaService.getAllMuralistas();

        // Verificar el resultado
        assertNotNull(resultado);
        assertEquals(2, resultado.size());

        // Verificar que se llamó al repositorio para obtener todos los muralistas
        verify(muralistaRepository, times(1)).findAll();
    }

    @Test
    void getMuralista() {

        Muralista muralista = new Muralista();
        muralista.setId(1);
        muralista.setNombre("Muralista 1");

        // Definir el comportamiento del repositorio
        when(muralistaRepository.findById(1)).thenReturn(Optional.of(muralista));

        // Llamar al método del servicio
        Muralista resultado = muralistaService.getMuralista(1);

        // Verificar el resultado
        assertNotNull(resultado);
        assertEquals(1, resultado.getId());
        assertEquals("Muralista 1", resultado.getNombre());

        // Verificar que se llamó al repositorio con el id correcto
        verify(muralistaRepository, times(1)).findById(1);
    }
}