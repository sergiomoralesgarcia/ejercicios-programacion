/**
 * Realiza un programa que sea capaz de desplazar todos los dígitos de un número
 * de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría
 * a dar la vuelta y se colocaría a la derecha. Si el número tiene un solo dígito,
 * se queda igual.
 * 
 * @author Sergio Morales García
 */
import java.util.Scanner;
public class Ejercicio52 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número: ");
    long numeroIntroducido = Long.parseLong(s.nextLine());
    
    long copia = numeroIntroducido;
    int longitud = 0;
    
    while (copia > 0) {
      copia /= 10;
      longitud++;
    }
    
    int primero =  (int)(numeroIntroducido / Math.pow(10, longitud - 1));
    long aux = (long)(primero * Math.pow(10, longitud - 1));
    long resultado = (numeroIntroducido - aux) * 10 + primero;
    System.out.println("El número resultado es " + resultado);
  }
  
}
