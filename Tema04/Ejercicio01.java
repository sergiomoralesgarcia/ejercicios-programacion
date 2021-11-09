/**
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día. 
 *
 * @author Sergio Morales García
 */
public class Ejercicio01 {
  public static void main(String[] args) {   
    String diaSemana;   
    System.out.print("Por favor, introduzca un dia de la semana: ");
    diaSemana = (System.console().readLine());
    
    switch(diaSemana) {
      case "lunes":
        System.out.println ("A primera hora hay Programación");
        break;
      case "martes":
        System.out.println("A primera hora hay Sisitemas Informáticos");
        break;
      case "miércoles":
        System.out.println("A primera hora hay Programación");
        break;
      case "jueves":
        System.out.println("A primera hora hay Sisitemas Informáticos");
        break;
      case "viernes":
        System.out.println("A primera hora hay Programación");
        break;
      case "sábado":
        System.out.println("Estoy durmiendo");
        break;
      case "domingo":
         System.out.println("No hay clases");
        break;
      default:
        System.out.println("no es correcto el dato introducido");
    }
  }
}
