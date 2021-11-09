/**
 * Escribe un programa que calcule el área de un rectángulo
 *
 * @author Sergio Morales García
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    String linea;
    
    System.out.print("Por favor, introduce la base del rectángulo: ");
    linea = System.console().readLine();
    int base;
    base = Integer.parseInt( linea );
    
    System.out.print("introduce la altura: ");
    linea = System.console().readLine();
    int altura;
    altura = Integer.parseInt( linea );
    
    int area;
    area = base * altura;
    
    System.out.print("El área del rectángulo es " + area);
  }
}
