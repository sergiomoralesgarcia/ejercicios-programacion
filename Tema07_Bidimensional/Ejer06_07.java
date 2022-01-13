/**
 * Modifica el programa anterior de tal forma que no se repita ningún número en
 * el array.
 * 
 * @author Sergio Morales García
 */
public class Ejer06_07 {
  public static void main(String[] args) {

    int[][] num = new int[6][10];

    int fila;
    int columna;
    int maximo = 0;
    int minimo = 1000;
    int maximoFila = 0;
    int maximoColumna = 0;
    int minimoFila = 0;
    int minimoColumna = 0;

    boolean repetido;
    int i;

    for (fila = 0; fila < 6; fila++) {
      for (columna = 0; columna < 10; columna++) {
        do {
          num[fila][columna] = (int) (Math.random() * 1001);

          repetido = false;
          for (i = 0; i < 10 * fila + columna; i++){
            if (num[fila][columna] == num[i / 10][i % 10]){
              repetido = true;
            }
          }
        } while (repetido);
      }
    }

/*    // Se generan números aleatorios
    for (fila = 0; fila < 6; fila++) {
      for (columna = 0; columna < 10; columna++) {
        num[fila][columna] = (int) (Math.random() * 1001);
        
        if (num[fila][columna] < minimo) {
          minimo = num[fila][columna];
          minimoFila = fila;
          minimoColumna = columna;
        }

        if (num[fila][columna] > maximo) {
          maximo = num[fila][columna];
          maximoFila = fila;
          maximoColumna = columna;
        }
      }
    } */

    // Se muestran las filas
    int sumaFila;
    for (fila = 0; fila < 6; fila++) {
      sumaFila = 0;
      for (columna = 0; columna < 10; columna++) {
        System.out.printf("%5d  ", num[fila][columna]);
        sumaFila += num[fila][columna];
      }
      System.out.printf("|%5d\n", sumaFila);
    }

    // Se muestran las columnas
    for (columna = 0; columna < 6; columna++) {
      System.out.print("-----------");
    }
    System.out.println("-----------");

    int sumaColumna;
    int sumaTotal = 0;
    for (columna = 0; columna < 10; columna++) {
      sumaColumna = 0;
      for (fila = 0; fila < 6; fila++) {
        sumaColumna += num[fila][columna];
      }
      sumaTotal += sumaColumna;
      System.out.printf("%5d  ", sumaColumna);
    }
    System.out.printf("| %5d  ", sumaTotal);

    System.out.println();
    System.out.println();

    System.out.println("El numero máximo es el " + maximo + " y se encuentra en la fila " + maximoFila
        + " y en la columna " + maximoColumna);
    System.out.println("El numero mínimo es el " + minimo + " y se encuentra en la fila " + minimoFila
        + " y en la columna " + minimoColumna);
  }
}