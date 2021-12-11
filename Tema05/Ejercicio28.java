/**
 * Escribe un programa que calcule el factorial de un número entero leído por
 * teclado.
 * 
 * @author Sergio Morales García
 */
public class Ejercicio28 {
  public static void main(String[] args) {
    int numeroIntroducido;
    
    // Lee un número mayor o igual que 0
    do {
      System.out.print("Por favor, introduzca un número entero: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numeroIntroducido < 0) {
        System.out.println("El número introducido no es correcto.");
      }
    } while (numeroIntroducido < 0);

    int factorial = numeroIntroducido;
    
    if (numeroIntroducido == 0) {
      System.out.println("El factorial del " + numeroIntroducido + " es 1.");
    } else {
      for (int i = 1; i < numeroIntroducido; i++) {
        factorial *= i;
      }

      System.out.println(numeroIntroducido + "! = " + factorial);
    }
  }
}
