Dada la siguiente clase:

```java
public class Estadistica {

    public int verMayor(int a , int b, int c) {
        return 1;
    }

    public int verMenor(int a , int b, int c) {
        return 1;
    }

    public int verMedia(int a , int b, int c) {
        return 1;
    }

    public int contarPares(int a , int b, int c) {
        return 1;
    }

    public int contarPrimos(int a , int b, int c) {
        return 1;
    }
    
    private boolean esPrimo(int numero) {
        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
          return false;
        }
        for (int x = 2; x < numero / 2; x++) {
          // Si es divisible por cualquiera de estos números, no
          // es primo
          if (numero % x == 0)
            return false;
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;
    }

}
```

Implementar cada uno de los métodos dados y aplicacion principal que ejecute cada uno de ellos.
