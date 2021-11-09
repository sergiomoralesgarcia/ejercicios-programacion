/**
 * Realiza un programa que calcule el precio de unas entradas de cine en función
 * del número de personas y del día de la semana. El precio base de una entrada
 * son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los
 * jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
 * Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
 * grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
 * que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
 * 1 individual que son 41 euros (33 + 8).
 *
 * @author Sergio Morales García
 */
public class Ejercicio26 {
    public static void main(String[] args) {
    System.out.println("Venta de entradas CineCampa");
    System.out.print("Número de entradas: ");
    int entradas = Integer.parseInt(System.console().readLine());
    System.out.print("Día de la semana: ");
    String dia = System.console().readLine();
    System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
    String tarjeta = System.console().readLine();
    
    
    double precio = 0;
      switch (dia) {
        case "lunes":
        case "Lunes":
        case "martes":
        case "Martes":
        case "viernes":
        case "Viernes":
        case "sabado":
        case "Sabado":
        case "domingo":
        case "Domingo":
          precio = 8 * entradas;
          break;
        case "miércoles":
        case "miercoles":
        case "Miércoles":
        case "Miercoles":
          precio = 5 * entradas;
          break;
        case "jueves":
        case "Jueves":
          if (entradas % 2 == 0){
          precio = (entradas / 2) * 11;
         } else {
          precio = ((entradas -1) / 2) * 11 + 8;
         } 
          break;
        
        default:
          System.out.print("el dia introducido no es correcto");
      }
      
    double descuento = 0;
    switch (tarjeta) {
      case "s":
        descuento = precio * 0.1;
        break;
      case "n":
        descuento = 0;
        break;
      default:
        System.out.println("No ha introducido correctamente si tiene la tarjeta o no");
    }
    
    double total = precio - descuento;
    
    System.out.print("Aquí tiene sus entradas. Gracias por su compra.\n");
    if (dia.equals("jueves")) {
      if (entradas % 2 == 0){
        System.out.printf("Entradas parejas:      " +  entradas / 2 + " \n") ;
        System.out.printf("Precio por entrada de pareja:       " +  11 + " € \n");
        } else {
        System.out.printf("Entradas parejas:      " + (entradas - 1) / 2 + " \n");
        System.out.printf("Precio por entrada de pareja:       " + (precio - 8) + " € \n");
        System.out.printf("Entradas individuales:       " + 1 + " \n");
        System.out.printf("Precio por entrada individual:        " + 8 + " € \n");
         } 
    } else {
      System.out.print("Entradas individuales:             " + entradas + " \n");
      System.out.print("Precio por entrada individual:     " + precio / entradas + " € \n");
      }
    System.out.printf("Total:                      " + precio + " € \n");
    System.out.printf("Descuento:                      " + descuento + " € \n");
    System.out.printf("A pagar:                       " + total + " € \n");
  }
}
