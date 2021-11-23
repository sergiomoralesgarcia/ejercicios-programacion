/**
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo
 * Matrix) con el código ascii entre el 32 y el 126. Puedes hacer casting con
 * (char) para convertir un entero en un carácter.
 *
 * @author Sergio Morales García
 */
public class Ejercicio012 {
  public static void main(String[] args) {
    int linea = 0;

    for (int i = 1; i <= 6500; i++) {
      System.out.print((char) (Math.random() * 94 + 32));

      if (linea++ == 60) { // linea ++ es para el salto de línea
        linea = 0;
        System.out.println();
      }
    }
  }
}