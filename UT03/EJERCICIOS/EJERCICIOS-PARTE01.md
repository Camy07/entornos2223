## EJERCICIO 1
Dado el algoritmo que carga un vector con 10 números, a continuación pide por pantalla un número y muestra los elementos del vector mayores a ese:

```
Algoritmo mayores_array
    Dimension vector[10]
    Para fila = 1 Hasta 10 Con Paso 1 Hacer
        Escribir "VALOR ",fila,"/10 : "
        Leer vector[fila]
    FinPara
    Escribir " "
    Escribir "ESCRIBE UN NÚMERO : "
    Leer num
    Escribir " "
    Escribir Sin Saltar "Los elementos mayores que ",num, " son : "
    Para fila = 1 Hasta 10 Con Paso 1 Hacer
        Si (vector[fila] > num) Entonces
            Escribir Sin Saltar vector[fila], ", "
        FinSi		
    FinPara
    Escribir " "
FinAlgoritmo
```

Escribe su grafo de flujo, calcula su complejidad ciclomática y escribe los caminos posibles y los casos de prueba, justificando la elección de valores.