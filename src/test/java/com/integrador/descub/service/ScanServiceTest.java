package com.integrador.descub.service;

import com.integrador.descub.model.Scan;
import com.integrador.descub.repository.ScanRepository;
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

class ScanServiceTest {

    @Mock
    private ScanRepository scanRepository;

    @InjectMocks
    private ScanService scanService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getMuralesIdUsuario() {
        // Crear una lista de scans de prueba
        List<Scan> scans = new ArrayList<>();
        scans.add(new Scan());
        scans.add(new Scan());

        // Definir el comportamiento del repositorio
        when(scanRepository.findByUsuarioId(1)).thenReturn(scans);

        // Llamar al método del servicio
        List<Scan> resultado = scanService.getMuralesIdUsuario(1);

        // Verificar el resultado
        assertNotNull(resultado);
        assertEquals(2, resultado.size());

        // Verificar que se llamó al repositorio con el id de usuario correcto
        verify(scanRepository, times(1)).findByUsuarioId(1);
    }

    @Test
    void getMuralesIdMural() {
        List<Scan> scans = new ArrayList<>();
        scans.add(new Scan());
        scans.add(new Scan());

        // Definir el comportamiento del repositorio
        when(scanRepository.findByMuralId(1)).thenReturn(scans);

        // Llamar al método del servicio
        List<Scan> resultado = scanService.getMuralesIdMural(1);

        // Verificar el resultado
        assertNotNull(resultado);
        assertEquals(2, resultado.size());

        // Verificar que se llamó al repositorio con el id de mural correcto
        verify(scanRepository, times(1)).findByMuralId(1);
    }

    @Test
    void getScanId() {
        // Crear un scan de prueba
        Scan scan = new Scan();

        // Definir el comportamiento del repositorio
        when(scanRepository.findById(1)).thenReturn(Optional.of(scan));

        // Llamar al método del servicio
        Scan resultado = scanService.getScanId(1);

        // Verificar el resultado
        assertNotNull(resultado);
        assertEquals(scan, resultado);

        // Verificar que se llamó al repositorio con el id de scan correcto
        verify(scanRepository, times(1)).findById(1);
    }
}