/**
 * Escribe un programa que calcule el área de un triángulo.
 *
 * @author Sergio Morales García
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    String linea;     
    
    System.out.print("Por favor, introduce la base del triángulo: ");
    linea = System.console().readLine();
    int base;
    base = Integer.parseInt( linea );
    
    System.out.print("introduce la altura: ");
    linea = System.console().readLine();
    int altura;
    altura = Integer.parseInt( linea );     
    
    int area;
    area = (base * altura) / 2;
    
    System.out.print("El área del triángulo es " + area);
  }
}
