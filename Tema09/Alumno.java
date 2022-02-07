public class Alumno {
  int numeroExpediente;
  String nombre;
  String apellidos;
  String telefono;
  String estudiosPrevios = "Bachillerato";
  int anoNacimiento;
  boolean esRepetidor;
  String[] codigosAsignatura;
  
  public Alumno(){

  }

  public Alumno(int numeroExpediente, String nombre, String apellidos, String telefono, int anoNacimiento) {
    this.numeroExpediente = numeroExpediente;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.telefono = telefono;
    this.anoNacimiento = anoNacimiento;
  }

  public Alumno(int numeroExpediente, String nombre, String apellidos, String telefono, String estudiosPrevios, int anoNacimiento, boolean esRepetidor) {
    this.numeroExpediente = numeroExpediente;
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.telefono = telefono;
    this.estudiosPrevios = estudiosPrevios;
    this.anoNacimiento = anoNacimiento;
    this.esRepetidor = esRepetidor;
  }

  public void saluda(){
    System.out.println("Hola soy " + this.nombre);
  } 

  public void saluda(String intensidad){
    String cadena = "Hola soy " + this.nombre;

    switch(intensidad){
      case "fuerte":
        cadena = cadena.toUpperCase();
        break;
      case "débil":
        cadena = cadena.toLowerCase();
        break;
      default:
    }
    System.out.println(cadena);
  } 

  public void estornuda(String repeticiones){

    switch(repeticiones){
      case "sinEstornudo":
        System.out.println("Soy " + this.nombre + " y nací en el año" + " " + this.anoNacimiento);
        break;
      case "estornudo":
        System.out.println("Soy " + this.nombre + " y nací en el año" + "... AAAAACHU AAAACHU AAAACHU, perdon, en el " + this.anoNacimiento);
        break;
      default:
    }
  }

  public String getNombre() {
    return this.nombre;
  }


}

