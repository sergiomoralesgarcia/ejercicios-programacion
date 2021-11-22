/**
 * Realiza un programa que pinte por pantalla diez líneas formadas por
 * caracteres. El carácter con el que se pinta cada línea se elige de forma
 * aleatoria entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben
 * tener una longitud aleatoria entre 1 y 40 caracteres.
 *
 * @author Sergio Morales García
 */
public class Ejercicio010 {
  public static void main(String[] args) {

    System.out.println("Este programa muestra diez líneas de distintos carácteres y longitud. ");

    int longitud;
    int caracter;
    String tipoCaracter = "";

    for (int i = 1; i <=10 ; i++) {
      longitud = ((int) (Math.random() * 6));
      caracter = ((int) (Math.random() * 40) + 1);

      switch (caracter) {
        case 0:
          tipoCaracter = "*";
          break;
        case 1:
          tipoCaracter = "-";
          break;
        case 2:
          tipoCaracter = ".";;
          break;
        case 3:
          tipoCaracter = "@";
          break;
        case 4:
          tipoCaracter = "=";
          break;
        case 5:
          tipoCaracter = "|";
          break;
        default:
        }
    }
    for(int j = 1; j <= longitud; j++) {
      System.out.print(tipoCaracter);
    }
    System.out.println();
  }
}
