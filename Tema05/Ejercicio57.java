/**
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura.
 * 
 * @author Sergio Morales García
 */
public class Ejercicio57 {
  public static void main(String[] args) {

    System.out.print("Introduzca la altura de la figura: ");
    int altura = Integer.parseInt(System.console().readLine()) ;
    int numEspacios = 1;
    for (int i = 0; i < altura;i++){
      System.out.print("*");
    }
    System.out.println("");
    while (altura -1 > 0){
      for (int i = 0; i < numEspacios; i++){
        System.out.print(" ");
      }
      for (int i = 0; i < altura -1; i++){
        if ( i == altura -2){
          System.out.print("*");
        }else if( i < 1 ){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println("");
      altura--;
      numEspacios++;
      
    }
  }
}