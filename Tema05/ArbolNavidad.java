/**
 * 
 * @author Sergio Morales García
 */
public class ArbolNavidad {
  public static void main(String[] args) {
    System.out.println("Este programa dibuja un árbol de navidad.");
    System.out.print("Por favor, introduzca la altura: ");
    int tronco = Integer.parseInt(System.console().readLine());
    int altura = tronco - 4;
    int pisos = 1;
    int espacios = altura - 1;
    int recorte = altura - 1;
    int base = 1;

    for (int j = 1; j <= tronco - 3; j++){
      System.out.print(" ");
    }
    System.out.print("⭐\n");
    while (pisos <= altura) {
      //for (int i = 1; i <= 1; i++) {
      //} 
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
        
      }
      System.out.print("  /");
      espacios--;


      for (int c = 1; c <= recorte - espacios; c++) {
        System.out.print(" ");
      }
      System.out.print("/");
      recorte+=1;

      for (int d = 1; d <= base - recorte - espacios; d++) {
        System.out.print("/");
      }

      System.out.println();
      pisos++;
      base += 2;
      
    }
    //longitud += 2;

    for (int j = 1; j <= tronco - 3; j++){
      System.out.print(" ");
    }
    System.out.print(" #\n");

    for (int j = 1; j <= tronco - 3; j++){
      System.out.print(" ");
    }
    System.out.print(" #");

  }
}