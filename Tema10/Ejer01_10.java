/**
 * 1. Crea un ArrayList con los nombres de 6 compañeros de clase. A
 *    continuación, muestra esos nombres por pantalla. Utiliza para
 *    ello un bucle for que recorra todo el ArrayList sin usar ningún
 *    índice.
 *
 * @author Sergio Morales García
 */
import java.util.ArrayList;

public class Ejer01_10 {
  public static void main(String[] args) {

    ArrayList<String> a = new ArrayList<String>();

    a.add("AntunezDavid");
    a.add("Albert Parrinsong");
    a.add("José Antonio");
    a.add("Ale Cueto");
    a.add("Diego Aguilera");
    a.add("Sergio");

    System.out.println("Contenido de la lista: ");

    for (String nombre : a) {
      System.out.println(nombre);
    }
  }
}