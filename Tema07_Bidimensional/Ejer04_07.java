/**
 * Modifica el programa anterior de tal forma que las sumas parciales y la suma
 * total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
 * que el ordenador se queda “pensando” antes de mostrar los números.
 * 
 * @author Sergio Morales García
 */
public class Ejer04_07 {
  public static void main(String[] args) 
    throws InterruptedException {

    int[][] n = new int[4][5];

    int fila;
    int columna;

    // Se introducen números aleatorios
    for (fila = 0; fila < 4; fila++){
      for (columna = 0; columna < 5; columna++){
        n[fila][columna] = (int) (Math.random() * 900) + 100;
      }
    }

    // Se muestran las filas
    int sumaFila;
    for (fila = 0; fila < 4; fila++) {
      sumaFila = 0;
      for (columna = 0; columna < 5; columna++) {
        System.out.printf("%8d  ", n[fila][columna]);
        sumaFila += n[fila][columna];
        Thread.sleep(100);
      }
      System.out.printf("|%8d\n", sumaFila);
      Thread.sleep(700);
    }

    // Se muestran las columnas
    for (columna = 0; columna < 5; columna++) {
      System.out.print("----------");
    }
    System.out.println("-----------");

    int sumaColumna;
    int sumaTotal = 0;
    for (columna = 0; columna < 5; columna++) {
      sumaColumna = 0;
      for (fila = 0; fila < 4; fila++) {
        sumaColumna += n[fila][columna];
      }

      sumaTotal += sumaColumna;
      System.out.printf("%8d  ", sumaColumna);
      Thread.sleep(500);
    }
    System.out.printf("|%8d ", sumaTotal);
  }
}