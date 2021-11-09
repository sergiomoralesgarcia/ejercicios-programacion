/**
 * Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
 * su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción
 * incorrecta, el programa deberá mostrar un mensaje de error.
 *
 * @author Sergio Morales García
 */
public class Ejercicio28 {
    public static void main(String[] args) {
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
    String turno1 = System.console().readLine();
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
    String turno2 = System.console().readLine();
    
    
    if (turno1.equals(turno2)) {
      System.out.println("Empate");
    } else {
      int ganador = 2;
      switch(turno1) {
        case "piedra":
          if (turno2.equals("tijera")) {
            ganador = 1;
          }
          break;
        case "papel":
          if (turno2.equals("piedra")) {
            ganador = 1;
          }
          break;
        case "tijera":
          if (turno2.equals("papel")) {
            ganador = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + ganador);
    }
  }
  
}

