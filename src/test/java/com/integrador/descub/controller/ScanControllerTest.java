package com.integrador.descub.controller;

import com.integrador.descub.model.Mural;
import com.integrador.descub.model.Muralista;
import com.integrador.descub.model.Scan;
import com.integrador.descub.model.Usuario;
import com.integrador.descub.service.MuralistaService;
import com.integrador.descub.service.PaletaService;
import com.integrador.descub.service.ScanService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ScanControllerTest {

    @Mock
    private ScanService scanService;

    @InjectMocks
    private ScanController scanController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getMuralesIdUsuario() {

        // Crear una lista de Scans de prueba
        List<Scan> scans = new ArrayList<>();
        Scan scan1 = new Scan();
        scan1.setId(1L);
        scan1.setUsuario(new Usuario());
        scans.add(scan1);

        // Configurar el comportamiento esperado del ScanService mock
        when(scanService.getMuralesIdUsuario(1L)).thenReturn(scans);

        // Llamar al método del controlador que se está probando
        List<Scan> result = scanController.getMuralesIdUsuario(1L);

        // Verificar el resultado
        assertEquals(scans, result);

    }

    @Test
    void getMuralesIdMural() {
        // Crear una lista de Scans de prueba
        List<Scan> scans = new ArrayList<>();
        Scan scan1 = new Scan();
        scan1.setId(1L);
        scan1.setMural(new Mural());
        scans.add(scan1);

        // Configurar el comportamiento esperado del ScanService mock
        when(scanService.getMuralesIdMural(1L)).thenReturn(scans);

        // Llamar al método del controlador que se está probando
        List<Scan> result = scanController.getMuralesIdMural(1L);

        // Verificar el resultado
        assertEquals(scans, result);
    }

    @Test
    void getScanId() {
        // Crear un Scan de prueba
        Scan scan = new Scan();
        scan.setId(1L);
        scan.setUsuario(new Usuario());
        scan.setMural(new Mural());
        scan.setFecha_registro(new Date(System.currentTimeMillis()));

        // Configurar el comportamiento esperado del ScanService mock
        when(scanService.getScanId(1L)).thenReturn(scan);

        // Llamar al método del controlador que se está probando
        Scan result = scanController.getScanId(1L);

        // Verificar el resultado
        assertEquals(scan, result);
    }
}