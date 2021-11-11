/**
 * Muestra los números del 320 al 160, contando de 20 en 20 utilizando un bucle
 * do-while.
 *
 * @author Sergio Morales García
 */
public class Ejercicio06 {
    public static void main(String[] args) {
      int i = 340;
      
      do {
        System.out.println(i -= 20);
      } while (i > 160); 
    }
  }