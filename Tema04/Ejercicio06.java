/**
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 * una altura h. Aplica la fórmula t = √(2h/g) siendo g = 9.81m/s²
 *
 * @author Sergio Morales García
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula el tiempo que tardará en caer un objeto con la ecuación   t = √(2h/g)");
    System.out.print("Introduce el valor de h: ");
    double h = Double.parseDouble(System.console().readLine());

    if (h < 0) {
      System.out.printf("La ecuación no tiene solución");
    } else {
      System.out.printf("El valor de t es " + (Math.sqrt((2 * h) / 9.81)));
    }
  }
}
