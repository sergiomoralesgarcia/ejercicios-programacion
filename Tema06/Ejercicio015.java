/**
 * Realiza un generador de melodía con las siguientes condiciones:
 * a) Las notas deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol,
 * la y si.
 * b) Una melodía está formada por un número aleatorio de notas mayor o igual
 * a 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…).
 * c) Cada grupo de 4 notas será un compás y estará separado del siguiente
 * compás mediante la barra vertical “|” (Alt + 1). El final de la melodía se marca
 * con dos barras.
 * d) La última nota de la melodía debe coincidir con la primera.
 *
 * @author Sergio Morales García
 */
public class Ejercicio3 {
    public static void main(String[] args) {
      System.out.println("Muestra una carta de la baraja francesa al azar:");
  
      String nombreNota = "";
      String numeroCarta = "";
  
      for (int i = 1; i <= 1; i++) {
        int nombre = (int) (Math.random() * 4) + 1; 
  
        switch (nombre) {
        case 1:
          nombreCarta = "oros";
          break;
        case 2:
          nombreCarta = "copas";
          break;
        case 3:
          nombreCarta = "espadas";
          ;
          break;
        case 4:
          nombreCarta = "bastos";
          break;
        default:
        }
  
        for (int n = 1; n <= 1; n++) {
          int numero = (int) (Math.random() * 10) + 1;
  
          switch (numero) {
          case 1:
            numeroCarta = "As";
            break;
          case 8:
            numeroCarta = "sota";
            break;
          case 9:
            numeroCarta = "caballo";
            break;
          case 10:
            numeroCarta = "rey";
            break;
          default:
            numeroCarta = String.valueOf(numero);
          }
          System.out.println("La carta es un " + numeroCarta + " de " + nombreCarta);
        }
      }
      System.out.println();
    }
  }