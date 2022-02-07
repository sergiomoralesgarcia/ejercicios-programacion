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

  String vehiculosCreados;
  double kilometrosTotales;
  double kilometrosRecorridos;


  public Vehiculo(){

  }

  public Vehiculo(String vehiculosCreados, double kilometrosTotales, double kilometrosRecorridos) {
    this.vehiculosCreados = vehiculosCreados;
    this.kilometrosTotales = kilometrosTotales;
    this.kilometrosRecorridos = kilometrosRecorridos;
  }

  

}

