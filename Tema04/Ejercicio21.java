/**
 * Calcula la nota de un trimestre de la asignatura Programación. El programa
 * pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
 * Si la media de los dos controles da un número mayor o igual a 5, el alumno
 * está aprobado y se mostrará la media. En caso de que la media sea un número
 * menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
 * se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
 * ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
 * de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
 * la nota media anterior.
 *
 * @author Sergio Morales García Y David Antúnez Pérez
 */
public class Ejercicio21 {
    public static void main(String[] args) {
    System.out.println("Este programa indica cual es la media de la asignatura Programación.");
    System.out.print("Introduzca la nota del primer examen: ");
    double nota1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la nota del segundo examen: ");
    double nota2 = Integer.parseInt(System.console().readLine());
    double notaFinal = (nota1 + nota2) / 2;
    if (notaFinal >= 5){
        System.out.println("Tu media de la asignatura es: " + notaFinal);
    } 
   else if (notaFinal < 5){
      System.out.println("Has suspendido, tienes que presentarte a la recuperación.");
      System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto / no apto)");
      String resRecup;
      resRecup = System.console().readLine();
      switch (resRecup){
          case "apto":
          case "Apto":
          case "APTO":
          System.out.println("Tu media de la asignatura es: 5");
          break;
          case "no apto" :
          case "No apto":       case "NO APTO":
          case "No Apto":
            System.out.println("Tu media de la asignatura es: " + notaFinal);
          break;
          default:
          System.out.println("Lo siento, eso no es un resultado válido, debe escribir 'apto' o 'no apto'.");
      }
    }
  }
}
