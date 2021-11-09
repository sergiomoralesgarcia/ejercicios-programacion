/**
 * Escribe un programa que calcule el salario semanal de un empleado en base a
 * las horas trabajadas, a razón de 12 euros la hora.
 *
 * @author Sergio Morales Garcia
 */
public class Ejercicio08 {
  public static void main(String[] args) {
    String linea;
    
    System.out.print("Por favor, introduzca las horas trabajadas en una semana: ");
    linea = System.console().readLine();
    double horasSemanales;
    horasSemanales = Double.parseDouble(linea);
    
    System.out.printf("Horas trabajadas en una semana         %10.2f\n", horasSemanales);
    System.out.printf("-------------------------------------------------\n");
    System.out.printf("Total cobrado en una semana (euros)    %10.2f\n", (horasSemanales * 12));
  }
}
