/**
 * Escribe un programa que obtenga los números enteros comprendidos entre dos
 * números introducidos por teclado y validados como distintos, el programa debe
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en
 * 7.
 * 
 * @author Sergio Morales García
 */
public class Ejercicio18 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra de 7 en 7 los valores comprendidos entre dos números introducidos por teclado.");
    System.out.println("Introduzca el primer número: ");
    int primerNumero = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca el segundo número: ");
    int segundoNumero = Integer.parseInt(System.console().readLine());

    if (primerNumero < segundoNumero) {
      for (int i = primerNumero; i < segundoNumero; i += 7) {
        
        System.out.print(i + ", ");
      }
    }
    if (segundoNumero < primerNumero) {
      for (int i = segundoNumero; i < primerNumero; i += 7) {
        
        System.out.println(i + ", ");
      }
    }
  }
}