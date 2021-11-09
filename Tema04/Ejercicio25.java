/**
 * La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
 * máxima calidad y nos ha pedido hacer un configurador que calcule el precio
 * según el alto y el ancho. El precio base de una bandera es de un céntimo de
 * euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
 * se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
 * son 3.25 €. El IVA ya está incluido en todas las tarifas.
 *
 * @author Sergio Morales García
 */
public class Ejercicio25 {
    public static void main(String[] args) {
    System.out.println("Este programa genera la nómina de un empleado.");
    System.out.print("Introduzca la altura de la bandera en cm: ");
    double alto = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora introduzca la anchura: ");
    double ancho = Integer.parseInt(System.console().readLine());
    
    System.out.print("¿Quiere escudo bordado? (s/n): ");
    String escudo = System.console().readLine();
    
    double precioEscudo = 0;
    switch (escudo) {
      case "s":
        precioEscudo = 2.50;
        break;
      case "n":
        precioEscudo = 0;
        break;
      default:
        System.out.println("No ha introducido correctamente si quiere el escudo o no");
    }
    
    double tamaño = (alto * ancho);
    double  precioTamaño = tamaño * 0.01;
    double precioTotal = precioTamaño + precioEscudo + 3.25;
    
    System.out.print("Gracias. Aquí tiene el desglose de su compra.\n");
    System.out.printf("Bandera de " + tamaño + " cm²     " + precioTamaño + " € \n" );
    
    if (precioEscudo == 2.50) {
      System.out.printf("Con escudo               " + precioEscudo + " € \n");
    }
    if (precioEscudo == 0) {
      System.out.printf("Sin escudo               " + precioEscudo + " € \n");
    }
    System.out.print("Gastos de envío          " + 3.25 + " € \n");
    System.out.printf("Total:                   " + precioTotal + " € \n");
  }
}   
