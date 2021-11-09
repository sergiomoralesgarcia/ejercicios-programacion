/**
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 *
 * @author Sergio Morales García
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    System.out.println("Este programa ordenaremos tres números enteros que introduzcas.");
    System.out.print("Introduce el primer número: ");
    int primero = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el segundo número: ");
    int segundo = Integer.parseInt(System.console().readLine());
    System.out.print("Finalmente, introduce el tecer dígito: ");
    int tercero = Integer.parseInt(System.console().readLine());

    if (( primero < segundo) && (segundo < tercero) && (tercero > primero))  {
      System.out.printf("El orden es " + tercero + "," + segundo + "," + primero);
    } 
    
    if (( primero < segundo) && (segundo > tercero) && (tercero > primero))  {
      System.out.printf("El orden es " + segundo + "," + tercero + "," + primero);
    } 
    
    if (( primero < segundo) && (segundo > tercero) && (tercero < primero))  {
      System.out.printf("El orden es " + segundo + "," + primero + "," + tercero);
    } 
    
    if (( primero > segundo) && (segundo > tercero) && (tercero < primero))  {
      System.out.printf("El orden es " + primero + "," + segundo + "," + tercero);
    } 
    
    if (( primero > segundo) && (segundo < tercero) && (tercero < primero))  {
      System.out.printf("El orden es " + primero + "," + tercero + "," + segundo);
    } 
    
    if (( primero > segundo) && (segundo < tercero) && (tercero > primero))  {
      System.out.printf("El orden es " + tercero + "," + primero + "," + segundo);
    } 
    
  }
}
