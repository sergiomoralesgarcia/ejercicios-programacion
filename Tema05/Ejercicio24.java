/**
 * Escribe un programa que lea un número n e imprima una pirámide de números
 * con n filas. 
 * 
 * @author Sergio Morales García
 */
public class Ejercicio24 {
  public static void main(String[] args) {
    System.out.println("Este programa pinta una pirámide de números.");
    System.out.println("Introduzca la altura:");

    int alturaIntroducida = Integer.parseInt(System.console().readLine());

    int altura = 1;
    int i = 0;
    int espacios = alturaIntroducida - 1;
    
    while (altura <= alturaIntroducida) {
      
      // inserta espacios
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      // pinta la línea de números
      for (i = 1; i < altura; i++) {
        System.out.print(i);
      }
      
      for (i = altura; i > 0; i--) {
        System.out.print(i);
      }
      
      System.out.println();
      
      altura++;
      espacios--;
    } // while
  }
}