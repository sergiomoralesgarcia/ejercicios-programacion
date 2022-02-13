

import Ejer14_09.FichaDomino;

/**
 * Utiliza la clase anterior para generar una secuencia de 8 fichas creadas de
 * forma aleatoria, que encajen bien y que estén bien colocadas según el juego
 * del dominó. No hay que controlar si se repiten o no las fichas
 * 
 * @author Sergio Morales García.
 */
public class FichaDomino2 {
  private int lado1;
  private int lado2;
  public FichaDomino2() {
  this.lado1 = (int) (Math.random() * 7);
  this.lado2 = (int) (Math.random() * 7);
  }
  public FichaDomino2(int lado1, int lado2) {
  this.lado1 = lado1;
  this.lado2 = lado2;
  }
  FichaDomino voltea() {
  return new FichaDomino(lado2, lado1);
  }
  boolean encaja(FichaDomino2 ficha) {
  return (lado1 == ficha.lado1) || (lado1 == ficha.lado2)
  || (lado2 == ficha.lado1) || (lado2 == ficha.lado2);
  }
  boolean encajaEnFila(FichaDomino2 ficha) {
  return lado2 == ficha.lado1;
  }
  @Override
  public String toString() {
  return "[" + (lado1 == 0 ? " " : lado1) + "|" + (lado2 == 0 ? " " : lado2) + ']';
  }
  public static void main(String[] args) {
    int cuentaFichas = 0;
    FichaDomino2[] fichas = new FichaDomino2[8];
    fichas[0] = new FichaDomino2();
    for (int i = 1; i < 8; i++) {
    FichaDomino2 aux;
    do {
    aux = new FichaDomino2();
    } while (!fichas[i - 1].encajaEnFila(aux));
    fichas[i] = aux;
    }
    for (FichaDomino2 ficha : fichas) {
      System.out.print(ficha);
      }
      }
      
  }
