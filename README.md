# Prueba_Aldeamo_Yeison-Rojas
proyecto desarrollado con Java con Spring Boot

Estructura para el GET: http://localhost:8080/api/yarojas/num_vasos/{iterar}/{Id_Pila}
  - iterar es la cantidad de iteraciones que tendrá el array
  - Id_pila es el ID del array que se traera de la BD

http://localhost:8080/api/yarojas/num_vasos/3/2 es una prueba, ademas se realizan las pruebas unitarias con Junit para los siguientes casos:
  - http://localhost:8080/api/yarojas/num_vasos/3/1
  - http://localhost:8080/api/yarojas/num_vasos/3/2
  - http://localhost:8080/api/yarojas/num_vasos/3/3
  - http://localhost:8080/api/yarojas/num_vasos/3/4
  - http://localhost:8080/api/yarojas/num_vasos/3/5

Maven es utilizado para adminsitrar repositorios.
