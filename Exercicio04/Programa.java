package Exercicio04;
import Exercicio04.classes.Dolar;
public class Programa {
    public static void executar() {
        
        double dolar = Prompt.lerDecimal("Cotação do dolar: ");
        double valorDisp = Prompt.lerDecimal("Dolares disponiveis: ");


        Dolar cliente1 = new Dolar(dolar, valorDisp);
        cliente1.setDolar(5.6);
        cliente1.setValorDisp(1000);
        cliente1.calculo();
        
        Prompt.imprimir("Cotacao: U$D " + cliente1.getCotacao());
        Prompt.imprimir("Convertido em reais: R$ " + cliente1.getReal());
        Prompt.imprimir("Valor disponivel: U$D " + cliente1.getDolaresDisp());
    }
}
