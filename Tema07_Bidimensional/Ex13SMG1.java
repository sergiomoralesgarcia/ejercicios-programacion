
import java.util.Scanner;

public class Ex13SMG1 {

  public static void main(String[] args) {

    Scanner n = new Scanner(System.in);
    System.out.print("Introduce la longtud del lado del array:");

    int longitud = n.nextInt();

    int arraybi[][] = new int[longitud][longitud];

    for (int a = 0; a < longitud; a++) {

      for (int b = 0; b < longitud; b++) {
        arraybi[a][b] = (int) (Math.random() * 99 + 1);
        System.out.printf("%4d", arraybi[a][b]);
      }
      System.out.println("");
    }

    // introducimos la fila 
    System.out.println("Vamos a extraer un trozo de ese array.");
    System.out.print("Introduzca la fila para comenzar a extraer: ");
    int fila = n.nextInt();

    // introducimos la columna
    System.out.print("Introduzca la columna para comenzar a extraer: ");
    int columna = n.nextInt();

    // introducimos la longitud
    System.out.print("Introduzca la longitud del lado que se va a extraer: ");
    int longitudfin = n.nextInt();
    for (int a = fila; a < longitudfin; a++) {
      for (int b = columna; b < longitudfin; b++) {
        System.out.printf("%4d", arraybi[a][b]);
      }
      System.out.println("");
    }

  }
}
