package Ejer13_09;
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

class CuentaCorriente {
  private String numero = "";
  private double saldo;

  public CuentaCorriente() {
    this.generaNumero();
  }

  public CuentaCorriente(double saldo) {
    this.generaNumero();
    this.saldo = saldo;
  }

  private void generaNumero() {
    for (int i = 0; i < 10; i++) {
      numero += (int) (Math.random() * 10);
    }
  }

  @Override
  public String toString() {
    return "Número de cta: " + numero + " Saldo: " + String.format("%.2f", saldo) + " €";
  }

  void ingreso(int dinero) {
    saldo += dinero;
  }

  void cargo(int dinero) {
    saldo -= dinero;
  }

  void transferencia(CuentaCorriente cuentaDestino, int dinero) {
    saldo -= dinero;
    cuentaDestino.saldo += dinero;
  }

  public static void main(String[] args) {
    CuentaCorriente cuenta1 = new CuentaCorriente();
    CuentaCorriente cuenta2 = new CuentaCorriente(1500);
    CuentaCorriente cuenta3 = new CuentaCorriente(6000);
    System.out.println(cuenta1);
    System.out.println(cuenta2);
    System.out.println(cuenta3);
    cuenta1.ingreso(2000);
    cuenta2.cargo(600);
    cuenta3.ingreso(75);
    cuenta1.cargo(55);
    cuenta2.transferencia(cuenta3, 100);
    System.out.println(cuenta1);
    System.out.println(cuenta2);
    System.out.println(cuenta3);
    
  }
}
