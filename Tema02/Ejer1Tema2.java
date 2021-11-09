/**
 * Conversión de tipos
 *
 * @author Luis J. Sánchez
 */
public class ejer1tema2 {
  public static void main(String[] args) {
    
    int x = 144;
    int y = 999;
    double division;
    
    int sum = x + y;
    int res = y - x;
    int mul = x * y;
    division = (double) x / (double) y;
    
    // Descomenta la siguiente línea y observa cómo cambia el resultado.
    // division = x / y;
    
    System.out.println("El valor de la x es " + x);
    System.out.println("El valor de la y es " + y);
    System.out.println("La suma de mis variables es " + sum);
    System.out.println("La resta de mis variables es " + res);
    System.out.println("La multiplicación de mis variables es " + mul);
    System.out.println("El resultado de la división es " + division);
  }
}
