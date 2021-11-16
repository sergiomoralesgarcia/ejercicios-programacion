/**
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos.
 * 
 * @author Sergio Morales García
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    System.out.println("Este programa va a mostrar que números son positivos y cuales negativos. ");
    System.out.println("Introduzca 10 números: ");
    
    int positivos = 0;
    int negativos = 0;
    int numeros = 0;

    for (int i = numeros; i < numeros + 10; i++) {
      if (Integer.parseInt(System.console().readLine()) >= 0) {
        positivos++;
      } else {
        negativos++;
      }
    }

    System.out.println("La cantidad de números positivos es " + positivos + " y de negativos es " + negativos);
  }
}