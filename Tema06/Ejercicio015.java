/**
 * Realiza un generador de melodía con las siguientes condiciones: a) Las notas
 * deben estar generadas al azar. Las 7 notas son do, re, mi, fa, sol, la y si.
 * b) Una melodía está formada por un número aleatorio de notas mayor o igual a
 * 4, menor o igual a 28 y siempre múltiplo de 4 (4, 8, 12…). c) Cada grupo de 4
 * notas será un compás y estará separado del siguiente compás mediante la barra
 * vertical “|” (Alt + 1). El final de la melodía se marca con dos barras. d) La
 * última nota de la melodía debe coincidir con la primera.
 *
 * @author Sergio Morales García
 */
public class Ejercicio015 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra una melodia aleatoria. ");

    String nombreNota = "";
    
    for (int i = 1; i <= 10; i++) {
      int nota = (int) (Math.random() * 7);
      

      switch (nota) {
      case 0:
        nombreNota = "do ";
        break;
      case 1:
        nombreNota = "re ";
        break;
      case 2:
        nombreNota = "mi ";
        break;
      case 3:
        nombreNota = "fa ";
        break;
      case 4:
        nombreNota = "sol ";
        break;
      case 5:
        nombreNota = "la ";
        break;
      case 6:
        nombreNota = "si ";
        break;
      default:
      }
      System.out.print(nombreNota);

      /* for(int j = 1; j <= 28; j++) {
          int largo = ((int) (Math.random() * 25) + 4);

          if (largo % 4 == 0) { 
          System.out.print();
          }
      }  */
    }
    System.out.println();
  }
}