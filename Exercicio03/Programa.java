package Exercicio03;
import Exercicio03.classes.LerImprimir;
import Exercicio03.classes.Vendedor;

public class Programa {
    public static void executar() {
        
        String nome = LerImprimir.lerNome();
        double salarioFixo = LerImprimir.lerSalarioFixo();
        double vendas = LerImprimir.lerVendas();
        
        
        
        Vendedor Welington = new Vendedor(nome, salarioFixo, vendas);

        LerImprimir.imprimirNome(nome);
        LerImprimir.imprimirSalarioF(Welington.salarioFixo);
        LerImprimir.imprimirSalarioT(Welington.salarioTotal);


    }
}
