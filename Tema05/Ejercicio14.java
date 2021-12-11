/**
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
 * calcule la potencia.
 * 
 * @author Sergio Morales García
 */
public class Ejercicio14 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula la potencia de una base y un exponente introducidos por teclado. ");
    System.out.println("Introduzca la base: ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());
    int potencia = 1;

    if (exponente == 0) {
      potencia = 1;
    }
    if (exponente > 0) {
      for (int i = 0; i < exponente; i++) {
        potencia *= base;
      }
    }
    if (exponente < 0) {
      for (int i = 0; i < -exponente; i++) {
        potencia *= base;
      }
      potencia = 1/potencia;
    }

    System.out.println("La potencia es " + potencia);

  }
}
      