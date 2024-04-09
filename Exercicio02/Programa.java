package Exercicio02;
import Exercicio02.classes.Automovel;
import Exercicio02.Prompt;
public class Programa {
   public static void executar() {



      Automovel ford = new Automovel();
      
      ford.setCombGasto(7);
      ford.setDistancia(200);
      Prompt.imprimir("Consumo medio: " + ford.getConsumoMedio());
      




   }
}
