/**
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 *
 * @author Sergio Morales García
 */
public class Ejercicio03 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduzca la cantidad en pesetas: ");
    linea = System.console().readLine();
    int pesetas;
    pesetas = Integer.parseInt(linea);

    double euros = (pesetas / 166.386);
    
    System.out.printf(" %d pesetas son %.2f euros. ", pesetas, euros);
  } 
}
