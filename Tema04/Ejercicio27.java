/**
 * Una pastelería nos ha pedido realizar un programa que haga presupuestos de
 * tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
 * manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
 * 16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
 * además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
 * segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
 * nombre; la nata suma 2.50 y la escritura del nombre 2.75.
 *
 * @author Sergio Morales García
 */
public class Ejercicio27 {
    public static void main(String[] args) {
    System.out.println("Este programa genera presupuestos de tartas.");
    System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
    String Sabor = System.console().readLine();
    
    int precioSabor = 0;
    switch (Sabor) {
      case "manzana":
        precioSabor = 18;
        break;
      case "fresa":
        precioSabor = 16;
        break;
      case "chocolate":
        System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
        String chocolate = System.console().readLine();
        if (chocolate.equals("negro")){
          precioSabor = 14;
        }
        else if (chocolate.equals("blanco")){
          precioSabor = 15;
        }
        break;
      default:
        System.out.println("No ha introducido correctamente el sabor de la tarta");
    }
    
    System.out.print("¿Quiere nata? (si o no): ");
    String nata = System.console().readLine();
    double precioNata = 0;
    switch (nata) {
      case "si":
        precioNata = 2.50;
        break;
      case "no":
        precioNata = 0;
        break;
      default:
        System.out.println("No ha introducido correctamente si quiere nata o no");
    }
    
    System.out.print("¿Quiere ponerle un nombre? (si o no): ");
    String nombre = System.console().readLine();
    double precioNombre = 0;
    switch (nombre) {
      case "si":
        precioNombre = 2.75;
        break;
      case "no":
        precioNombre = 0;
        break;
      default:
        System.out.println("No ha introducido correctamente si quiere un nombre o no");
    }
    
    
    double precioTotal = precioSabor + precioNata + precioNombre;
    
    if (precioSabor == 18) {
      System.out.printf("Tarta de manzana: " + precioSabor + " € \n");
    }
    if (precioSabor == 16) {
      System.out.printf("Tarta de fresa: " + precioSabor + " € \n");
    }
    if (precioSabor == 14) {
      System.out.printf("Tarta de chocolate negro: " + precioSabor + " € \n");
    }
    if (precioSabor == 15) {
      System.out.printf("Tarta de chocolate blanco: " + precioSabor + " € \n");
    }
    
    if (precioNata == 2.50) {
      System.out.printf("Con nata: " + precioNata + " € \n");
    }
    
    if (precioNombre == 2.75) {
      System.out.printf("Con nombre: " + precioNombre + " € \n");
    }
    
    System.out.printf("Total: " + precioTotal + " € \n");
  }
}   
