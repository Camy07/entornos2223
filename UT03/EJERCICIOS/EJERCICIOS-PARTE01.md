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

## EJERCICIO 2
Dado el siguiente pseudocódigo que pide una serie de números por pantalla, los almacena en un array y luego invierte ese array:
```java
Proceso InvertirArray
	Definir cantidad como entero; 
	Definir A como Entero;
	Definir tmp como entero;
	Definir i como entero;
	Definir j como entero;
	
	Escribir "Ingrese la cantidad de elementos";
	
	Leer cantidad;
	
	Dimension A[cantidad];
	
	Para i <- 0 Hasta cantidad - 1 Con Paso 1 Hacer
		Escribir "Ingrese elemento";
		Leer A[i];
	FinPara
	j<- 0;
	Mientras 2*j < cantidad Hacer
		tmp <- A[j];
		A[j] <- A[cantidad - j - 1];
		A[cantidad-1] <- tmp;
		j <- j + 1;
	FinMientras
	
	Para i <- 0 Hasta cantidad - 1 Con Paso 1 Hacer
		Escribir "Elemento ",i," es: ",A[i];
	FinPara
	
FinProceso 
```
Escribe su grafo de flujo, calcula su complejidad ciclomática y escribe los caminos posibles y los casos de prueba, justificando la elección de valores.

## EJERCICIO 3
Dado el siguiente pseudocódigo que pide tres numeros por pantalla, los almacena en un array y luego hace una serie de operaciones:
```
Algoritmo actividad4
Definir numNotas como Entero
numNotas <- 3
Dimension notas[numNotas]

Para i<-1 Hasta numNotas Con Paso 1 Hacer
    Escribir "Ingrese el valor de la nota #", i
    Leer notas[i]
Fin Para

promedio = (notas[1]+notas[2]+notas[3]) / 3

Si promedio > 10.5 Entonces
    Escribir "Promedio aprobatorio de "
SiNo
    Escribir "Promedio reprobatorio de "
Fin Si
Escribir promedio
```

Escribe su grafo de flujo, calcula su complejidad ciclomática y escribe los caminos posibles y los casos de prueba, justificando la elección de valores.

