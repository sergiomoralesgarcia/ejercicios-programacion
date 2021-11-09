/**
 * Realiza un conversor de Kb a Mb.
 *
 * @author Sergio Morales García
 */
public class Ejercicio11 {
  public static void main(String[] args) {
    String linea;     
    
    System.out.print("Por favor, introduce la cantidad de kb que quieras convertir: ");
    linea = System.console().readLine();
    int kb;
    kb = Integer.parseInt( linea );
    
    int Mb;
    Mb = kb / 1024;
    
    System.out.print("La cantidad de kb es " + Mb);
  }
}
