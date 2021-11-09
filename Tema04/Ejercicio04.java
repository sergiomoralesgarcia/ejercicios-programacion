/**
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
 * las horas extras. Escribe un programa que calcule el salario semanal de un
 * trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
 * trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
 * la hora.
 *
 * @author Sergio Morales García
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    System.out.print("Introduce las horas trabajadas en una semana: ");
    String line = System.console().readLine();
    double horas = Double.parseDouble( line );

    if (horas <= 40) {
      System.out.printf("El salario de una semana es de " + horas * 12 + " €");
    } else {
      System.out.printf("El salario de una semana es de " + (((horas - 40) * 16) + 480) + " €");
    }
  }
}
