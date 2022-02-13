package Ejer17_09;
/**
 * Implementa las clases Piramide y Rectangulo. Sobre una pirámide se debe
 * saber su altura y sobre un rectángulo se debe saber tanto la base como la
 * altura. Cada una de las clases debe tener un atributo de clase (static) que
 * lleve la cuenta de las pirámides y de los rectángulos creados
 * respectivamente.
 * El siguiente código que va dentro del main genera la salida que se indica.
 * 
 * @author Sergio Morales García.
 */

class Rectangulo {
  private int base;
  private int altura;
  private static int rectangulosCreados;

  public Rectangulo(int base, int altura) {
    this.base = base;
    this.altura = altura;
    rectangulosCreados++;
  }

  public static int getRectangulosCreados() {
    return rectangulosCreados;
  }

  @Override
  public String toString() {
    String cadena = "";
    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < base; j++) {
        cadena += '*';
      }
      cadena += '\n';
    }
    return cadena;
  }
}
