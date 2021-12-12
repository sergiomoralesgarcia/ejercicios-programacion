/**
 * Escribe un programa que muestre por pantalla un array de 10 números enteros
 * generados al azar entre 0 y 100. A continuación, el programa debe pedir un
 * número al usuario. Se debe comprobar que el número introducido por teclado
 * se encuentra dentro del array, en caso contrario se mostrará un mensaje por
 * pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
 * correctamente. A continuación, el programa rotará el array hacia la derecha
 * las veces que haga falta hasta que el número introducido quede situado en la
 * posición 0 del array. Por último, se mostrará el array rotado por pantalla.
 * 
 * @author Sergio Morales García
 */
public class Ejercicio17_07 {
  public static void main(String[] args) {

    int[] n = new int[10];

    // Genera el array
    for (int i = 0; i < 10; i++) {
      n[i] = (int)(Math.random() * 381) + 20;
    }

    // Muestra el array original.
    System.out.println("\n\nArray original:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", n[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

    // Pide un número que esté dentro del array
    boolean existeNumero = false;
    int numeroIntroducido;
    do {
      System.out.print("\nIntroduzca uno de los números del array: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      // Comprueba si el número introducido se encuentra dentro del array
      for (int elemento : n) {
        if (elemento == numeroIntroducido) {
          existeNumero = true;
        }
      }
      
      if (!existeNumero) {
        System.out.println("Ese número no se encuentra en el array.");
      }
    } while (!existeNumero);
    
    // Rota los el array hasta que el número introducido se coloque en la posición 0
    while (n[0] != numeroIntroducido) {
      int aux = n[9];
      // Rotación a la derecha
      for (int i = 9; i > 0; i--) {
        n[i] = n[i -1];
      }
      n[0] = aux;
    }

    // Muestra el resultado.
    System.out.println("\nArray resultante:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", n[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘"); 
  }
}