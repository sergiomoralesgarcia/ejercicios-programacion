/**
 * Conversión de tipos
 *
 * @author Sergio Morales Garcia
 */
public class Ejer5Tema2 {
  public static void main(String[] args) {
    int pesetas = 2000000;
    double euros = pesetas / 166.386;
  
    System.out.print(pesetas + " pesetas son " + euros + " euros.");
    System.out.printf("%d pesetas son %.2f euros.\n", pesetas, euros);
  }
}
