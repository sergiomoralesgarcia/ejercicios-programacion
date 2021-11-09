/**
 * Escribe un programa que diga cuál es la primera cifra de un número entero
 * introducido por teclado. Se permiten números de hasta 5 cifras.
 *
 * @author Sergio Morales García
 */
public class Ejercicio18 {
  public static void main(String[] args) {
    System.out.println("Este programa indica cual es el último digito de la cifra introducida");
    System.out.print("Introduzca el número: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    if (numero > 99999 )  {
      System.out.printf("No se pueden introducir más de 5 cifras \n");
    } 
    if ((numero <= 99999 ) && (numero >= 10000)) {
      System.out.printf("El primer número es " + (numero / 10000));
    }
    if ((numero <= 9999 ) && (numero >= 1000)) {
      System.out.printf("El primer número es " + (numero / 1000));
    }
    if ((numero <= 999 ) && (numero >= 100)) {
      System.out.printf("El primer número es " + (numero / 100));
    }
    if ((numero <= 99 ) && (numero >= 10)) {
      System.out.printf("El primer número es " + (numero / 10));
    }
    if ((numero <= 9 ) && (numero >= 0)) {
      System.out.printf("El primer número es " + numero );
    }
  }
}
