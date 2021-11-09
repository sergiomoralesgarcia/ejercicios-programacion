/**
 * Uso del tipo char
 *
 * @author  Sergio Morales Garcia 
 */
public class Ejer8Tema2 {
  public static void main(String[] args) {
    char letra1 = 'á';
    char letra2 = 'c';
    char letra3 = 'i';
    char letra4 = 'd';
    char letra5 = 'o';
    String miPalabra = " " + letra1 + letra2 + letra3 + letra4 + letra5;
    System.out.println(miPalabra);
    //No muestra la cadena de caracteres por pantalla con
    //String miPalabra = letra1 + letra2 + letra3 + letra4 + letra5; 
    //Se soluciona con una cadena de caracteres vacía 
  }
}
