/**
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El
 * programa mostrará al final la calificación obtenida. Pásale el minicuestionario a
 * tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
 * en las diferentes asignaturas del curso.
 *
 * @author Sergio Morales García
 */
public class Ejercicio12 {
  public static void main(String[] args) {
    
    System.out.println("Examen tipo test 1º DAM");
    int puntos = 0;
    String respuesta;
    
    System.out.print("1.- Un ejemplo de medida de prevención es: \n ");
    System.out.println("a) Frenos ABS\n b) Airbag\n c) Unos guantes");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    System.out.print("2.- ¿Cuál de estos dispositivos son de entrada?: \n ");
    System.out.println("a) Monitor\n b) Teclado\n c) Altavoces");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;
    }
    System.out.print("3.- ¿Cuál es un tipo de organización de ficheros?: \n ");
    System.out.println("a) Secuencial\n b) Acceso directo\n c) Indirecto");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    System.out.print("4.- ¿Cuál de estos no es un subtipo de aplicaciones móviles?: \n ");
    System.out.println("a) WebApp\n b) Nativas\n c) De escritorio");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntos++;
    }
    System.out.print("5.- ¿Qué operador de comparación indica una variable distinta de otra?: \n ");
    System.out.println("a) >=\n b) ==\n c) !=");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntos++;
    }
    System.out.print("6.- ¿Qué comando tacha una palabra en html?: \n ");
    System.out.println("a) del\n b) ins\n c) mark");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    System.out.print("7.- La técnica preventiva que trata de evitar la fatiga en los tranajadores es: \n ");
    System.out.println("a) La medicina del trabajo\n b) La psicosociología\n c) La ergonomía");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntos++;
    }
    System.out.print("8.- Uno de los elementos de un sistema informático es: \n ");
    System.out.println("a) Las empresas\n b) Los usuarios\n c) La información");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;
    }
    System.out.print("9.- Un lenguaje de programación no está constituido por: \n ");
    System.out.println("a) Un alfabeto\n b) Una semántica\n c) Una red de datos ");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntos++;
    }
    System.out.print("10.- ¿Cuál de estos no es untipo de correspondencia?: \n ");
    System.out.println("a) De 1 a n\n b) De m a 0\n c) De m a n");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;
    }
    System.out.println("\nEn total has conseguido " + puntos + " puntos.");
  }
}

