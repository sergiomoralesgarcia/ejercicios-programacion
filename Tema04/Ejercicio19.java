/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que
 * puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
 *
 * @author Sergio Morales García
 */
public class Ejercicio19 {
  public static void main(String[] args) {
    System.out.println("Este programa indica cual es el último digito de la cifra introducida");
    System.out.print("Introduzca el número: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    if ((numero > 99999 ) || (numero < -99999 )) {
      System.out.printf("No se pueden introducir más de 5 cifras \n");
    } 
    if (((numero <= 99999 ) && (numero >= 10000)) || ((numero >= -99999 ) && (numero <= -10000))) {
      System.out.printf("El primer número es " + (numero / 10000));
    }
    if (((numero <= 9999 ) && (numero >= 1000)) || ((numero >= -9999 ) && (numero <= -1000))) {
      System.out.printf("El primer número es " + (numero / 1000));
    }
    if (((numero <= 999 ) && (numero >= 100)) || ((numero >= -999 ) && (numero <= -100))) {
      System.out.printf("El primer número es " + (numero / 100));
    }
    if (((numero <= 99 ) && (numero >= 10)) || ((numero >= -99 ) && (numero <= -10))) {
      System.out.printf("El primer número es " + (numero / 10));
    }
    if (((numero <= 9 ) && (numero >= 0)) || ((numero >= -9 ) && (numero <= 0))) {
      System.out.printf("El primer número es " + numero );
    }
  }
}
