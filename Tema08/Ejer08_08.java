import misfunciones.Funciones;
/**
 * 8. Funciones
 *
 * Ejercicio 8
 *
 * @author Sergio Morales García
 */
public class Ejer08_08 {
  public static void main(String[] arg) {

    System.out.print("Introduce un digito por teclado: ");
    n = Integer.parseInt(System.console().readLine()) ;
    System.out.println("La posicion del digito es: "+ misfunciones.Funciones.posicionDeDigito(numeroIntroducido,n));

  }
}