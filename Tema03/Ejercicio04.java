/**
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 *
 * @author Sergio Morales García
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    String linea;
    
    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt( linea );
    
    System.out.print("introduce otro, por favor: ");
    linea = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt( linea );
    
    int suma , resta , division, multiplicacion ;
    suma = primerNumero + segundoNumero;
    resta = primerNumero - segundoNumero;
    division = primerNumero / segundoNumero;
    multiplicacion = primerNumero * segundoNumero;
    
    System.out.print("El primer número introducido es " + primerNumero);
    System.out.println(" y el segundo es " + segundoNumero);
    System.out.println("La suma entre los dos números es " + suma);
    System.out.println("La resta entre el primer número y el segundo es " + resta);
    System.out.println("La división del primer número entre el segundo es " + division);
    System.out.println("La multiplicación entre los dos números es " + multiplicacion);
    
  }
}
