package Exercicio03.classes;
import Exercicio03.Prompt;

public class Vendedor {
    private String nome;
    private double salarioFixo;
    private double vendas;
    private double salarioTotal;

    public Vendedor(String nome, double salarioFixo, double vendas) {
        this.nome = nome;
        this.salarioFixo = salarioFixo;
        this.vendas = vendas;

        this.salarioTotal = this.salarioFixo + (this.vendas * 0.15);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public String getNome() {
        return this.nome;
    }
    public double getSalarioFixo() {
        return this.salarioFixo;
    }
    public double getSalarioTotal() {
        return this.salarioTotal;
    }

}
