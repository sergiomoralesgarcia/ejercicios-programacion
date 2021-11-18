/*
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
 * numero negativo y nos diga cuantos números se han introducido, la media de
 * los impares y el mayor de los pares. El número negativo sólo se utiliza para
 * indicar el final de la introducción de datos pero no se incluye en el cómputo.
 *
 * @author Sergio Morales García
 */
public class Ejercicio21 {
  public static void main(String[] args) {
    System.out.println("Vaya introduciendo números.");
    System.out.println("Se parará al introducir un número negativo.");

    
    int numeroIntroducido;
    int numeroDigitos = 0;
    int sumaImpares = 0;
    int numeroDeElementosImpares = 0;
    int maximoPar = 0;
    
    do {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numeroIntroducido >= 0) {
        numeroDigitos++;
        if ((numeroIntroducido % 2) == 1) { // número impar
          sumaImpares += numeroIntroducido;
          numeroDeElementosImpares++;
        } else { // número par
          if (numeroIntroducido > maximoPar)
            maximoPar = numeroIntroducido;
        }
      }
    } while (numeroIntroducido >= 0);

    System.out.println("Ha introducido " + numeroDigitos + " números");
    System.out.println("La media de los impares es " + sumaImpares/numeroDeElementosImpares);
    System.out.println("El máximo de los pares es " + maximoPar);
  }
}