package com.Prueba_Aldeamo_Yeison_Rojas.Controlador;

import com.Prueba_Aldeamo_Yeison_Rojas.Servicio.Servicio_Vasos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/yarojas/num_vasos")
public class Controlador_Vasos {
    private final Servicio_Vasos servicio_vasos;

    @Autowired
    public Controlador_Vasos(Servicio_Vasos servicio_vasos){this.servicio_vasos = servicio_vasos;}


    @GetMapping(value = "/{iterar}/{Id_Pila}")
    public ResponseEntity<?> getNumero_Vasos(@PathVariable int iterar, @PathVariable Long Id_Pila){
        var Resultado = this.servicio_vasos.Aumentar_Vaso(iterar, Id_Pila);
        return new ResponseEntity<>(Resultado, HttpStatus.OK);

    }
}
