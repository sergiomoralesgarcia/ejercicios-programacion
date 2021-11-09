/**
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * @author Sergio Morales García
 */
public class Ejercicio08 {
    public static void main(String[] args) {
      System.out.print("Introduzca un número para mostrar su tabla de multiplicar: ");  
      int numero = Integer.parseInt(System.console().readLine());

      for (int i = 1; i < 11; i++) {
        System.out.println(numero + "x" + i + " = " + numero * i );
      }
    }
  }