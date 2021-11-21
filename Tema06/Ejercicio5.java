/**
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 * separados por espacios. Muestra también el máximo, el mínimo y la media
 * de esos números.
 *
 * @author Sergio Morales García
 */
public class Ejercicio5 {
  public static void main(String[] args) {

    System.out.println("Este programa muestra 50 números enteros aleatorios entre 100 y 199 ");

    int numeros;
    int maximo = 100;
    int minimo = 199;
    int suma = 0;

    for (int i = 1; i <= 50; i++) {
      numeros = ((int) (Math.random() * 100 + 100));
      System.out.print(numeros + " ");
      if (numeros > maximo){
        maximo = numeros;
      }
      if (numeros < minimo){
        minimo = numeros;
      }
      suma += numeros;
      
      } 
    System.out.println("\nEl mínimo es " + minimo);
    System.out.println("El máximo es " + maximo);
    System.out.println("La media es " + suma / 50);
  }
}
