/**
 * Escribe un programa que muestre 50 números enteros aleatorios comprendidos
 * entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
 * el máximo de los pares el mínimo de los impares y la media de todos los
 * números generados.
 *
 * @author Sergio Morales García
 * 
 */
public class Ejercicio019 {
  public static void main(String[] args) {
    System.out.println("El programa muestra 50 números enteros aleatorios entre -100 y 200 (ambos incluidos).");
    int contador = 50;
    int maximo = 0;
    int minimo = 199;
    int numAleatorio=0;
    int media = 0;
      
    for (int i = 1; i <= contador;i++){
      numAleatorio=(int)(Math.random()*301) -100;
        
      if ((numAleatorio % 2) == 0){
        if (numAleatorio > maximo){
        maximo = numAleatorio;
        }
      } else {
        if (numAleatorio < minimo){
        minimo = numAleatorio;
        }
          
      }
      media = media + numAleatorio;
      System.out.print(numAleatorio+" ");
  
    }
  
    System.out.println("");
    System.out.println("El numero maximo PAR es: "+maximo);
    System.out.println("El numero minimo IMPAR es: "+minimo);
    media = media / 50;
    System.out.println("La media total de los numeros es: "+media);
  }
}