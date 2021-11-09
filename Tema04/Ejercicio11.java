/**
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule
 * los segundos que faltan para llegar a la medianoche.
 *
 * @author Sergio Morales García
 */
public class Ejercicio11 {
  public static void main(String[] args) {

    System.out.print("Introduce una hora del dia: ");
    double hora = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce los minutos: ");
    double minutos = Double.parseDouble(System.console().readLine());
    
    double segundos = ((24 * 3600) - ((hora * 3600) + (minutos * 60)));
    
    if ((hora < 0) || (hora >= 24) || (minutos < 0) || (minutos >= 60)) {
      System.out.println("Datos incorectos");
    } else {
      System.out.printf("Los segundos qque quedan para la medianoche son " + segundos);
    }
  }
}
