/**
* Escribe un programa en que dado un número del 1 a 7 escriba el 
* correspondiente nombre del día de la semana
*
* @author Sergio Morales García
*/
public class Ejercicio03 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca un número de la semana del 1 al 7: ");
    int dia = Integer.parseInt(System.console().readLine());

    String diaSemana;

    switch (dia) {
      case 1:
        diaSemana = "lunes";
        break;
      case 2:
        diaSemana = "martes";
        break;
      case 3:
        diaSemana = "miércoles";
        break;
      case 4:
        diaSemana = "jueves";
          break;
      case 5:
        diaSemana = "viernes";
        break;
      case 6:
        diaSemana = "sábado";
        break;
      case 7:
        diaSemana = "domingo";
        break;
      default:
        diaSemana = "no existe ese dia de la semana";
    }
    System.out.println("dia " + dia+ ": " + diaSemana);
  }
}
