package Exercicio18.classes;

public class Funcionario {
    public String nome;
    public char sexo;
    public double salarioFixo;
    public int idade;
    public double salarioTotal;

    public Funcionario(String nome , int idade, char sexo, double salarioFixo) {
        this.nome = nome;
        this.sexo = sexo;
        this.salarioFixo = salarioFixo;
        this.idade = idade;

        if (this.sexo == 'M') {
            if (this.idade >= 30) {
                this.salarioTotal = this.salarioFixo + 100;
            } else if (this.idade < 30) {
                this.salarioTotal = this.salarioFixo + 50;
            }
        } else if (this.sexo == 'F') {
            if (this.idade >= 30) {
                this.salarioTotal = this.salarioFixo + 200;
            } else if (this.idade < 30) {
                this.salarioTotal = this.salarioFixo + 80;
            }
        }
    }
}
