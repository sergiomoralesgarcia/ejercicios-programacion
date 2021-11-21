/**
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 *
 * @author Sergio Morales García
 */
public class Ejercicio1 {
  public static void main(String[] args) {
    System.out.println("Tira tres dados:");
    int primero;
    int segundo;
    int tercero;

    for (int i = 1; i <= 1; i++) {
      primero = ((int)(Math.random()*6) + 1 );
      System.out.println("El primer dado es un " + primero + "  ");
      for (int c = 1; c <= 1; c++) {
        segundo = ((int)(Math.random()*6) + 1 );
        System.out.println("El segundo dado es un " + segundo + "  ");
        for (int s = 1; s <= 1; s++) {
          tercero = ((int)(Math.random()*6) + 1 );
          System.out.println("El tercer dado es un " + tercero + "  ");
          System.out.println("La suma de los tres dados es " + (primero + segundo + tercero));
        }
      }
    }
    System.out.println();
  }
}
