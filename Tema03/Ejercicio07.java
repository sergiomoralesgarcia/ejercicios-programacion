/**
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 *
 * @author Sergio Morales Garcia
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    String linea;
    
    System.out.print("Por favor, introduzca la base imponible en euros: ");
    linea = System.console().readLine();
    double baseImponible;
    baseImponible = Double.parseDouble(linea);
    
    System.out.printf("Base imponible %10.2f\n", baseImponible );
    System.out.printf("IVA            %10.2f\n", (baseImponible * 0.21));
    System.out.printf("------------------------\n");
    System.out.printf("Total          %10.2f\n", (baseImponible * 1.21));
  }
}
