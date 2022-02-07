public class DualGestion {
  public static void main(String[] args) {
    System.out.println("DUAL GESTIÓN");
    System.out.println("=============");

    Alumno alumno1 = new Alumno();
    Alumno pepillo = new Alumno(1234, "José", " Antunez Parra", " 666 739245", 1998);
    Alumno alan = new Alumno(1234, "Antonio", " Rodrigez Linero", " 696 543556", " ESO", 2003, false);

/*    System.out.println(pepillo.getNombre()); */

/*    pepillo.estornuda("sinEstornudo");
    alan.estornuda("estornudo");*/

    Alumno alumno2 = new Alumno();
    Profesor profe1 = new Profesor();

    alumno2.saluda();
    profe1.explica();
    profe1.saluda();

    System.out.println("=============");
    System.out.println("Ejercicio 1");
    System.out.println("=============");

    
  }
}
