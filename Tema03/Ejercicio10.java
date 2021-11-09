/**
 * Realiza un conversor de Mb a Kb
 *
 * @author Sergio Morales García
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    String linea;     
    
    System.out.print("Por favor, introduce la cantidad de Mb que quieras convertir: ");
    linea = System.console().readLine();
    int Mb;
    Mb = Integer.parseInt( linea );
    
    int kb;
    kb = Mb * 1024;
    
    System.out.print("La cantidad de kb es " + kb);
  }
}
