package Exercicio03.classes;
import Exercicio03.Prompt;

public class Vendedor {
    public String nome;
    public double salarioFixo;
    public double vendas;
    public double salarioTotal;

    public void lerValores() {
        nome = Prompt.lerLinha("Nome do vendedor: ");
        salarioFixo = Prompt.lerDecimal("Salario fixo: R$");
        vendas = Prompt.lerDecimal("Vendas: R$");
    }

    public void imprimirVendas() {
        salarioTotal = salarioFixo + (vendas * 0.15);
        Prompt.imprimir("Salario total: R$"+ salarioTotal);
    }
}
