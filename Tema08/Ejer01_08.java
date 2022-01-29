/**
 * 8. Funciones
 *
 * Ejercicio 1
 *
 * @author Sergio Morales García
 */
public class Ejer01_08 {
  public static void main(String[] arg) {

    System.out.println(esCapicua(56788765));

  }

  public static boolean esCapicua(long numero) {

    long volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while

    if (volteado == 56788765) {
      return true;
    } else {
      return false;
    }

  }
}