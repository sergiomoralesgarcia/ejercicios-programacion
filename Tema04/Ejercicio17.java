/**
 * Escribe un programa que diga cuál es la última cifra de un número entero
 * introducido por teclado.
 *
 * @author Sergio Morales García
 */
public class Ejercicio17 {
  public static void main(String[] args) {
    System.out.println("Este programa indica cual es el último digito de la cifra introducida");
    System.out.print("Introduzca el número: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int ultimoDigito = (numero % 10);

    if (( ultimoDigito % 10) == 0 )  {
      System.out.printf("La última cifra es un cero \n");
    } else {
    System.out.print("La última cifra es \n" + ultimoDigito);
    }
  }
}
