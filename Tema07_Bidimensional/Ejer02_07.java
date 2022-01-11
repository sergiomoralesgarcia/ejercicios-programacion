/**
 * Escribe un programa que pida 20 números enteros. Estos números se deben
 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
 * tratara. La suma total debe aparecer en la esquina inferior derecha.
 * 
 * @author Sergio Morales García
 */
public class Ejer02_07 {
  public static void main(String[] args){

    int[][] n = new int[4][5]; 

    int fila;
    int columna;

    //Se introducen los números 
    System.out.println("Introduzca 20 números enteros: ");
    for (fila = 0; fila < 4; fila++) {
      for (columna = 0; columna < 5; columna++) {
        System.out.printf("Fila " + fila + ", columna " + columna + ":");
        n[fila][columna] = Integer.parseInt(System.console().readLine());
      }
    }

    //Se muestran las filas 
    int sumaFila;
    for (fila = 0; fila < 4; fila++) {
      sumaFila = 0;
      for (columna = 0; columna < 5; columna++) {
        System.out.printf("%8d  ", n[fila][columna]);
        sumaFila += n[fila][columna];
      }
      System.out.printf("|%8d\n", sumaFila);
    }

    //Se muestran las columnas
    for(columna = 0; columna < 5; columna++) {
      System.out.print("----------");
    }
    System.out.println("-----------");

    int sumaColumna;
    int sumaTotal = 0;
    for(columna = 0; columna < 5; columna++) {
      sumaColumna = 0;
      for(fila = 0; fila < 4; fila++) {
        sumaColumna += n[fila][columna];
      }
      sumaTotal += sumaColumna;
      System.out.printf("%8d  ", sumaColumna);
    }
    System.out.printf("|%8d ", sumaTotal);
  }
}