package Exercicio06;
import Exercicio06.classes.Preço;
public class Programa {
    public static void executar() {
        
        // double custo = Prompt.lerDecimal("Preço de custo R$:");
        // double porc = Prompt.lerDecimal("Porcentagem %:");

        Preço preco1 = new Preço();
        preco1.setCusto(1000);
        preco1.setPorc(5);
        preco1.calculo();

        System.out.printf("Preço de custo: R$ %.1f\n", preco1.getCusto());
        System.out.printf("Porcentagem: %.1f\n", preco1.getPorc());
        System.out.printf("Valor final do produto: R$ %.1f", preco1.getValorReal());
     
    }
}
