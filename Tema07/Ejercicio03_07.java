/**
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
 * en orden inverso, es decir, el primero que se introduce es el último en mostrarse
 * y viceversa.
 * 
 * @author Sergio Morales García
 */
public class Ejercicio03_07 {
  public static void main(String[] args) {

    System.out.println("Este programa te muestra los número que introduzcas por teclado en el orden contrario");
    System.out.println("Introduzca 10 números:");
    
    int[] numeros = new int[10];
    int i;

    for (i = 0; i < 10; i++) {
      numeros[i] = Integer.parseInt(System.console().readLine());
    }

    System.out.println("Los números mostrados en orden contrario son:");
    for (i = 9; i >= 0; i--) {
      System.out.println(numeros[i]);
    }
  }
}