/**
 * 8. Funciones
 *
 * Ejercicio 5
 *
 * @author Sergio Morales García
 */
public class Ejer06_08 {
  public static void main(String[] arg) {

    System.out.println(voltea(36697));

  }

  public static long voltea(long numeroIntroducido) {

    long numero = numeroIntroducido;
    long volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while

    return volteado;

  }
}