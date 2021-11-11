/*
 * Escribe un programa que calcule la media de un conjunto de números positivos
 * introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos
 * cuando meta un número negativo.
 *
 * @author Sergio Morales García
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.print("Este programa va ha hacer la media de los números que introduzcas hasta que pongas un número negativo. ");
    System.out.println("Vaya introduciendo números.");

    int numeroIntroducido = 1;
    int numeroDigitos = 1;
    int total = 0;

    while (numeroIntroducido >= 0) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());;
      numeroDigitos++;
      total += numeroIntroducido;
    }
    System.out.println("La media de todos los numeros positivos introducidos es " + (total / numeroDigitos));

  }
}