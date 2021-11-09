/**
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
 * nacimiento.
 *
 * @author Sergio Morales García
 */
public class Ejercicio10 {
  public static void main(String[] args) {
    System.out.println("ADVERTENCIA! Este programa puede tener contenido delicado para algunas personas. Solo se ha realizado esta actividad con el mero hecho de entretener. Gracias y disfruta. \n");
    System.out.println("A continuación mostraremos a que horóscopo perteneces.\n");
    System.out.print("Introduce el número del mes de tu nacimiento: ");
    double mes = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce el número del dia de tu nacimiento: ");
    double dia = Double.parseDouble(System.console().readLine());

    if (( mes > 12) || ( mes < 1) || ( dia > 31) || ( dia < 1))  {
      System.out.printf("Datos incorrectos");
    } 
    
    if ((( mes == 3) && (dia >= 21)) || ((mes == 4) && (dia <= 20))) {
      System.out.printf("Tristemente eres Aries \n");
    }
    
    if ((( mes == 4) && (dia >= 21)) || ((mes == 5) && (dia <= 21))) {
      System.out.printf("Eres Tauro, enorabuena. \n");
    } 
    
    if ((( mes == 5) && (dia >= 22)) || ((mes == 6) && (dia <= 21))) {
      System.out.printf("Si, eres Géminis, retirate. \n");
    }
    
    if ((( mes == 6) && (dia >= 22)) || ((mes == 7) && (dia <= 22))) {
      System.out.printf("No voy ha hacer ningún chiste al respecto, eres Cancer. \n");
    }
    
    if ((( mes == 7) && (dia >= 23)) || ((mes == 8) && (dia <= 21))) {
      System.out.printf("Creo que te has equivocado, aquí pone que eres Leo. \n");
    }
    
    if ((( mes == 8) && (dia >= 22)) || ((mes == 9) && (dia <= 23))) {
      System.out.printf("Ni tan mal, eres Virgo. \n");
    }
    
    if ((( mes == 9) && (dia >= 24)) || ((mes == 10) && (dia <= 23))) {
      System.out.printf("Libra, soy tu y espero un mes más para nacer \n");
    }
    
    if ((( mes == 10) && (dia >= 24)) || ((mes == 11) && (dia <= 22))) {
      System.out.printf("NAA DE LOCOS, ERES ESCORPIO, IMPRESIONANTE. \n");
    }
    
    if ((( mes == 11) && (dia >= 23)) || ((mes == 12) && (dia <= 22))) {
      System.out.printf("Serás Sagitario, pero no te nadie te quiere de todas formas. \n");
    }
    
    if ((( mes == 12) && (dia >= 23)) || ((mes == 1) && (dia <= 20))) {
      System.out.printf("Eres Capricornio y nadie se acuerda de cuando naciste. \n");
    }
    
    if ((( mes == 1) && (dia >= 21)) || ((mes == 2) && (dia <= 19))) {
      System.out.printf("Si eres Acuario has triunfado en la vida. \n");
    }
    
    if ((( mes == 2) && (dia >= 20)) || ((mes == 3) && (dia <= 20))) {
      System.out.printf("No sé por qué buscas tu horóscopo siendo Piscis. \n");
    }
  }
}
