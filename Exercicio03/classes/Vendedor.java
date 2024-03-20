package Exercicio03.classes;
import Exercicio03.Prompt;

public class Vendedor {
    public String nome;
    public double salarioFixo;
    public double vendas;
    public double salarioTotal;

    public Vendedor(String nome, double salarioFixo, double vendas) {
        this.nome = nome;
        this.salarioFixo = salarioFixo;
        this.vendas = vendas;

        salarioTotal = this.salarioFixo + (this.vendas * 0.15);
    }

}
