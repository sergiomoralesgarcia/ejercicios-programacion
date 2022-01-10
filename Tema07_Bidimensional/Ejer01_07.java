/**
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num
 * y asigna los valores según la siguiente tabla. Muestra el contenido de todos
 * los elementos del array dispuestos en forma de tabla como se muestra en la
 * figura.
 * 
 * @author Sergio Morales García
 */
public class Ejer01_07 {
  public static void main(String[] args)
      throws InterruptedException { // Se añade esta línea para poder usar sleep

    int[][] n = new int[3][6]; // array de 3 filas por 6 columnas

    n[0][1] = 30;
    n[0][2] = 2;
    n[0][5] = 5;
    n[1][0] = 75;
    n[2][2] = -2;
    n[2][3] = 9;
    n[2][5] = 11;

    int fila;
    int columna;

    System.out.println("           Columna 0  Columna 1  Columna 2  Columna 3  Columna 4  Columna 5");
    for (fila = 0; fila < 3; fila++) {

      System.out.print("Fila " + fila);

      for (columna = 0; columna < 6; columna++) {
        System.out.printf("%10d ", n[fila][columna]);
        Thread.sleep(1000); // retardo de un segundo
      }
      System.out.println();
    }
  }
}