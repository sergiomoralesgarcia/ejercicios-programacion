package Ejer08_09;
/**
 * Implementa la clase Terminal. Un terminal tiene asociado un número. Los
 * terminales se pueden llamar unos a otros y el tiempo de conversación corre
 * para ambos. A continuación se proporciona el contenido del main y el resultado
 * que debe aparecer por pantalla.
 * 
 * @author Sergio Morales García.
 */
class Terminal {

  private String numero;
  private int tiempoDeConversacion; // tiempo de conversación en segundos

  Terminal(String numero) {
    this.numero = numero;
    this.tiempoDeConversacion = 0;
  }
  
  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public int getTiempoDeConversacion() {
    return tiempoDeConversacion;
  }

  public void setTiempoDeConversacion(int tiempoDeConversacion) {
  this.tiempoDeConversacion = tiempoDeConversacion;
  }

  @Override
  public String toString() {
    return "Nº " + numero + " - " + this.tiempoDeConversacion + "s de conversación ";
  }

  public void llama(Terminal t, int segundosDeLlamada) {
    this.tiempoDeConversacion += segundosDeLlamada;
    t.tiempoDeConversacion += segundosDeLlamada;
  }

  public static void main(String[] args) {
    Terminal t1 = new Terminal("678 11 22 33");
    Terminal t2 = new Terminal("644 74 44 69");
    Terminal t3 = new Terminal("622 32 89 09");
    Terminal t4 = new Terminal("664 73 98 18");
    System.out.println(t1);
    System.out.println(t2);
    t1.llama(t2, 320);
    t1.llama(t3, 200);
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);
    System.out.println(t4);
  }
}
