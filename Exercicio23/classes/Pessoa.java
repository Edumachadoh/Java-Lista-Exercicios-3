package Exercicio23.classes;

public class Pessoa {
    public String nome;
    public int idade;
    public double altura;
    public char sexo;
    public double pesoIdeal;

    public Pessoa(String nome, char sexo, double altura, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.idade = idade;

        if (this.sexo == 'M') {
            if (this.altura > 1.70 && this.idade <= 20) {
                this.pesoIdeal = (72.7 * this.altura) - 58;
            } else if (this.altura > 1.70 && this.idade >= 21 && this.idade <= 39) {
                this.pesoIdeal = (72.7 * this.altura) - 53;
            } else  if (this.altura > 1.70 && this.idade >= 40) {
                this.pesoIdeal = (72.7 * this.altura) - 45;
            } else if (this.altura <= 1.70 && this.idade <= 40) {
                this.pesoIdeal = (72.7 * this.altura) - 50;
            } else if (this.altura <= 1.70 && this.idade > 40) {
                this.pesoIdeal = (72.7 * this.altura) - 58;
            }
        } else if (this.sexo == 'F') {
            if (this.altura >1.50) {
                this.pesoIdeal = (62.1 * this.altura) - 44.7;
            } else if (this.altura < 1.50) {
                if (this.idade >= 35) {
                    this.pesoIdeal = (62.1 * this.altura) - 45;
                } else if (this.idade < 35) {
                    this.pesoIdeal = (62.1 * this.altura) - 49;
                }
            }
        }
    }
}
