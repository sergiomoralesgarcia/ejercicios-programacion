/**
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%
 *
 * @author Sergio Morales García
 */
public class Ejercicio12 {
  public static void main(String[] args) {
    String linea;     
    
    System.out.print("Introduce la primera nota que has sacado en el trimestre: ");
    linea = System.console().readLine();
    double primeraNota;
    primeraNota = Double.parseDouble( linea );
    
    System.out.print("introduce la nota final que sacarias en el primer trimestre: ");
    linea = System.console().readLine();
    double notaFinal;
    notaFinal = Double.parseDouble( linea );
    
    
    double segundaNota;
    segundaNota = ((notaFinal * 100) - (primeraNota * 40)) / 60;
    
    System.out.print("La nota que necesitarías en el segundo examen es un " + segundaNota);
  }
}
