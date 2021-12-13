
/**
 * Realiza un programa que pinte un triángulo relleno tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura.
 * 
 * @author Sergio Morales García
 */
public class Ejercicio53 {
  public static void main(String[] args) {

    System.out.print("Introduzca la altura de la figura: ");
    int altura = Integer.parseInt(System.console().readLine()) ;
    while (altura > 0){
      for (int i = altura; i > 0; i--){
        System.out.print("*");
      }
      System.out.println("");
      altura--;
    }
  }
}

