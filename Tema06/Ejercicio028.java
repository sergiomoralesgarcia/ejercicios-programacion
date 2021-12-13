/**
 * Realiza un programa que sea capaz de recolocar los números de un array de
 * fuera hacia adentro. En primer lugar, el programa pedirá al usuario el tamaño
 * del array. A continuación generará un array con ese tamaño con números
 * enteros aleatorios entre 0 y 200 ambos incluidos. Seguidamente el programa
 * irá colocando desde fuera hacia adentro los números de tal forma que el
 * primero se coloca en la primera posición, el segundo en la última, el tercero
 * en la segunda, el cuarto en la penúltima, el quinto en la tercera, en sexto
 * en la antepenúltima, etc. Se debe mostrar por pantalla tanto el array original 
 * como el array resultado.
 * 
 * @author Sergio Morales García
 * 
 */
public class Ejercicio028 {
  public static void main(String[] args) {
    System.out.println("El programa pinta el mensaje HOLA con una altura aleatoria.");
    int altura = (int) (Math.random() * 13) + 3;
    if ((altura % 2) == 0) {
      altura++;
    }
    for (int i = 1; i <= altura; i++) {
      if (i == 1) {
        System.out.print("*    *   ****    *        **** ");
      } else if (i < altura / 2 + 1) {
        System.out.print("*    *  *    *   *       *    * ");
      } else if (i == altura / 2 + 1) {
        System.out.print("******  *    *   *       ****** ");
      } else if ((i > altura / 2) && (i < altura)) {
        System.out.print("*    *  *    *   *       *    * ");
      } else if (i == altura) {
        System.out.print("*    *   ****    ******  *    * ");
      }

      System.out.println("");
    }
  }
}