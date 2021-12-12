/**
 * Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
 * programa debe pedir la altura. Se debe comprobar que la altura sea un número
 * impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
 * 
 * @author Sergio Morales García
 */
public class Ejercicio38 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca la altura del reloj de arena: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());

    int altura = 1;
    int asteriscos = alturaIntroducida;
    int espaciosPorDelante = 0;

    if ((alturaIntroducida < 3) || (alturaIntroducida % 2 == 0)) {
      System.out.print("Datos incorrectos. Debe introducir una altura impar mayor o igual a 3");
    } else {
      // parte de arriba /////////////////////////////////////
      while (altura < alturaIntroducida / 2 + 1) {
        
        // inserta espacios delante
        for (int i = 1; i <= espaciosPorDelante; i++) {
          System.out.print(" ");
        }
        
        // pinta la línea
        for (int i = 0; i < asteriscos; i++) {
          System.out.print("*");
        }
        
        System.out.println();
        altura++;
        espaciosPorDelante++;
        asteriscos -= 2;      
      } // while parte de arriba ///////////////////////
      
      // parte de abajo /////////////////////////////////////
      espaciosPorDelante = alturaIntroducida / 2;
      altura = 1;
      while (altura <= alturaIntroducida / 2 + 1) {
        
        // inserta espacios delante
        for (int i = 1; i <= espaciosPorDelante; i++) {
          System.out.print(" ");
        }
        
        // pinta la línea
        for (int i = 0; i < asteriscos; i++) {
          System.out.print("*");
        }
        
        System.out.println();
        altura++;
        espaciosPorDelante--;
        asteriscos += 2;
      } // while parte de abajo ///////////////////////
    } // else
  }
}