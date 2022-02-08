package Ejer05_09;
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

  private String tamano;
  private String tipo;
  private String estado;

  public static int totalServidas;
  public static int totalPedidas;

  public Pizza(){
  
    }

  public Pizza(String tamano, String tipo, String estado) {
    this.tamano = tamano;
    this.tipo = tipo;
    this.estado = "pedida";
    Pizza.totalPedidas++;
  }

  public String toString() {
    return "Pizza " + this.tipo + " " + this.tamano + ", " + this.estado;
  }

  public static int getTotalServidas() {
    return totalServidas;
  }

  public static int getTotalPedidas() {
    return totalPedidas;
  }
  
  public void sirve() {
    if (this.estado.equals("pedida")) {
    this.estado = "servida";
    Pizza.totalServidas++;
    } else {
    System.out.println("esa pizza ya se ha servido");
    }
  }
    

  public static void main(String[] args) {
    Pizza p1 = new Pizza("margarita", "mediana", "");
    Pizza p2 = new Pizza("funghi", "familiar", "");
    p2.sirve();
    Pizza p3 = new Pizza("cuatro quesos", "mediana", "");
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    p2.sirve();
    System.out.println("pedidas: " + Pizza.getTotalPedidas());
    System.out.println("servidas: " + Pizza.getTotalServidas());
  }
}