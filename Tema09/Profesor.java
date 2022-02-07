public class Profesor extends Persona {

  public void explica() {
    System.out.println("Estoy explicando POO");
  }

  @Override
  public void saluda() {
    System.out.println("Buenos días");
  }
}