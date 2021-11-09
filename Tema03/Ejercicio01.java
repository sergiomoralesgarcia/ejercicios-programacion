/**
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 *
 * @author Sergio Morales García 
 */
public class Ejercicio01 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduzca el primer número: ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt(linea);

    System.out.print("introduzca el segundo, por favor: ");
    linea = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt(linea);

    int total;
    total = primerNumero * segundoNumero;

    System.out.print("El primer número introducido es " + primerNumero);
    System.out.println(" y el segundo es " + segundoNumero);
    System.out.print("La multiplicación de ambos números es ");
    System.out.print(total);   
  } 
}
