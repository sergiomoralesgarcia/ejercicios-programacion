/**
 * 8. Funciones
 *
 * Ejercicio 3
 *
 * @author Sergio Morales García
 */
public class Ejer03_08{ 
  public static void main(String[] arg){

    System.out.println(siguientePrimo(10435));
    
  }

  public static int siguientePrimo(int n) {
    int result; // resultado final
    boolean esPrimo = true;
    do {
      // Comprueba Primo
      esPrimo = true;

      for (int i = 2; i < n; i++) {
        if ((n % i) == 0) {
          esPrimo = false;
        }
      }
      if (!esPrimo) { // si no es primo, pasa al número siguiente
        n++;
      }
    } while (!esPrimo);
    result = n;
    return result;
  }
}