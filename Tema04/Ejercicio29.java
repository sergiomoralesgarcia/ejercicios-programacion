/**
 * Realiza un programa que calcule el precio de un desayuno. El programa
 * preguntará primero qué ha tomado el usuario de comer: palmera, donut o
 * pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
 * programa debe preguntar además si era con aceite o con tortilla; el primero
 * vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
 * café a 1’50 y 1’20 respectivamente.
 *
 * @author Sergio Morales García
 */
public class Ejercicio29 {
    public static void main(String[] args) {
    System.out.println("Este programa calcula el precio de un desayuno.");
    System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
    String comida = System.console().readLine();
    
    double precioComida = 0;
    switch (comida) {
      case "palmera":
        precioComida = 1.40;
        break;
      case "donut":
        precioComida = 1.00;
        break;
      case "pitufo":
        System.out.print("¿Con qué se ha tomado el pitufo? (aceite o tortilla): ");
        String complemento = System.console().readLine();
        if (complemento.equals("aceite")){
          precioComida = 1.20;
        }
        else if (complemento.equals("tortilla")){
          precioComida = 1.60;
        }
        break;
      default:
        System.out.println("No ha introducido correctamente la comida");
    }
    
    System.out.print("¿Qué ha tomado de beber? (zumo o café): ");
    String bebida = System.console().readLine();
    double precioBebida = 0;
    switch (bebida) {
      case "zumo":
        precioBebida = 1.50;
        break;
      case "café":
        precioBebida = 1.20;
        break;
      default:
        System.out.println("No ha introducido correctamente la bebida");
    }
    
    
    double precioTotal = precioComida + precioBebida;
    
    if (precioComida == 1.40) {
      System.out.printf("Palmera: " + precioComida + " € \n");
    }
    if (precioComida == 1.00) {
      System.out.printf("Donut: " + precioComida + " € \n");
    }
    if (precioComida == 1.60) {
      System.out.printf("Pitufo con tortilla: " + precioComida + " € \n");
    }
    if (precioComida == 1.20) {
      System.out.printf("Pitufo con aceite: " + precioComida + " € \n");
    }
    
    if (precioBebida  == 1.50) {
      System.out.printf("Con zumo: " + precioBebida + " € \n");
    }
    if (precioBebida  == 1.20) {
      System.out.printf("Con café: " + precioBebida + " € \n");
    }
    
    System.out.printf("Total: %.2f\n ", precioTotal, " € \n");
  }
}   
