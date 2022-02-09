package Ejer03_09;
public class Canario extends Ave {

  private int pinones; // número de piñones
  
  public Canario() {

  }

  public Canario(Sexo s) {
    super(s);
  }

  public void canta() {
    System.out.println("Tralaralariiiiiiii");
  }

  public void caza() {
    System.out.println("Los canarios no cazan");
  }

  public void pia() {
    System.out.println("Pio pio pio");
  }
}
