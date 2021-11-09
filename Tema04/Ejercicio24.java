/**
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado
 * según las siguientes condiciones:
 *  • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
 *    de proyecto), los días que ha estado de viaje visitando clientes durante el
 *    mes y su estado civil (1 - Soltero, 2 - Casado).
 *  • El sueldo base según el cargo es de 950, 1200 y 1600 euros según
 *    si se trata de un prog. junior, un prog. senior o un jefe de proyecto
 *    respectivamente.
 *  • Por cada día de viaje visitando clientes se pagan 30 euros extra en
 *    concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
 *    un 25% en caso de estar soltero y un 20% en caso de estar casado.
 *
 * @author Sergio Morales García
 */
public class Ejercicio24 {
    public static void main(String[] args) {
    System.out.println("Este programa genera la nómina de un empleado.");
    System.out.println("Introuce el cargo del empleado:");
    System.out.println(" ---------------------------------------");
    System.out.println(" 1. Programador junior");
    System.out.println(" 2. Programador senior");
    System.out.println(" 3. Jefe de proyecto");
    System.out.print("\n Introduzca el cargo del empleado(1-3): ");
    int cargo = Integer.parseInt(System.console().readLine());
    
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes?: ");
    int dias = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca su estado civil (1- Soltero, 2- Casado): ");
    int estadoCivil = Integer.parseInt(System.console().readLine());
    
    double sueldoBase = 0;
    switch (cargo) {
      case 1:
        sueldoBase = 950;
        break;
      case 2:
        sueldoBase = 1200;
        break;
      case 3:
        sueldoBase = 1600;
        break;
      default:
        System.out.println("El cargo introucido no es correcto");
    }
    
    if (dias < 0){
        System.out.println("El número de dias introducido no es correcto");
    }
    
    int tipoEstado = 0;
    switch (estadoCivil) { 
      case 1:
        tipoEstado = 25;
        break;
      case 2:
        tipoEstado = 20;
        break;
      default:
        System.out.println("El estado civil introucido no es correcto");
    }
    
    double dietas = (dias * 30);
    double estado = (tipoEstado * (sueldoBase + dietas)) / 100;
    double salario = sueldoBase + dietas - estado;
    
    System.out.print("-----------------------");
    System.out.printf("\n Sueldo base %12.2f\n", sueldoBase);
    System.out.printf(" Dietas (" + dias + " viajes) %6.2f\n", dietas);
    System.out.print("-----------------------");
    System.out.printf("\n Sueldo bruto %11.2f\n", sueldoBase + dietas);
    System.out.printf(" Retención IRPF %9.2f\n", estado);
    System.out.print("-----------------------");
    System.out.printf("\n Sueldo neto %12.2f", salario);
  }
}   
