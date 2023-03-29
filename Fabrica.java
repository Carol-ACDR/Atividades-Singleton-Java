/* Arquivo Fabrica.java */

import java.util.List;
import java.util.ArrayList;


public class Fabrica {
  Fabrica(int N){
    List<Highlander> listHigh = new ArrayList<>();
    while (N != 0){
      listHigh.add(Highlander.obterInstancia());
      N-=1;
    }
    System.out.println("Tentativas de Instanciamento de Highlander:"+ Highlander.QuantChamadas());
  }
}