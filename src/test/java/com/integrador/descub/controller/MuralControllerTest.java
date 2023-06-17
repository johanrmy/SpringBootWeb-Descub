package com.integrador.descub.controller;

import com.integrador.descub.model.Muralista;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import com.integrador.descub.model.Mural;
import com.integrador.descub.service.MuralService;
import org.junit.jupiter.api.BeforeEach;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

class MuralControllerTest {

    @Mock
    private MuralService muralService;

    @InjectMocks
    private MuralController muralController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getAllMurales() {

        //Se crea una lista del modelo Mural
        List<Mural> murales = new ArrayList<>();

        //Insertar datos en "murales"
        Mural mural1 = new Mural();
        mural1.setId(1L);
        mural1.setNombre("Mural 1");
        mural1.setDireccion("Dirección 1");
        mural1.setFecha_creacion(Date.valueOf("2023-06-01"));
        mural1.setImagen(new byte[]{1, 2, 3});
        mural1.setDescripcion("Descripción 1");
        mural1.setMuralista(new Muralista());
        mural1.setLatidud(BigDecimal.valueOf(40.12345678));
        mural1.setAltidud(BigDecimal.valueOf(-73.98765432));
        murales.add(mural1);

        //Se configura muralService para que, al llamar al método getAllMurales(), devuelva la lista murales utilizando thenReturn().
        when(muralService.getAllMurales()).thenReturn(murales);

        // Llamar al método del controlador que se está probando
        List<Mural> result = muralController.getAllMurales();

        // Verificar el resultado
        assertEquals(murales, result);

    }

    @Test
    void getMural() {

        // ID del mural a buscar
        Long muralId = 1L;

        // Crear un objeto Mural simulado como resultado esperado
        Mural muralEsperado = new Mural();
        muralEsperado.setId(muralId);
        muralEsperado.setNombre("Mural de prueba");

        // Configurar el comportamiento esperado del servicio muralService
        when(muralService.getMural(muralId)).thenReturn(muralEsperado);

        // Llamar al método del controlador que se está probando
        Mural result = muralController.getMural(muralId);

        // Verificar el resultado
        assertEquals(muralEsperado, result);

    }
}