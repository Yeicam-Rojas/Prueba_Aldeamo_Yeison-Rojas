package com.Prueba_Aldeamo_Yeison_Rojas.Servicio.Implementacion;

import com.Prueba_Aldeamo_Yeison_Rojas.Entidad.Entidad_Vasos;
import com.Prueba_Aldeamo_Yeison_Rojas.Repositorio.Repositorio_Vasos;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.service.spi.InjectService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@ExtendWith(MockitoExtension.class)
class Implementacion_VasosTest {

    @Mock private Repositorio_Vasos repositorio_vasos;
    @InjectMocks private Implementacion_Vasos implementacion_vasos;

    @Test
    void aumentar_Vaso_3_1() {
        Long Id_Pila = 1L;
        int iteraciones = 3;

        Integer Primos = 20;

        List<Integer> numero = new ArrayList<>();
        numero.add(Primos);

        Entidad_Vasos entidad_vasos = new Entidad_Vasos();
        entidad_vasos.setInput("2,4,5,6,7,8");

        Mockito.when(repositorio_vasos.findById(Id_Pila)).thenReturn(Optional.of(entidad_vasos));

        List<Integer> resultado = implementacion_vasos.Aumentar_Vaso(iteraciones, Id_Pila);
        List<Integer> esperado = Arrays.asList(8, 6, 4, 2, 5);
        assertEquals(esperado, resultado);
    }

    @Test
    void aumentar_Vaso3_2() {
        Long Id_Pila = 2L;
        int iteraciones = 3;

        Integer Primos = 20;

        List<Integer> numero = new ArrayList<>();
        numero.add(Primos);

        Entidad_Vasos entidad_vasos = new Entidad_Vasos();
        entidad_vasos.setInput("3,7,9,5,4,2");

        Mockito.when(repositorio_vasos.findById(Id_Pila)).thenReturn(Optional.of(entidad_vasos));

        List<Integer> resultado = implementacion_vasos.Aumentar_Vaso(iteraciones, Id_Pila);
        List<Integer> esperado = Arrays.asList(2,4,3,9,5);
        assertEquals(esperado, resultado);
    }

    @Test
    void aumentar_Vaso3_3() {
        Long Id_Pila = 3L;
        int iteraciones = 3;

        Integer Primos = 20;

        List<Integer> numero = new ArrayList<>();
        numero.add(Primos);

        Entidad_Vasos entidad_vasos = new Entidad_Vasos();
        entidad_vasos.setInput("5,7,9,11,13");

        Mockito.when(repositorio_vasos.findById(Id_Pila)).thenReturn(Optional.of(entidad_vasos));

        List<Integer> resultado = implementacion_vasos.Aumentar_Vaso(iteraciones, Id_Pila);
        List<Integer> esperado = Arrays.asList(9,5);
        assertEquals(esperado, resultado);
    }

    @Test
    void aumentar_Vaso3_4() {
        Long Id_Pila = 4L;
        int iteraciones = 3;

        Integer Primos = 20;

        List<Integer> numero = new ArrayList<>();
        numero.add(Primos);

        Entidad_Vasos entidad_vasos = new Entidad_Vasos();
        entidad_vasos.setInput("6,4,2,12,15");

        Mockito.when(repositorio_vasos.findById(Id_Pila)).thenReturn(Optional.of(entidad_vasos));

        List<Integer> resultado = implementacion_vasos.Aumentar_Vaso(iteraciones, Id_Pila);
        List<Integer> esperado = Arrays.asList(12,2,4,6,15);
        assertEquals(esperado, resultado);
    }

    @Test
    void aumentar_Vaso3_5() {
        Long Id_Pila = 4L;
        int iteraciones = 3;

        Integer Primos = 20;

        List<Integer> numero = new ArrayList<>();
        numero.add(Primos);

        Entidad_Vasos entidad_vasos = new Entidad_Vasos();
        entidad_vasos.setInput("7,10,15,11,9");

        Mockito.when(repositorio_vasos.findById(Id_Pila)).thenReturn(Optional.of(entidad_vasos));

        List<Integer> resultado = implementacion_vasos.Aumentar_Vaso(iteraciones, Id_Pila);
        List<Integer> esperado = Arrays.asList(10,15,9);
        assertEquals(esperado, resultado);
    }

}