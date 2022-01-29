/**
 * 8. Funciones
 *
 * Ejercicio 5
 *
 * @author Sergio Morales García
 */
public class Ejer05_08 {
  public static void main(String[] arg){

    System.out.println(digitos(36697));
    
  }

  public static int digitos(int n) {
    // Separa número del último al primero
    int numInt = n;
    int contCif = 0;
    int cifra = numInt;
    int cogNum = 0;
    for (int i = 1; i <= numInt; i *= 10) {
      cogNum = cifra % 10;
      cifra = (cifra - cogNum) / 10;
      contCif++;
    }
    return contCif;
    }
  }