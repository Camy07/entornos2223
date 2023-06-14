public class Ejercicios {

public static boolean esMayorEdad(int a) {
    if (a >= 18) {
      return true;
    } else {
      return false;
    }
}

public static int dimeSigno(int a) {
    int r;
    if (a < 0) {
      r = -1;
    } else if (a == 0) {
      r = 0;
} else { r = 1;
}
return r;
}
  
 public static int suma1aN(int n) {
     int suma = 0;
     for (int i = 1; i <= n; i++) {
suma += i; }
     return suma;
  }
  
  public static int producto1aN(int n) {
       int prod = 1;
       for (int i = 1; i <= n; i++) {
  prod *= i; }
       return prod;
    }

}