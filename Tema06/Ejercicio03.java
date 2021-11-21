/**
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
 * de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 *
 * @author Sergio Morales García
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Muestra una carta de la baraja francesa al azar:");

    String nombreCarta = "";
    String numeroCarta = "";

    for (int i = 1; i <= 1; i++) {
      int nombre = (int) (Math.random() * 4) + 1; 
      
      switch (nombre) {
      case 1:
        nombreCarta = "picas";
        break;
      case 2:
        nombreCarta = "diamantes";
        break;
      case 3:
        nombreCarta = "treboles";
        ;
        break;
      case 4:
        nombreCarta = "corazones";
        break;
      default:
      }

      for (int n = 1; n <= 1; n++) {
        int numero = (int) (Math.random() * 13) + 1;

        switch (numero) {
        case 1:
          numeroCarta = "As";
          break;
        case 11:
          numeroCarta = "J";
          break;
        case 12:
          numeroCarta = "Q";
          break;
        case 13:
          numeroCarta = "K";
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