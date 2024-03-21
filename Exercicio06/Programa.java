package Exercicio06;
import Exercicio06.classes.Preço;
public class Programa {
    public static void main(String[] args) {
        
        double custo = Prompt.lerDecimal("Preço de custo R$:");
        double porc = Prompt.lerDecimal("Porcentagem %:");

        Preço preco1 = new Preço(custo, porc);

        System.out.printf("Valor final do produto: R$ %.1f", preco1.valorReal);
     
    }
}
