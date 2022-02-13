package Ejer16_09;

class Linea {
  private Punto origen;
  private Punto fin;

  public Linea(Punto origen, Punto fin) {
    this.origen = origen;
    this.fin = fin;
  }

  @Override
  public String toString() {
    return "Línea formada por los puntos " + origen + " y " + fin;
  }

  public static void main(String[] args) {
    Punto p1 = new Punto(4.21, 7.3);
    Punto p2 = new Punto(-2, 1.66);
    Linea l = new Linea(p1, p2);
    System.out.println(l);
    }
}
