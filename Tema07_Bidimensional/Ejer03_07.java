/**
 * Modifica el programa anterior de tal forma que los números que se introducen
 * en el array se generen de forma aleatoria (valores entre 100 y 999).
 * 
 * @author Sergio Morales García
 */
public class Ejer03_07 {
  public static void main(String[] args) {

    int[][] n = new int[4][5];

    int fila;
    int columna;

    // Se generan números aleatorios
    for(fila = 0; fila < 4; fila++){
      for(columna = 0; columna < 5; columna++){
        n[fila][columna] = (int)(Math.random() * 900) + 100;
      }
    }

    // Se muestran las filas
    int sumaFila;
    for (fila = 0; fila < 4; fila++) {
      sumaFila = 0;
      for (columna = 0; columna < 5; columna++) {
        System.out.printf("%8d  ", n[fila][columna]);
        sumaFila += n[fila][columna];
      }
      System.out.printf("|%8d\n", sumaFila);
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
    }
    System.out.printf("|%8d ", sumaTotal);
  }
}