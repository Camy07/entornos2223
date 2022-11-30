## EJEMPLO 1


En el siguiente ejemplo, se muestra el código de un programa que pide dos números y comprueba si son positivos, si no lo son, muestra por pantalla un mensaje de error. Si son positivos, calcula y muestra su media. 

![](_resources/ejemplo01_codigo.png)
### A) GRAFO ASOCIADO
A continuación se muestra el grafo asociado vinculando los nodos con cada bloque de código asociado del apartado anterior.
![](_resources/ejemplo01_grafo.png)

### COMPLEJIDAD CICLOMÁTICA

Aplicando la fórmula, podemos calcular la complejidad del grafo:

- V(G) = Nº de regiones = 3
- V(G) = Nº Nodos predicado + 1 = 2 + 1= 3 (Los nodos son el 2 y el 3)
- V(G) = (Aristas - nodos) + 2 = (8-7) + 2 = 1 + 2 = 3

### CAMINOS POSIBLES
Los caminos posibles son:

| CAMINO | NODOS RECORRIDOS |
|:------:|:----------------:|
|   A    |    1-2-3-5-6     |
|   B    |     1-2-4-6      |
|   C    |    1-2-3-4-6     |

### CASOS DE USO Y JUSTIFICACIÓN
La tabla de casos de prueba queda como sigue:

| **CAMINO** |  **CASO DE PRUEBA** |  **RESULTADO ESPERADO** |
|:--:|:--:|:--:|
| A| (x=4, y=10)| Mostrar “La media es 7”| 
| B| (x=-3 , y=10)| Mostrar “X e Y deben ser positivos”| 
| C| (x=-5 , y=-4)| Mostrar “X e Y deben ser positivos”| 

La selección de los valores se ha elegido en base a la siguiente justificación:

- El camino A debe cumplir la condición que X e Y sean positivos.
- El camino B debe cumplir la condición que X sea negativo e Y sea positivo.
- El camino C debe cumplir la condición que X e Y sean negativos.

