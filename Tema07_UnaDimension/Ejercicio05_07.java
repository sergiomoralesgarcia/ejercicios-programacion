/**
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
 * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
 * máximo y del mínimo respectivamente.
 * 
 * @author Sergio Morales García
 */
public class Ejercicio05_07 {
  public static void main(String[] args) {

    System.out.println("Este programa muestra cuál es el mínimo y el máximo de 10 números que introduzcas por teclado.");
    System.out.println("Introduce 10 números:");

    int[] numeros = new int[10];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    int i;

    for (i = 0; i < 10; i++) {
      numeros[i] = Integer.parseInt(System.console().readLine());

      if (numeros[i] < minimo){
        minimo = numeros[i];
      }

      if (numeros[i] > maximo){
        maximo = numeros[i];
      }
    }

    System.out.println();
    System.out.println("Los numeros son:");
    for (i = 0; i < 10; i++) {
      System.out.print(numeros[i]);
      if (numeros[i] == minimo) {
        System.out.print(" minimo");
      }
      if (numeros[i] == maximo) {
        System.out.print(" maximo");
      }
      System.out.println();
    }
  }
}