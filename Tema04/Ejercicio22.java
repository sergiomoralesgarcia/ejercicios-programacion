/**
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
 * hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
 * Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
 * por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
 * a las 15:00h.
 *
 * @author Sergio Morales García.
 */
public class Ejercicio22 {
    public static void main(String[] args) {
      System.out.print("Introducte un día de la semana (de lunes a viernes):");
      String dia = System.console().readLine();
      
      int diaSemana = 0;
      
      switch (dia) {
        case "lunes":
        case "Lunes":
          diaSemana = 0;
          break;
        case "martes":
        case "Martes":
          diaSemana = 1;
          break;
        case "miércoles":
        case "miercoles":
        case "Miércoles":
        case "Miercoles":
           
          diaSemana = 2;
          break;
        case "jueves":
        case "Jueves":
          diaSemana = 3;
            break;
        case "viernes":
        case "Viernes":
          diaSemana = 4;
          break;
        default:
          System.out.print("el dia introducido no es correcto");
        }    
      System.out.print("Introduce una hora del dia (Solo la hora): ");
      int hora = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce los minutos: ");
      int minutos = Integer.parseInt(System.console().readLine());
      
      int minutosTotales = (4 * 24 * 60) + (15 * 60);
      int minutosActuales = (diaSemana * 24 * 60) + (hora * 60) + minutos;

      System.out.print("Faltan " + (minutosTotales - minutosActuales) + " minutos para llegar al fin de semana (viernes a las 15:00).");
    
  }  
}
