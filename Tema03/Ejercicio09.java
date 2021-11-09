/**
 * Escribe un programa que calcule el volumen de un cono según la fórmula V =
 * (1/3)πr²h
 *
 * @author Sergio Morales García
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    String linea;     
    
    System.out.print("Por favor, introduce el radio de la base  del cono en cm: ");
    linea = System.console().readLine();
    double radio;
    radio = Double.parseDouble( linea );
    
    System.out.print("introduce la altura en cm: ");
    linea = System.console().readLine();
    double altura;
    altura = Double.parseDouble( linea );
    
    
    double volumen;
    volumen = (Math.PI * radio * radio * altura) / 3;
    
    System.out.print("El volumen del cono en cm³ es " + volumen);
  }
}
