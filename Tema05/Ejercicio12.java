/**
 * Escribe un programa que muestre los n primeros términos de la serie de
 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
 * el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
 * términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
 * introducir por teclado.
 *
 * @author Sergio Morales García
 */
public class Ejercicio12 {
  public static void main(String[] args) {
    System.out.println("Este programa va ha calcular el cuadrado y el cubo de los 5 primeros numeros enteros que introduzcas. ");
    System.out.print("Introduzca un número: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
    System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
    }
  }
}
