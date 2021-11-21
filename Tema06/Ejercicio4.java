/**
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.
 *
 * @author Sergio Morales García
 */
public class Ejercicio4 {
  public static void main(String[] args) {
    System.out.println("Muestra una carta de la baraja francesa al azar:");

    String nombreCarta = "";
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