/**
 * Escribe un programa que permita ir introduciendo una serie indeterminada
 * de números mientras su suma no supere el valor 10000. Cuando esto último
 * ocurra, se debe mostrar el total acumulado, el contador de los números
 * introducidos y la media.
 * 
 * @author Sergio Morales García
 */
public class Ejercicio23 {
  public static void main(String[] args) {
    System.out.println("Se parará cuando la suma total no supere los 1000.");
    System.out.println("Vaya introduciendo números:");

    int numeroIntroducido;
    int suma = 0;
    int numeroDeElementos = 0;
    
    do {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      suma += numeroIntroducido;
      numeroDeElementos++;

    } while (suma <= 1000);

    System.out.println("Has llegado a la cantidad de " + suma);
    System.out.println("Ha introducido " + numeroDeElementos + " números");
    System.out.println("La media total " + suma/numeroDeElementos);
  }
}
