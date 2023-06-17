package com.integrador.descub.controller;

import com.integrador.descub.model.Paleta;
import com.integrador.descub.service.PaletaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class PaletaControllerTest {

    @Mock
    private PaletaService paletaService;

    @InjectMocks
    private PaletaController paletaController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getPaletaMural() {

        List<Paleta> paletas = new ArrayList<>();


        Paleta paleta1 = new Paleta();
        paleta1.setId(1L);
        paletas.add(paleta1);

        // Configurar el comportamiento esperado del servicio
        when(paletaService.getPaletaMural(1L)).thenReturn(paletas);

        // Llamar al método del controlador que se está probando
        List<Paleta> result = paletaController.getPaletaMural(1L);

        // Verificar el resultado
        assertEquals(paletas, result);
    }

}