/**
 * Modifica el programa anterior para que la probabilidad de que salga un 1 sea
 * de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que
 * salga
 * 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 *
 * @author Sergio Morales García
 */
public class Ejercicio8 {
  public static void main(String[] args) {
    System.out
        .println("muestre tres apuestas de la quiniela en tres columnas para los 14 partidos y el pleno al quince.");
    int numAleatorio = 0;
    for (int partidos = 1; partidos <= 15; partidos++) {
      System.out.printf("%3d. ", partidos);
      if (partidos <= 14) {
        for (int apuesta = 0; apuesta < 3; apuesta++) {
          numAleatorio = (int) (Math.random() * 6);
          switch (numAleatorio) {
            case 0:
              System.out.print("| X |");
              break;
            case 1:
              System.out.print("|  2|");
              break;
            case 2:
              System.out.print("|  2|");
              break;
            default:
              System.out.print("|1  |");
              break;
          }
        }
        System.out.println("");
      } else {
        System.out.printf("PLENO AL %3d. -Local...", partidos);
        numAleatorio = (int) (Math.random() * 4);
        switch (numAleatorio) {
          case 0:
            System.out.print("0");
            break;
          case 1:
            System.out.print("1");
            break;
          case 2:
            System.out.print("2");
            break;
          default:
            System.out.print("M");
            break;
        }
        System.out.print("  Visitante...");
        numAleatorio = (int) (Math.random() * 5);
        switch (numAleatorio) {
          case 0:
            System.out.print("0");
            break;
          case 1:
            System.out.print("1");
            break;
          case 2:
            System.out.print("2");
            break;
          default:
            System.out.print("M");
            break;
        }
      }
    }
  }
}