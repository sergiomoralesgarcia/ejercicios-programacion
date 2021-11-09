/**
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 *
 * @author Sergio Morales García
 */
public class Ejercicio08 {
  public static void main(String[] args) {
    System.out.println("Este programa hace la media de tres notas.");
    System.out.print("Introduce el valor de la primera nota: ");
    double primera = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el valor de la segunda: ");
    double segunda = Double.parseDouble(System.console().readLine());
    System.out.print("Finalmente, introduce el valor de la tercera nota: ");
    double tercera = Double.parseDouble(System.console().readLine());
    
    double notaFinal = ((primera + segunda + tercera) / 3);

    if (( primera > 10) || ( primera < 0) || ( segunda > 10) || ( segunda < 0) || ( tercera > 10) || ( tercera < 0))  {
      System.out.printf("Datos incorrectos");
    } 
    
    if (( notaFinal >= 0) && ( notaFinal < 5)) {
      System.out.printf("Has sacado un insuficiente \n");
      System.out.printf("La media de las tres notas es: %.2f\n ", notaFinal);
    } 
    
    if (( notaFinal >= 5) && ( notaFinal < 6)) {
      System.out.printf("Has sacado un suficiente \n");
      System.out.printf("La media de las tres notas es %.2f\n ", notaFinal);
    } 
    
    if (( notaFinal >= 6) && ( notaFinal < 7)) {
      System.out.printf("Has sacado un bien \n");
      System.out.printf("La media de las tres notas es %.2f\n ", notaFinal);
    } 
    
    if (( notaFinal >= 7) && ( notaFinal < 9)) {
      System.out.printf("Has sacado un notable \n");
      System.out.printf("La media de las tres notas es %.2f\n ", notaFinal);
    } 
    
    if (( notaFinal >= 9) && ( notaFinal <= 10)) {
      System.out.printf("Has sacado un sobresaliente \n");
      System.out.printf("La media de las tres notas es %.2f\n ", notaFinal);
    } 
  }
}
