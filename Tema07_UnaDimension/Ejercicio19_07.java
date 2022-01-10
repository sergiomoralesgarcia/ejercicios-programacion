/**
 * Realiza un programa que sea capaz de insertar un número en una posición
 * concreta de un array. En primer lugar, el programa generará un array de 12
 * números enteros aleatorios entre 0 y 200 ambos incluidos. A continuación se
 * debe mostrar el contenido de ese array junto al índice (0 – 11). Seguidamente
 * el programa preguntará por el número que se quiere insertar y por la posición
 * donde será insertado. Los números del array se desplazan a la derecha para
 * dejar sitio al nuevo. El último número (el que se encuentra en la posición 11)
 * siempre se perderá.
 * 
 * @author Sergio Morales García
 */
import java.util.Scanner;

public class Ejercicio19_07 {
  public static void main(String[] args) {

    // Crea el array con valores aleatorios
    int[] n = new int[12];
    
    for (int i = 0; i < 12; i++) {
      n[i] = (int) (Math.random() * 201);
    }

    // Muestra el array original
    System.out.println("Array original:");
    
    System.out.print("\nÍndice ");
    
    for (int i = 0; i < 12; i++) {
      System.out.printf("%4d ", i);
    }
    
    System.out.print("\nValor  ");
    
    for (int i = 0; i < 12; i++) {
      System.out.printf("%4d ", n[i]);
    }
    
    // Pide el número y la posición donde colocarlo
    Scanner s = new Scanner(System.in);
    
    System.out.print("\n\nIntroduzca el número que quiere insertar: ");
    int numero = Integer.parseInt(s.nextLine());
    
    System.out.print("Introduzca la posición donde lo quiere insertar (0 – 11): ");
    int posicion = Integer.parseInt(s.nextLine());
    
    // Inserta el número y desplaza el resto hacia la derecha
    for (int i = 11; i > posicion; i--) {
      n[i] = n[i - 1];
    }
    
    n[posicion] = numero;
    
    // Muestra el resultado
    System.out.println("\nArray resultado:");
    
    System.out.print("\nÍndice ");
    
    for (int i = 0; i < 12; i++) {
      System.out.printf("%4d ", i);
    }
    
    System.out.print("\nValor  ");
    
    for (int i = 0; i < 12; i++) {
      System.out.printf("%4d ", n[i]);
    }
  }
  
}