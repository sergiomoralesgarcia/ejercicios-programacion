/**
 * Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos
 * está siendo infiel. El programa irá haciendo preguntas que el usuario contestará
 * con verdadero o falso. Cada pregunta contestada como verdadero sumará 3
 * puntos. Las preguntas contestadas con falso no suman puntos. A continuación
 * se listan las preguntas del test.
 *  1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo
 *     aparente.
 *  2. Ha aumentado sus gastos de vestuario
 *  3. Ha perdido el interés que mostraba anteriormente por ti
 *  4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se
 *     arregla el pelo y se asea con más frecuencia (si es mujer)
 *  5. No te deja que mires la agenda de su teléfono móvil
 *  6. A veces tiene llamadas que dice no querer contestar cuando estás tú
 *     delante
 *  7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a
 *  8. Muchos días viene tarde después de trabajar porque dice tener mucho
 *     más trabajo
 *  9. Has notado que últimamente se perfuma más
 * 10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo
 * 
 * A continuación se muestran los mensajes que deberá dar el programa según
 * la puntuación obtenida.
 *   • Puntuación entre 0 y 10: ¡Enhorabuena! tu pareja parece ser totalmente
 *     fiel.
 *   • Puntuación entre 11 y 22: Quizás exista el peligro de otra persona en su
 *     vida o en su mente, aunque seguramente será algo sin importancia. No
 *     bajes la guardia.
 *   • Puntuación entre 22 y 30: Tu pareja tiene todos los ingredientes para estar
 *     viviendo un romance con otra persona. Te aconsejamos que indagues un
 *     poco más y averigües que es lo que está pasando por su cabeza.
 *
 * @author Sergio Morales García
 */
public class Ejercicio16 {
  public static void main(String[] args) {
    
    System.out.println("Examen tipo test 1º DAM");
    int puntos = 0;
    String respuesta;
    
    System.out.print("1.- Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente. \n ");
    System.out.println("a) Verdadero \n b) Falso");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    System.out.print("2.- Ha aumentado sus gastos de vestuario. \n ");
    System.out.println("a) Verdadero \n b) Falso");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    System.out.print("3.- Ha perdido el interés que mostraba anteriormente por ti. \n ");
    System.out.println("a) Verdadero \n b) Falso");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    System.out.print("4.- No te deja que mires la agenda de su teléfono móvil. \n ");
    System.out.println("a) Verdadero \n b) Falso");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    System.out.print("5.- Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer). \n ");
    System.out.println("a) Verdadero \n b) Falso");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    System.out.print("6.- A veces tiene llamadas que dice no querer contestar cuando estás tú delante. \n ");
    System.out.println("a) Verdadero \n b) Falso");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    System.out.print("7.- Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a. \n ");
    System.out.println("a) Verdadero \n b) Falso");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    System.out.print("8.- Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo \n ");
    System.out.println("a) Verdadero \n b) Falso");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    System.out.print("9.- Has notado que últimamente se perfuma más. \n ");
    System.out.println("a) Verdadero \n b) Falso");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    System.out.print("10.- Se confunde y te dice que ha estado en sitios donde no ha ido contigo. \n ");
    System.out.println("a) Verdadero \n b) Falso");
    System.out.print("Respuesta:");
    respuesta = System.console().readLine();
    
    if (respuesta.equals("a")) {
      puntos++;
    }
    int puntuacion = (puntos * 3);
    System.out.println("\nEn total has conseguido " + puntuacion + " puntos.");
    if (( puntuacion <= 10) && (puntuacion >= 0))  {
      System.out.printf("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
    } 
    if (( puntuacion < 22) && (puntuacion >= 11))  {
      System.out.printf(": Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia");
    }  
    if (( puntuacion <= 30) && (puntuacion >= 22))  {
      System.out.printf("¡Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
    } 
  }
}
