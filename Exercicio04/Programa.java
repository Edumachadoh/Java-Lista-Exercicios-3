package Exercicio04;
import Exercicio04.classes.Dolar;
public class Programa {
    public static void executar() {
        
        double dolar = Prompt.lerDecimal("Cotação do dolar: ");
        double valorDisp = Prompt.lerDecimal("Dolares disponiveis: ");


        Dolar cliente1 = new Dolar(dolar, valorDisp);
        
        Prompt.imprimir("Cotacao: U$D " + cliente1.cotacao);
        Prompt.imprimir("Convertido em reais: R$ " + cliente1.real);
        Prompt.imprimir("Valor disponivel: U$D " + cliente1.dolaresDisponiveis);
    }
}
