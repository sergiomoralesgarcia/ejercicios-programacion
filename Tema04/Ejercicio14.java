/**
 * Realiza un programa que diga si un número introducido por teclado es par y/o
 * divisible entre 5
 *
 * @author Sergio Morales García
 */
public class Ejercicio14 {
  public static void main(String[] args) {
    System.out.println("Este programa indica si un número introducido por teclado es par y/o divisible entre 5..");
    System.out.print("Introduzca el número: ");
    int numero = Integer.parseInt(System.console().readLine());

    if (( numero % 2) == 0 )  {
      System.out.printf("El número es par \n");
    } else {
    System.out.print("El número introducido es impar \n");
    }
    if (( numero % 5) == 0 )  {
      System.out.printf("El número es divisible entre 5 \n");
    } else {
    System.out.print("El número introducido no es divisible entre 5 \n");
    }
  }
}

