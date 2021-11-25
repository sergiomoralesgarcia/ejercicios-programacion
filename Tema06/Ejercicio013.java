/**
 * Escribe un programa que simule la tirada de dos dados. El programa deberá
 * continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 * dados tengan el mismo valor
 *
 * @author Sergio Morales García
 */
public class Ejercicio013 {
  public static void main(String[] args) {
    System.out.println("Tira dos dados hasta que coincidan en número:");
    int primero;
    int segundo;


    primero = ((int) (Math.random() * 6) + 1);
    segundo = ((int) (Math.random() * 6) + 1);

    do {
          System.out.println("El primer dado es un " + primero + "  ");
          System.out.println("El segundo dado es un " + segundo + "  ");
          System.out.println("------------------------");
        } while (primero != segundo);
    
    System.out.println();
    
  }  
}
