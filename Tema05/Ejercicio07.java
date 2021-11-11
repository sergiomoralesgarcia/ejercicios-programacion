/**
 * Realiza el control de acceso a una caja fuerte. La combinación será un
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
 * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
 * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
 * Tendremos cuatro oportunidades para abrir la caja fuerte.
 *
 * @author Sergio Morales García
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    System.out.print("Introduzca la combinación de cuatro cifras de la caja fuerte: ");
    int combinacion = Integer.parseInt(System.console().readLine());
    int intentos = 1;

    do {
      if (combinacion == 2222){
      System.out.println("La caja fuerte se ha abierto satisfactoriamente ");
      intentos = 5;
      } else {
        intentos++;
        System.out.println("Lo siento, esa no es la combinación ");
        System.out.print("Introduzca de nuevo la combinación: ");
        combinacion = Integer.parseInt(System.console().readLine());
      } 
    } while (intentos <= 3);
  }
}
