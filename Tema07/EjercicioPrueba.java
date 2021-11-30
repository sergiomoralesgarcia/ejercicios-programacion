/**
 * Ejemplo de uso de arrays
 * 
 * @author Sergio Morales García
 */
public class EjercicioPrueba {
  public static void main(String[] args) {
    // define la estructura array
    // double[] precios;

    // reserva memoria
    // precios = new double[5];

    double[] precios = new double[5];

    precios[0] = 350;
    precios[1] = 500;
    precios[2] = 499;
    precios[3] = 300;
    precios[4] = 400;
    
    System.out.printf("%.2f", precios[0]);
    System.out.printf("%.2f", precios[1]);
    System.out.printf("%.2f", precios[2]);
    System.out.printf("%.2f", precios[3]);
    System.out.printf("%.2f", precios[4]);


    System.out.println();
  }
}