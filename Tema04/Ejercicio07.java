/**
 * Realiza un programa que calcule la media de tres notas.
 *
 * @author Sergio Morales García
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    System.out.println("Este programa hace la media de tres notas.");
    System.out.print("Introduce el valor de la primera nota: ");
    double primera = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el valor de la segunda: ");
    double segunda = Double.parseDouble(System.console().readLine());
    System.out.print("Finalmente, introduce el valor de la tercera nota: ");
    double tercera = Double.parseDouble(System.console().readLine());

    if (( primera > 10) || ( primera < 0) || ( segunda > 10) || ( segunda < 0) || ( tercera > 10) || ( tercera < 0))  {
      System.out.printf("Datos incorrectos");
    } else {
      System.out.printf("La media de las tres notas es %.2f\n ", (primera + segunda + tercera) / 3);
    }
  }
}
