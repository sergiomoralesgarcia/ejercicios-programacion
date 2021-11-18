/**
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad.
 * 
 * @author Sergio Morales García
 */
public class Ejercicio16 {
  public static void main(String[] args) {
    System.out.println("Este programa calcula si un número introducido por teclado es primo o no. ");
    System.out.println("Introduzca el número: ");
    int numero = Integer.parseInt(System.console().readLine());

    boolean primo = true;

    for (int i = 2; i < numero; i++ ) {
      if ((numero % i) == 0){
      primo = false;
      } 
    }  
      
    if (primo = true){
      System.out.println("El número es primo");
    } else {
      System.out.println("El número no es primo");
    }  
  }
}