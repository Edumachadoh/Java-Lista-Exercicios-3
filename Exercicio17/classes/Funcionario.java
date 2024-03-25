package Exercicio17.classes;

public class Funcionario {
    public String nome;
    public double salarioVelho;
    public double salarioMinimo;
    public double reajuste;
    public double salarioNovo;

    public Funcionario(String nome, double salario, double salarioMinimo, double reajuste) {
        this.nome = nome;
        this.salarioVelho = salario;
        this.salarioMinimo = salarioMinimo;
        this.reajuste = reajuste;

        this.salarioNovo = this.salarioVelho + (this.salarioVelho * (this.reajuste / 100));
    }
}
