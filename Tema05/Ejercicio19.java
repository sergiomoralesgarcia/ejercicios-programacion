/**
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debe
 * pedir por teclado.
 * 
 * @author Sergio Morales García
 */
public class Ejercicio19 {
    public static void main(String[] args) {
      System.out.println("Este programa dibuja una piramide en pantalla.");
      System.out.println("Introduzca la altura de la pirámide: ");
      int altura = Integer.parseInt(System.console().readLine());
  
      if (primerNumero < segundoNumero) {
        for (int i = primerNumero; i < segundoNumero; i += 7) {
          
          System.out.print(i + ", ");
        }
      }
      if (segundoNumero < primerNumero) {
        for (int i = segundoNumero; i < primerNumero; i += 7) {
          
          System.out.println(i + ", ");
        }
      }
    }
  }