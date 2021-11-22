/**
 * Realiza un programa que vaya generando números aleatorios pares entre 0 y 100
 * y que no termine de generar números hasta que no saque el 24. El programa
 * deberá decir al final cuántos números se han generado.
 *
 * @author Sergio Morales García
 */
public class Ejercicio9 {
  public static void main(String[] args) {

    System.out.println("Este programa genera numeros aleatorios pares entre el 0 y el 100 hasta encontrar el 24.");

    int numero = 0;
    int cuentaNumero = 0;
    
    while (numero != 24){
      numero = ((int) (Math.random() * 101) + 2);
      System.out.print(numero + " ");
      cuentaNumero++;
    }
    System.out.println("\nHa mostrado una cantidad de " + cuentaNumero + " numeros.");
  }
}