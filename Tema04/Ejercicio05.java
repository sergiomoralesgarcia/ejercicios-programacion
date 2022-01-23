/**
 * Realiza un programa que resuelva una ecuaci�n de primer grado 
 * (del tipo ax+b = 0).
 *
 * @author Sergio Morales Garc�a
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    System.out.println("Este programa resuelve la ecuaci�n ax + b = 0");
    System.out.print("Introduce el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());

    if ( a == 0) {
      System.out.printf("La ecuaci�n no tiene soluci�n");
    } else {
      System.out.printf("El valor de x es " + (-b / a));
    }
  }
}
