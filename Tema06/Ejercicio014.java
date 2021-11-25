/**
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
 * El programa intentará adivinar el número que estás pensando - un número entre
 * 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
 * programa debe preguntar si el número que estás pensando es mayor o menor que
 * el que te acaba de decir.
 *
 * @author Sergio Morales García
 */
public class Ejercicio014 {
  public static void main(String[] args) {

    System.out.println("Tengo 5 intentos para acertar un número que estás pensando entre el 1 y el 100. Deberás darme indicaciones de si el número es mayor o menor.");
    

    int intentos = 1;
    int minimo = 0;
    int maximo = 100;
    int numero;
    int valor;

    do {
      numero = ((int) (Math.random() * (maximo - minimo) + minimo) );
      System.out.println("¿El número es el " + numero + " ?");    
      System.out.println("El número es 1) Mayor 2) Menor 3) Igual ");
      valor = Integer.parseInt(System.console().readLine());
      
      if (valor == 3) {
        System.out.println("He acertado!! LET'S GOOOO. ");
        intentos = 6;
      } else {
        intentos++;
        if (valor == 1) {
          minimo = numero + 1;
        }
        if (valor == 2) {
          maximo = numero - 1;
        }
      }
    } while (intentos <= 5);
    System.out.println();
    
  }
}