/**
 * 8. Funciones
 *
 * Ejercicio 1
 *
 * @author Sergio Morales García
 */
public class Ejer04_08 {
  public static void main(String[] arg) {

    System.out.println(potencia(5, 2));

  }

  public static int potencia(int base, int exponente) {
    int result = (int) (Math.pow(base, exponente)); // elevamos la base al exponente y ya tenemos el resultado
    return result;
  }
}