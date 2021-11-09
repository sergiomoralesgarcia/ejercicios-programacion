/**
 * Escribe un programa que calcule el precio final de un producto según su
 * base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 * reducido o superreducido) y el código promocional. Los tipos de IVA general,
 * reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
 * promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 * respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
 * muestran los valores correctos, aunque los números no estén tabulados.
 *
 * @author Sergio Morales García
 */
public class Ejercicio23 {
    public static void main(String[] args) {
    System.out.println("Este programa calcula el precio final de un producto.");
    System.out.print("Introduzca el precio del producto sin IVA: ");
    double precioInicial = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca  el tipo de IVA (general, reducido o superreducido): ");
    String IVA = System.console().readLine();
    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    String codigo = System.console().readLine();
    
    int tipoIVA = 0;
    switch (IVA) { 
     case "general":
      tipoIVA = 21;
      break;
    case "reducido":
      tipoIVA = 10;
      break;
    case "superreducido":
      tipoIVA = 4;
      break;
    default:
      System.out.println("El IVA introucido no es correcto");
    }
    
    double IVAFinal = (precioInicial * tipoIVA / 100);
    double precioConIVA = precioInicial + IVAFinal;
    
    double tipoCodigo = 0;
    switch (codigo) { 
     case "nopro":
      tipoCodigo = 0;
      break;
    case "mitad":
      tipoCodigo = (precioConIVA / 2);
      break;
    case "menos5":
      tipoCodigo = 5;
      break;
    case "5porc":
      tipoCodigo = (precioConIVA * 0.05);
      break;
    default:
      System.out.println("El código introucido no es correcto");
    }
    double precioFinal = precioConIVA - tipoCodigo;
    
    System.out.printf("Base imponible %8.2f\n", precioInicial);
    System.out.printf("IVA %19.2f\n", IVAFinal);
    System.out.printf("Precio con IVA %8.2f\n", precioConIVA);
    System.out.printf("Cód. promo. %11.2f\n", tipoCodigo);
    System.out.println("-----------------------");
    System.out.printf("TOTAL %17.2f", precioFinal);
  }
}   
