/**
 * Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
 * se necesita saber el tamaño - mediana o familiar - el tipo - margarita,
 * cuatro
 * quesos o funghi - y su estado - pedida o servida. La clase debe almacenar
 * información sobre el número total de pizzas que se han pedido y que se
 * han servido. Siempre que se crea una pizza nueva, su estado es “pedida”. El
 * siguiente código del programa principal debe dar la salida que se muestra:
 * 
 * @autor Sergio Morales García
 */

public class Pizza {

  String tamano;
  String tipo;
  String estado;

  public Pizza(){
  
    }

  public Pizza(String tamano, String tipo, String estado) {
    this.tamano = tamano;
    this.tipo = tipo;
    this.estado = estado;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public double sirve() {
    return ();
  }

  public double pide() {
    return Math.pow((numerador / denominador), -1);
  }



}