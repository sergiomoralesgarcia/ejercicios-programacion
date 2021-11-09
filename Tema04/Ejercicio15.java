/**
 * Escribe un programa que pinte una pirámide rellena con un carácter introducido
 * por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
 * etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
 * de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
 * hacia la derecha.
 *
 * @author Sergio Morales García
 */
public class Ejercicio15 {
  public static void main(String[] args) {
  
    System.out.println("Decide para que lado apunta la pirámide");
    System.out.println(" ---------------------------------------");
    System.out.println(" 1. Arriba");
    System.out.println(" 2. Abajo");
    System.out.println(" 3. Derecha");
    System.out.println(" 4. Izquierda");
    System.out.print("\n Elija una opción (1-4): ");
  
    int opcion = Integer.parseInt(System.console().readLine());

    switch (opcion) {
      case 1:
        System.out.println("     +       ");
        System.out.println("    +++      ");
        System.out.println("   +++++     ");
        System.out.println("  +++++++    ");
        System.out.println(" +++++++++   ");
        System.out.println("+++++++++++  ");
        
        break;
    
      case 2:
        System.out.println("+++++++++++ ");
        System.out.println(" +++++++++  ");
        System.out.println("  +++++++   ");
        System.out.println("   +++++    ");
        System.out.println("    +++     ");
        System.out.println("     +      ");
      
        break;
    
      case 3:
        System.out.println("+            ");
        System.out.println("+ +          ");
        System.out.println("+ + +        ");
        System.out.println("+ + + +      ");
        System.out.println("+ + + + +    ");
        System.out.println("+ + + +      ");
        System.out.println("+ + +        ");
        System.out.println("+ +          ");
        System.out.println("+            ");
        break;
        
      case 4:
        System.out.println("        +     ");
        System.out.println("      + +     ");
        System.out.println("    + + +     ");
        System.out.println("  + + + +     ");
        System.out.println("+ + + + +     ");
        System.out.println("  + + + +     ");
        System.out.println("    + + +     ");
        System.out.println("      + +     ");
        System.out.println("        +     ");
        break;
        
      default:
        System.out.print("\nLo siento, la opción elegida no es correcta.");
    }
  }
}
