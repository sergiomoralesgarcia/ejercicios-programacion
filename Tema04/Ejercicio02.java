/**
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
 * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
 * 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
 * horas, los minutos no se deben introducir por teclado.
 *
 * @author Sergio Morales García
 */
public class Ejercicio02 {
  public static void main(String[] args) {

    System.out.print("Introduce una hora del dia: ");
    String linea = System.console().readLine();
    int n = Integer.parseInt( linea );
    
    if ((n <= 12) && (n >= 6)) {
      System.out.println("Buenos dias fiera");
      linea = System.console().readLine();
      n = Integer.parseInt( linea );
    }
    
    if ((n <= 20) && (n >= 13)) {
      System.out.println("Buenas tardes");
      linea = System.console().readLine();
      n = Integer.parseInt( linea );
    }
    
    if (((n <= 24 ) &&  (n >= 21)) || ((n >= 0) && (n <= 5 ))) {
      System.out.println("Buenas noches");
      linea = System.console().readLine();
      n = Integer.parseInt( linea );
    }
  }
}

