package com.Prueba_Aldeamo_Yeison_Rojas.Servicio.Implementacion;

import com.Prueba_Aldeamo_Yeison_Rojas.Repositorio.Repositorio_Vasos;
import com.Prueba_Aldeamo_Yeison_Rojas.Servicio.Servicio_Vasos;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class Implementacion_Vasos implements Servicio_Vasos {
    private final Repositorio_Vasos repositorio_vasos;

    @Override
    public List<Integer> Aumentar_Vaso(int iteraciones, Long Id_Pila) {
        List<Integer> b = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        var Primos = this.Numeros_Primos(10);
        var input = this.repositorio_vasos.findById(Id_Pila).orElseThrow( () -> new RuntimeException("No existe ese Id de array: " + Id_Pila));
        var A = input.getInput().split(",");
        try{
            for (int i = 0; i < iteraciones; i++) {
                var informacion = Primos.get(i);
                for (int j = (A.length) - 1; j >= 0; j--) {
                    var item = Integer.parseInt(A[j]);
                    var bandera = this.Primo(informacion, item);
                    if (bandera) {
                        b.add(item);
                    } else {
                        a.add(item);
                    }
                }
                A = this.Convertir_String(a);
                a.clear();
            }

        }catch (Exception ex){
            return b;
        }
        return b;
    }

    private String[] Convertir_String(List<Integer> datos) {
        String[] strArr = new String[datos.size()];
        for (int i = 0; i < datos.size(); i++) {
            strArr[i] = String.valueOf(datos.get(i));
        }
        return strArr;
    }

    private Boolean Primo(int iteraciones, int input) {
        return input % iteraciones == 0;
    }

    private List<Integer> Numeros_Primos(int Tamaño) {
        List<Integer> numeros_Primos = new ArrayList<>();
        boolean Is_Primo;

        for (int i = 2; i <= Tamaño; i++) {
            Is_Primo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    Is_Primo = false;
                    break;
                }
            }
            if (Is_Primo) {
                numeros_Primos.add(i);
            }
        }

        return numeros_Primos;

    }
}
