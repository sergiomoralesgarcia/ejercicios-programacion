package Ejer02_09;
/**
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
 * kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
 * también algún método específico para cada una de las subclases. Prueba las
 * clases creadas mediante un programa con un menú como el que se muestra a
 * continuación:
 * 
 * @autor Sergio Morales García
 */

public class Vehiculo {

  private static int kilometrosTotales = 0;
  private static int vehiculosCreados = 0;

  private int kilometrosRecorridos;

  public Vehiculo() {
    this.kilometrosRecorridos = 0;
  }

  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }
    
  public static int getKilometrosTotales() {
    return Vehiculo.kilometrosTotales;
  }
    
  public void recorre(int k) {
    this.kilometrosRecorridos += k;
    Vehiculo.kilometrosTotales += k;
  }

  public static void main(String[] args) {
    int opcion = 0;
    int km;

    Bicicleta nieto = new Bicicleta(9);
    Coche ferrari = new Coche(1900);
    
    while (opcion != 8){
    System.out.println("1. Anda con la bicicleta");
    System.out.println("2. Haz el caballito con la bicicleta");
    System.out.println("3. Anda con el coche");
    System.out.println("4. Quema rueda con el coche");
    System.out.println("5. Ver kilometraje de la bicicleta");
    System.out.println("6. Ver kilometraje del coche");
    System.out.println("7. Ver kilometraje total");
    System.out.println("8. Salir");
    System.out.println("Elige una opción (1-8): ");
    
    opcion = Integer.parseInt(System.console().readLine());

    switch (opcion){
      case 1:
        System.out.print("¿Cuántos kilómetros quiere recorrer? ");
        km = Integer.parseInt(System.console().readLine());
        nieto.recorre(km);
        break;
      case 2:
        nieto.hazCaballito();
        break;
      case 3:
        System.out.print("¿Cuántos kilómetros quiere recorrer? ");
        km = Integer.parseInt(System.console().readLine());
        ferrari.recorre(km);
        break;
      case 4:
        ferrari.quemaRueda();
        break;
      case 5:
        System.out.println("La bicicleta lleva recorridos ");
        System.out.println(nieto.getKilometrosRecorridos() + " Km");
        break;
      case 6:
        System.out.println("El coche lleva recorridos ");
        System.out.println(ferrari.getKilometrosRecorridos() + " Km");
        break;
      case 7:
        System.out.println("Los vehículos llevan recorridos ");
        System.out.println(Vehiculo.getKilometrosTotales() + " Km");
      default:
      }
    }
  }
}

