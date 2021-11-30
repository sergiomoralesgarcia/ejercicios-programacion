/**
 * Realiza un simulador de máquina tragaperras simplificada que cumpla los
 * siguientes requisitos: a) El ordenador mostrará una tirada que consiste en
 * mostrar 3 figuras. Hay 5 figuras posibles: corazón, diamante, herradura,
 * campana y limón. b) Si las tres figuras son diferentes se debe mostrar el
 * mensaje “Lo siento, ha perdido”. c) Si hay dos figuras iguales y una
 * diferente se debe mostrar el mensaje “Bien, ha recuperado su moneda”. d) Si
 * las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10
 * monedas”.
 *
 * @author Sergio Morales García
 */
public class Ejercicio016 {
  public static void main(String[] args) {
    System.out.println("Este programa simula unas tragaperras. ");

    int simbolo1 = 0;
    int simbolo2 = 0;
    int simbolo3 = 0;

    for (int contador = 0; contador < 3; contador++) {
      int simbolo = (int) (Math.random() * 5 );

      switch (simbolo) {
      case 0:
        System.out.print("diamante ");
        break;
      case 1:
        System.out.print("corazón ");
        break;
      case 2:
        System.out.print("herradura ");
        break;
      case 3:
        System.out.print("campana ");
        break;
      case 4:
        System.out.print("limón ");
        break;
      default:
      }

      switch (contador){
      case 0:
        simbolo1 = simbolo;
        break;
      case 1:
        simbolo2 = simbolo;
        break;
      case 2:
        simbolo3 = simbolo;
        break;
      default:
      }
    }  
      
    if ((simbolo1 != simbolo2) && (simbolo2 != simbolo3) && (simbolo1 != simbolo3)) {
      System.out.println("\nLo siento, ha perdido.");
    } else if ((simbolo1 == simbolo2) && (simbolo2 == simbolo3)) {
      System.out.println("\nEnhorabuena, ha ganado 10 monedas.");
    } else {
      System.out.println("\nBien, ha recuperado su moneda.");
    }
    
    System.out.println();
  }
}