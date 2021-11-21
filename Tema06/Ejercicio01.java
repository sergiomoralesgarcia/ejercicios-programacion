/**
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 *
 * @author Sergio Morales García
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Muestra un día de la semana al azar:");

    for (int i = 0; i < 20; i++) {
      int dia = (int) (Math.random() * 7) + 1; // genera un número aleatorio
                                               // entre el 1 y el 7
      switch (dia) {
      case 1:
        System.out.println("lunes ");
        break;
      case 2:
        System.out.println("martes ");
        break;
      case 3:
        System.out.println("miércoles ");
        break;
      case 4:
        System.out.println("jueves ");
        break;
      case 5:
        System.out.println("viernes ");
        break;
      case 6:
        System.out.println("sábado ");
        break;
      case 7:
        System.out.println("domingo ");
        break;
      default:
      }
    }
  }
}
