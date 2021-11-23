/**
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 * final aparecerá el número de suspensos, el número de suficientes, el número
 * de bienes, etc.
 *
 * @author Sergio Morales García
 */
public class Ejercicio011 {
  public static void main(String[] args) {

    System.out.println("Este programa muestra veinte líneas notas distintas. ");

    int nota;
    String tipoNota = "";
    int suspenso = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobre = 0;

    for (int i = 1; i <=20 ; i++) {
      nota = ((int) (Math.random() * 5));

      switch (nota) {
        case 0:
          tipoNota = "suspenso";
          suspenso++;
          break;
        case 1:
          tipoNota = "suficiente";
          suficiente++;
          break;
        case 2:
          tipoNota = "bien";
          bien++;
          break;
        case 3:
          tipoNota = "notable";
          notable++;
          break;
        case 4:
          tipoNota = "sobresaliente";
          sobre++;
          break;
        default:
        }
        System.out.print(tipoNota + "\n");
        

      }
    System.out.println("Han salido " + suspenso + " suspenso/s");
    System.out.println("Han salido " + suficiente + " suficiente/s");
    System.out.println("Han salido " + bien + " bien");
    System.out.println("Han salido " + notable + " notable/s");
    System.out.println("Han salido " + sobre + " sobresaliente/s");
    System.out.println();
  }
}
