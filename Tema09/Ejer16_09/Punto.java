package Ejer16_09;
/**
 * Crea las clases Punto y Linea. De un punto se tienen que saber sus
 * coordenadas x e y, mientras que una línea está definida por dos puntos. 
 * Define las clases y los métodos necesarios para que el siguiente código 
 * muestre la salida que se indica.
 * 
 * @author Sergio Morales García.
 */

public class Punto {
  private double x;
  private double y;

  public Punto(double x, double y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "(" + x + ", " + y + ")";
  }
}
