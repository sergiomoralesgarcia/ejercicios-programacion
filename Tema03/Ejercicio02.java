/**
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado
 *
 * @author Sergio Morales García
 */
public class Ejercicio02 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduzca la cantidad en euros: ");
    linea = System.console().readLine();
    double euros;
    euros = Double.parseDouble(linea);

    int pesetas = (int) (euros * 166.386);

    System.out.print( euros + " euros son " + pesetas + " pesetas ");
  } 
}
