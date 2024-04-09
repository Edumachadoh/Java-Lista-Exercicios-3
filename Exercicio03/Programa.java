package Exercicio03;
import Exercicio03.classes.LerImprimir;
import Exercicio03.classes.Vendedor;

public class Programa {
    public static void executar() {
        
        String nome = LerImprimir.lerNome();
        double salarioFixo = LerImprimir.lerSalarioFixo();
        double vendas = LerImprimir.lerVendas();
        
        
        
        Vendedor pessoa1 = new Vendedor(nome, salarioFixo, vendas);
        pessoa1.setNome("Joao");
        pessoa1.setSalarioFixo(2000);
        pessoa1.setVendas(300);

        LerImprimir.imprimirNome(pessoa1.getNome());
        LerImprimir.imprimirSalarioF(pessoa1.getSalarioTotal());
        LerImprimir.imprimirSalarioT(pessoa1.getSalarioTotal());


    }
}
