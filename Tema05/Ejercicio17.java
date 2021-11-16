/**
 * Realiza un programa que sume los 100 números siguientes a un número entero y
 * positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 * 
 * @author Sergio Morales García
 */
public class Ejercicio17 {
  public static void main(String[] args) {
    System.out.println("Este programa suma los 100 números siguientes a un número untroducido por teclado. ");
    System.out.println("Introduzca un número entero positivo: ");
    int numero = Integer.parseInt(System.console().readLine());
    int suma = 0;
    
    if (numero > 0){
      for (int i = numero; i < numero + 100; i++) {
        suma += i;
      }  
      System.out.println("El resultado es " + suma);
    } else {
      System.out.println("El número introducido no es correcto.");
    }
  }
}