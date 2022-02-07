/**
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos.
 * 
 * @autor Sergio Morales García
 */

public class Caballo {
  
  String tamaño;
  String nombre;
  String colorDePelo;
  String comida;
  String edad;

  public Caballo(){

  }

  public Caballo(String tamaño, String nombre, String colorDePelo, String comida, String edad) {
    this.tamaño = tamaño;
    this.nombre = nombre;
    this.colorDePelo = colorDePelo;
    this.comida = comida;
    this.edad = edad;
  }

  public Caballo(String nombre, String colorDePelo, String edad) {
    this.nombre = nombre;
    this.colorDePelo = colorDePelo;
    this.edad = edad;
  }

  public void come(){
    System.out.println("El caballo " + this.nombre + "come " + this.comida);
  } 

  public void lame(){
    System.out.println("El caballo de color " + this.colorDePelo + " te está lamiendo la mano");
  } 
}