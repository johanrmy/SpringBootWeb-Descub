package com.integrador.descub.service;

import com.integrador.descub.model.Mural;
import com.integrador.descub.repository.MuralRepository;
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

class MuralServiceTest {

    @Mock
    private MuralRepository muralRepository;

    @InjectMocks
    private MuralService muralService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getAllMurales() {
        List<Mural> murales = new ArrayList<>();

        Mural mural1 = new Mural();
        mural1.setId(1);
        mural1.setNombre("Mural 1");
        murales.add(mural1);

        Mural mural2 = new Mural();
        mural2.setId(2);
        mural2.setNombre("Mural 2");
        murales.add(mural2);

        // Definir el comportamiento del repositorio
        when(muralRepository.findAll()).thenReturn(murales);

        // Llamar al método del servicio
        List<Mural> resultado = muralService.getAllMurales();

        // Verificar el resultado
        assertNotNull(resultado);
        assertEquals(2, resultado.size());

        // Verificar que se llamó al repositorio para obtener todos los murales
        verify(muralRepository, times(1)).findAll();
    }

    @Test
    void getMural() {

        Mural mural = new Mural();
        mural.setId(1);
        mural.setNombre("Mural 1");

        // Definir el comportamiento del repositorio
        when(muralRepository.findById(1)).thenReturn(Optional.of(mural));

        // Llamar al método del servicio
        Mural resultado = muralService.getMural(1);

        // Verificar el resultado
        assertNotNull(resultado);
        assertEquals(1, resultado.getId());
        assertEquals("Mural 1", resultado.getNombre());

        // Verificar que se llamó al repositorio con el id correcto
        verify(muralRepository, times(1)).findById(1);
    }
}