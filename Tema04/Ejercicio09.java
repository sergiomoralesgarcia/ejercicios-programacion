/**
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo
 * ax² + bx + c = 0).
 *
 * @author Sergio Morales García
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    System.out.println("Este programa resuelve la ecuación ax² + bx + c = 0");
    System.out.print("Introduce el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el valor de c: ");
    double c = Double.parseDouble(System.console().readLine());

    if (b < 4 * a * c) {
      System.out.printf("La ecuación no tiene solución");
    } else {
      System.out.printf("El priemer valor de x es %.5f\n", (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a);
      System.out.printf("El segundo valor de x es %.5f", (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a);
    }
  }
}
