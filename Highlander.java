/* Arquivo Highlander.java */
public class Highlander {
  private Highlander() {}
  private static Highlander instancia;
  private  static int  ContagemChamadas = 0;
  public static Highlander obterInstancia() {
    if (instancia == null) {
      instancia = new Highlander();
    }
    ContagemChamadas += 1;
    return instancia;
  }
  public static int QuantChamadas(){
    return ContagemChamadas;
  }
}

