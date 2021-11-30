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
    double numeros = Double.parseDouble(System.console().readLine());

    double[] teclado = new double[10];

    teclado[0] = numeros;
    teclado[1] = numeros;
    teclado[2] = numeros;
    teclado[3] = numeros;
    teclado[4] = numeros;
    teclado[5] = numeros;
    teclado[6] = numeros;
    teclado[7] = numeros;
    teclado[8] = numeros;
    teclado[9] = numeros;

    // ESTE FOR MUESTRA TANTO LOS VALORES INTRODUCIDOS ANTERIORMENTE COMO LOS QUE NO
    for (int i = 0; i > 10; i--) {
      System.out.println("Posición[" + i + "]: " + numeros);
    }
  }
}