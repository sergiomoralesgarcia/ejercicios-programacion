/**
 * 8. Funciones
 *
 * Ejercicios 2
 *
 * @author Sergio Morales García
 */
public class Ejer02_08 {
  public static void main(String[] arg) {

    System.out.println(esPrimo(10));

  }

  public static boolean esPrimo(int numero) {

    if (numero <= 1) {
      return false;
    }

    for (int i = (int) Math.sqrt(numero); i > 1; i--) {
      if (numero % i == 0) {
        return false;
      }
    }

    return true;
  }
}