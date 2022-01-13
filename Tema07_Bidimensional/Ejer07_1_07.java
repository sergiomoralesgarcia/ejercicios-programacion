/**
 * Mejora el juego “Busca el tesoro” de tal forma que si hay una mina a una
 * casilla de distancia, el programa avise diciendo ¡Cuidado! ¡Hay una mina
 * cerca!
 * 
 * @author Sergio Morales García
 */
public class Ejer07_1_07 {
    public static void main(String[] args) {

    // Se inicia el array
    int[][] tablero = new int[5][4];

    int x;
    int y;

    for (x = 0; x < 4; x++){
      for (y = 0; y < 3; x++){
        tablero[x][y] = 0;
      }
    }

    // Se coloca la mina y el tesoro

    int minaX;
    int minaY;

    minaX = (int)(Math.random() * 5);
    minaY = (int)(Math.random() * 4);
    tablero[minaX][minaY] = 1;

    int tesoroX;
    int tesoroY;
    
    tesoroX = (int)(Math.random() * 5);
    tesoroY = (int)(Math.random() * 4);
    tablero[tesoroX][tesoroY] = 2;

    // Se coloca el tablero 

    int coordenadaX;
    int coordenadaY;

    for (coordenadaX = 3; coordenadaX >= 0; coordenadaX-- ){
      System.out.print(coordenadaX + "|");
      for (coordenadaY = 0; coordenadaY < 5; coordenadaY++){
        if (tablero[x][y] == 3){
          System.out.print("X");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    System.out.println("  ----------");
    System.out.println("  0 1 2 3 4 ");


  }
}