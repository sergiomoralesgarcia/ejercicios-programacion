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

    String nombreSimbolo = "";
    int numero = 3;
    int cantidad = 0;

    for (int contador = 1; contador == numero; contador++) {
      int simbolo = (int) (Math.random() * 5 );

      switch (simbolo) {
      case 0:
        nombreSimbolo = "diamante ";
        cantidad++;
        break;
      case 1:
        nombreSimbolo = "corazón ";
        cantidad++;
        break;
      case 2:
        nombreSimbolo = "herradura ";
        cantidad++;
        break;
      case 3:
        nombreSimbolo = "campana ";
        cantidad++;
        break;
      case 4:
        nombreSimbolo = "limón ";
        cantidad++;
        break;
      default:
      }
      System.out.print(nombreSimbolo + " ");

      if (cantidad == 2) {
        System.out.print("Bien, ha recuperado su moneda");
      }

      if (cantidad == 3) {
        System.out.print("Enhorabuena, ha ganado 10 monedas");
      }
      if ((cantidad != 3) && (cantidad != 2)) {
        System.out.print("“Lo siento, ha perdido");
      }
      
    }
    System.out.println();
  }
}