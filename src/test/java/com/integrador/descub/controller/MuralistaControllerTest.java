package com.integrador.descub.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import com.integrador.descub.controller.MuralistaController;
import com.integrador.descub.model.Muralista;
import com.integrador.descub.service.MuralistaService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.ArrayList;
import java.util.List;

class MuralistaControllerTest {

    @Mock
    private MuralistaService muralistaService;

    @InjectMocks
    private MuralistaController muralistaController;

    public MuralistaControllerTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getAllMuralistas() {
        // Crear una lista de muralistas
        List<Muralista> muralistas = new ArrayList<>();

        // Insertar datos en "muralistas"
        Muralista muralista1 = new Muralista();
        muralista1.setId(1);
        muralista1.setNombre("Muralista 1");
        muralista1.setApellidos("Apellidos 1");
        muralista1.setSeudonimo("Seudonimo 1");
        muralista1.setFoto("urlImgFoto");
        muralista1.setTelefono("123456789");
        muralista1.setUserInstagram("instagram1");
        muralista1.setUserFacebook("facebook1");
        muralista1.setEmail("email1@example.com");
        muralistas.add(muralista1);

        // Configurar el comportamiento esperado del servicio
        when(muralistaService.getAllMuralistas()).thenReturn(muralistas);

        // Llamar al método del controlador que se está probando
        List<Muralista> result = muralistaController.getAllMuralistas();

        // Verificar el resultado
        assertEquals(muralistas, result);

    }

    @Test
    void getMuralista() {
        // Crear un objeto Muralista de prueba
        Muralista muralista = new Muralista();
        muralista.setId(1);
        muralista.setNombre("Muralista de prueba");
        // Agregar más atributos según sea necesario

        // Configurar el comportamiento esperado del servicio
        when(muralistaService.getMuralista(1)).thenReturn(muralista);

        // Llamar al método del controlador que se está probando
        Muralista result = muralistaController.getMuralista(1);

        // Verificar el resultado
        assertEquals(muralista, result);

    }
}