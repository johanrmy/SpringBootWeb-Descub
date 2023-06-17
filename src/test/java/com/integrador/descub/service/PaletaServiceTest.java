package com.integrador.descub.service;

import com.integrador.descub.model.Paleta;
import com.integrador.descub.repository.PaletaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

class PaletaServiceTest {

    @Mock
    private PaletaRepository paletaRepository;

    @InjectMocks
    private PaletaService paletaService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getPaletaMural() {

        List<Paleta> paletas = new ArrayList<>();
        paletas.add(new Paleta());
        paletas.add(new Paleta());

        // Definir el comportamiento del repositorio
        when(paletaRepository.findByMuralId(1L)).thenReturn(paletas);

        // Llamar al método del servicio
        List<Paleta> resultado = paletaService.getPaletaMural(1L);

        // Verificar el resultado
        assertNotNull(resultado);
        assertEquals(2, resultado.size());

        // Verificar que se llamó al repositorio con el id de mural correcto
        verify(paletaRepository, times(1)).findByMuralId(1L);
    }
}