package Ejer14_09;
/**
 * Se quiere informatizar una biblioteca. Crea las clases Publicacion, Libro y
 * Revista. Las clases deben estar implementadas con la jerarquía correcta. Las
 * características comunes de las revistas y de los libros son el código ISBN,
 * el
 * título, y el año de publicación. Los libros tienen además un atributo
 * prestado.
 * Cuando se crean los libros, no están prestados. Las revistas tienen un
 * número.
 * La clase Libro debe implementar la interfaz Prestable que tiene los métodos
 * presta, devuelve y estaPrestado.
 * 
 * @author Sergio Morales García.
 */

public class FichaDomino {
  private int lado1;
  private int lado2;

  public FichaDomino(int lado1, int lado2) {
    this.lado1 = lado1;
    this.lado2 = lado2;
  }

  FichaDomino voltea() {
    return new FichaDomino(lado2, lado1);
  }

  boolean encaja(FichaDomino ficha) {
    return (lado1 == ficha.lado1) || (lado1 == ficha.lado2) ||
        (lado2 == ficha.lado1) || (lado2 == ficha.lado2);
  }

  @Override
  public String toString() {
    return "[" + lado1 + " | " + (lado2 == 0 ? " " : lado2) + ']';
  }

  public static void main(String[] args) {
    FichaDomino f1 = new FichaDomino(6, 1);
    FichaDomino f2 = new FichaDomino(0, 4);
    FichaDomino f3 = new FichaDomino(3, 3);
    FichaDomino f4 = new FichaDomino(0, 1);
    System.out.println(f1);
    System.out.println(f2);
    System.out.println(f3);
    System.out.println(f4);
    System.out.println(f2.voltea());
    System.out.println(f2.encaja(f4));
    System.out.println(f1.encaja(f4));
    System.out.println(f1.encaja(f3));
    System.out.println(f1.encaja(f2));
    }


}
