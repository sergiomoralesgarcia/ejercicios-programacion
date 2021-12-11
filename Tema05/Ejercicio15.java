/**
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el
 * 5, se deberán mostrar 2¹, 2², 2³, 2⁴ y 2⁵.
 * 
 * @author Sergio Morales García
 */
public class Ejercicio15 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula la potencia de una base y un exponente introducidos por teclado. ");
    System.out.println("Introduzca la base: ");
    int base = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());

    int potencia;
    int exp;

    for (int i = 1; i <= exponente; i++) {
      potencia = 1;
      exp = i;

      for (int j = 0; j < exp; j++) {
        potencia *= base;
      }

      System.out.println("El resultado es " + base + "^" + i + " = " + potencia);
      System.out.println("-----------------------------");
    }
  }
}