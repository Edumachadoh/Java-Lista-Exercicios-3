package Exercicio14.classes;

public class Produto {
    public double precoCusto;
    public double precoVenda;
    public double saldo;

    public Produto(double precoCusto, double precoVenda) {
        this.precoVenda = precoVenda;
        this.precoCusto = precoCusto;

        this.saldo = precoVenda - precoCusto;
    }

}
