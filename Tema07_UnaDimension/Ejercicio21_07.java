
/**
 * Escribe un programa que rellene un array de 15 elementos con números enteros
 * comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
 * array “cincuerizado”, según el siguiente criterio: si el número que hay en una
 * posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
 * siguiente múltiplo de 5 que exista a partir de él.
 * 
 * @author Sergio Morales García
 */
public class Ejercicio21_07 {
  public static void main(String[] args) {

    // Crea el array con valores aleatorios
    int[] n = new int[15];

    for (int i = 0; i < 15; i++) {
      n[i] = (int) (Math.random() * 501);
    }

    System.out.println("Array original:");

    for (int i = 0; i < 15; i++) {
      System.out.print(n[i] + "  ");
    }

    // Cincueriza el array
    for (int i = 0; i < 15; i++) {
      while (n[i] % 5 != 0) {
        n[i]++;
      };
    }

    // Muestra el resultado
    System.out.println("\n\nArray resultado:");

    for (int i = 0; i < 15; i++) {
      System.out.print(n[i] + "  ");
    }
  }

}

