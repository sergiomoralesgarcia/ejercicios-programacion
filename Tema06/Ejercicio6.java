/**
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe * *     * adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
 * el programa dirá cuántas oportunidades quedan y si el número introducido es
 * menor o mayor que el número secreto.
 *
 * @author Sergio Morales García
 */
public class Ejercicio6 {
  public static void main(String[] args) {

    System.out.println("Tienes 5 intentos para acertar un numero aleatorio entre el 1 y el 100 mientras indico si es mayor o menor.");
    System.out.print("Introduzca un número entre el 1 y el 100: ");
    int combinacion = Integer.parseInt(System.console().readLine());

    int intentos = 1;

    for (int i = 1; i <= 1; i++) {
      int numero = ((int) (Math.random() * 101));
    
    do {
      if (combinacion == numero){
      System.out.println("ENORABUENA!! Has acertado el número. ");
      intentos = 6;
      } else {
        intentos++;
        if (numero > combinacion){
          System.out.println("El numero es más alto. ");
        }
        if (numero < combinacion){
          System.out.println("El numero es más bajo. ");
        }
        System.out.print("Introduzca el número de nuevo : ");
        combinacion = Integer.parseInt(System.console().readLine());

        if (combinacion == numero){
          System.out.println("ENORABUENA!! Has acertado el número. ");
        } 
      } 
    } while (intentos <= 4);
    System.out.println();
    }
  }
}
