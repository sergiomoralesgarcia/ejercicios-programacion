public class PruebaValorYReferencia {
  public static void main(String[] arg) {

    // int x = 50;
    // suma5(x);
    // System.out.println("X del main: " + x);

    int[] n = {4, 7, 11, 22, 55, 60};
    suma5(n);
    System.out.println();
    System.out.print("n del main: " );
    for(int i : n){
      System.out.print(i + " ");
    }
    System.out.println();
  }

  //Se pasa la x como parámetro por valor
  public static void suma5(int x){
    x = x + 5;
    System.out.println("X desde suma5: " + x);
  } 

  public static void suma5(int[] n){

    for (int i = 0; i < n.length; i++) {
      n[i] += 5;
    }
    
    System.out.print("n desde suma5: " );
    for(int i : n){
      System.out.print(i + " ");
    }
    
  }
}