/**
 * Queremos gestionar la venta de entradas (no numeradas) de Expocoches
 * Campanillas que tiene 3 zonas, la sala principal con 1000 entradas
 * disponibles, la zona
 * de compra-venta con 200 entradas disponibles y la zona vip
 * con 25 entradas disponibles. Hay que controlar que existen entradas antes de
 * venderlas.
 * 
 * @author Sergio Morales García.
 */

public class Zona {

  private int entradasPorVender;

  public Zona(int n) {
    entradasPorVender = n;
  }

  public int getEntradasPorVender() {
    return entradasPorVender;
  }

  /**
   * Vende un número de entradas.
   * Comprueba si quedan entradas libres antes de realizar la venta.
   *
   * @param n número de entradas a vender
   */

  public void vender(int n) {
    if (this.entradasPorVender == 0) {
      System.out.println("Lo siento, las entradas para esa zona están agotadas.");
    } else if (this.entradasPorVender < n) {
      System.out.println("Sólo me quedan " + this.entradasPorVender
          + " entradas para esa zona.");
    }
    if (this.entradasPorVender >= n) {
      entradasPorVender -= n;
      System.out.println("Aquí tiene sus " + n + " entradas, gracias.");
    }
  }
  
  public static void main(String[] args) {
    int opcion = 0;
    int opcion2 = 0;
    int numeroEntradas;

    Zona principal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);
    
    while (opcion != 3){
    System.out.println("1. Mostrar número de entradas libres");
    System.out.println("2. Vender entradas");
    System.out.println("3. Salir");
    System.out.println("Elige una opción (1-3): ");
    
    opcion = Integer.parseInt(System.console().readLine());

    switch (opcion){
      case 1:
        System.out.println("Quedan por vender " + principal.entradasPorVender + " entradas en la  sala principal");
        System.out.println("Quedan por vender " + compraVenta.entradasPorVender + " entradas en la zona compra-venta");
        System.out.println("Quedan por vender " +vip.entradasPorVender + " entradas en la  sala vip");
        break;
      case 2:
        System.out.println("\n\n1. Principal");
				System.out.println("2. Compra-venta");
				System.out.println("3. Vip");
				System.out.print("Elige la zona para la que quieres comprar las entradas: ");
				
				opcion2 = Integer.parseInt(System.console().readLine());
				
				System.out.print("¿Cuántas entradas quieres? ");
				numeroEntradas = Integer.parseInt(System.console().readLine());
				
				switch ( opcion2 ) {
					case 1 : principal.vender(numeroEntradas);	break;
					case 2 : compraVenta.vender(numeroEntradas);	break;
					case 3 : vip.vender(numeroEntradas);
      default:
        }
      }
    }
  }
}


