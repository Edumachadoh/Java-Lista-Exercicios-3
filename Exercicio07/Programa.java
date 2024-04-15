package Exercicio07;
import Exercicio07.classes.CarroCusto;
public class Programa {
    public static void executar() {
        

        double custoFab = Prompt.lerDecimal("Custo de fábrica R$: ");


       CarroCusto carro1 = new CarroCusto(custoFab, 28, 45);
       
       carro1.setPorcDist(10);
       carro1.setPorcDist(5);
    
       System.out.printf("Preço total para o consumidor: R$ %.1f", carro1.calcularPreçoFinal());
    }
}
