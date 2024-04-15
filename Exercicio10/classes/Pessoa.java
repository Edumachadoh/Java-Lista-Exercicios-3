package Exercicio10.classes;

import Exercicio10.Prompt;

public class Pessoa {
    private String nome;
    private int idade;
    private String menorMaior;

     public Pessoa(int idade, String nome) {
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa() {
    }

    public Pessoa(int idade) {
        this.idade = idade;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }


    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String dizerMaiorMenor() {
        if (this.idade > 18) {
             return this.menorMaior = "Maior";
        } else {
            return this.menorMaior = "Menor";
        }
    }

    

}
