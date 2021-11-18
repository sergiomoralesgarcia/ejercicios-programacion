/**
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * 
 * @author Sergio Morales García
 */
public class Ejercicio22 {
  public static void main(String[] args) {
    System.out.println("Este programa Muestra por pantalla todos los números primos entre 2 y 100. ");

    for (int i = 2; i < numero; i++) {
      if ((numero % i) == 0) {
        primo = false;
      }
    }

    if (primo) {
      System.out.println("El número es primo");
    } else {
      System.out.println("El número no es primo");
    }
  }
}