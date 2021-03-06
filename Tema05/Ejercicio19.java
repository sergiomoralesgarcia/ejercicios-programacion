/**
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se
 * debe pedir por teclado.
 * 
 * @author Sergio Morales García
 */
public class Ejercicio19 {
  public static void main(String[] args) {
    System.out.println("Este programa dibuja una piramide en pantalla.");
    System.out.print("Introduzca la altura de la pirámide: ");
    int altura = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el carácter con el que se dibuja la pirámide: ");
    String caracter = System.console().readLine();

    int pisos = 1;
    int longitud = 1;
    int espacios = altura-1;

    while (pisos <= altura) {
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      

      for (int i = 1; i <= longitud; i++) {
        System.out.print(caracter);
      }
    

    System.out.println();

    pisos++;
    longitud += 2;
    espacios--;
    }
  }
}