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

  public static long voltea(long numeroIntroducido) {

    long numero = numeroIntroducido;
    long volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while

    return volteado;

  }

  public static long digitoN(long x, int i) {

    int n = i;
    long numero = x;
    long cifra = 0;
    long voltear = misfunciones.Funciones.voltea(numero);
    cifra = (voltear % 10);
    for (int comprobarPosicion = 0; comprobarPosicion < n; comprobarPosicion++){
        voltear = voltear / 10;

        cifra = (voltear % 10);
    }
    return (int) cifra;  
  }

  public static int posicionDeDigito(int n, int digito) {

    int result = 0;
    int nIntr = Funciones.voltea(n);
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