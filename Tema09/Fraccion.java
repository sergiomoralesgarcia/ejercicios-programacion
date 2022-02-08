import java.util.function.DoubleFunction;

/**
 * Crea la clase Fracción. Los atributos serán numerador y denominador. Y
 * algunos de los
 * métodos pueden ser invierte, simplifica, multiplica, divide, etc.
 * 
 * @autor Sergio Morales García
 */

public class Fraccion {

  private double numerador; 
  private double denominador; 

  public Fraccion(){

  }

  public Fraccion(double numerador, double denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
  }
  
  public double getNumerador() {
    return numerador;
  }

  public double getDenominador() {
    return denominador;
  }

  public double invierte() {
    return Math.pow((numerador / denominador), -1);
  }

  public Fraccion simplifica() {
    int n = (int) (this.numerador);
    int d = (int) (this.denominador);
    for (int i = 2; i < Math.min(this.numerador, this.denominador); i++) {
      while (((n % i) == 0) && ((d % i) == 0)) {
        n /= i;
        d /= i;
      }
    }
    return new Fraccion(n, d);
  }

  public Fraccion multiplica(double n) {
    return new Fraccion(this.numerador * n, this.denominador * n);
  }

  public Fraccion multiplica(Fraccion f) {
      return new Fraccion(this.numerador * f.getNumerador(), this.denominador * f.getDenominador());
    }

  public Fraccion divide(Fraccion f) {
    return new Fraccion(this.numerador * f.getDenominador(), this.denominador * f.getNumerador());
  }

  public Fraccion divide(double n) {
    return new Fraccion(this.numerador / n, this.denominador / n);
  }

  public void mostrar() {
    System.out.println("Mi numerador es " + this.numerador + " y mi denominador es " + this.denominador);
  }

  public static void main(String[] args) {
    System.out.println("=============");
    System.out.println("Ejercicio 4");
    System.out.println("=============");

    Fraccion f1 = new Fraccion(10, 4);
    Fraccion f2 = new Fraccion(15, 3);
    System.out.println(f1.invierte());
    f1.multiplica(f2).mostrar();
    f2.multiplica(2.5).mostrar();
    f1.divide(f2).mostrar();
    f1.simplifica().mostrar();
  }
}
