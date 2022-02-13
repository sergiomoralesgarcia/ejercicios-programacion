package misfunciones;

/**
 * Realiza figuras
 */

public class Funciones {
  /**
   * Crea una linea de asteriscos de una longitud determinada
   * 
   * @param longitud tamaño de la línea
   * @return una línea de asteriscos
   */
  
  public static boolean esCapicua(long numero) {

    long volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while

    if (volteado == 56788765) {
      return true;
    } else {
      return false;
    }

  }

  public static boolean esPrimo(int numero) {

    if (numero <= 1) {
      return false;
    }

    for (int i = (int) Math.sqrt(numero); i > 1; i--) {
      if (numero % i == 0) {
        return false;
      }
    }

    return true;
  }

  public static int siguientePrimo(int n) {
    int result; // resultado final
    boolean esPrimo = true;
    do {
      // Comprueba Primo
      esPrimo = true;

      for (int i = 2; i < n; i++) {
        if ((n % i) == 0) {
          esPrimo = false;
        }
      }
      if (!esPrimo) { // si no es primo, pasa al número siguiente
        n++;
      }
    } while (!esPrimo);
    result = n;
    return result;
  }

  public static int potencia(int base, int exponente) {
    int result = (int) (Math.pow(base, exponente)); // elevamos la base al exponente y ya tenemos el resultado
    return result;
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

  public static int voltea(int n) {
    int inv = 0;
    while (n > 0) {
      inv = (inv * 10) + (n % 10);
      n /= 10;
    }
    return inv;
  }

  public static long digitoN(int n, int posicion) {
    n = voltea(n);
    while (posicion-- > 0) {
      n = n / 10;
    }
    return (int) n % 10;
  }

/**
 * 8.
 * Da la posición de la primera ocurrencia de un dígito
 * dentro de un número entero. Si no se encuentra, devuelve -1.
 * Las posiciones comienzan desde 0 hasta el numero mayor de digitos.
 * 
 * @param n      número a introducir
 * @param digito dígito del cual obtendremos la posición
 * @return posicion del dígito o -1 si no la encuentra
 */

  public static int posicionDeDigito(int n, int digito) {
    int result = 0;
    int nIntr = voltea(n);
    boolean trueResult = false; // verificar que result tenga un valor
    int cifra = nIntr;
    int cogNum = 0;
    int contcif = 0;
    for (int i = 1; i <= nIntr; i *= 10) {
      cogNum = cifra % 10;
      if (cogNum == digito) {
        result = contcif;
        trueResult = true;
      }
      cifra = (cifra - cogNum) / 10;
      if (!trueResult) {
        contcif++;
      }
    }
    if (!trueResult) {
      result = -1;
    }
    return result;
  }
}