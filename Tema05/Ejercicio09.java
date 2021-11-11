/**
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
 * la salvedad de que el anterior estaba limitado a números de 5 dígitos como
 * máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
 * esta manera, la única limitación en el número de dígitos la establece el tipo de
 * dato que se utilice (int o long).
 *
 * @author Sergio Morales García
 */
public class Ejercicio09 {
  public static void main(String[] args) {

    System.out.print("Introduzca un número para saber cuántos dígitos tiene: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    int numeroDigitos = 1;
    int n = 1;
    n = numeroIntroducido;

    while (n > 10) {
        n /= 10;
        numeroDigitos++;
    }
    System.out.println(numeroIntroducido + " tiene " + numeroDigitos + " digitos ");

  }
}