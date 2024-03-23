package Exercicio10.classes;

import Exercicio10.Prompt;

public class Pessoa {
    public String nome;
    public int idade;
    public String menorMaior;

    

    public Pessoa(int idade, String nome) {
        this.nome = nome;
        this.idade = idade;

        if (this.idade > 18) {
            this.menorMaior = "Maior";
        } else {
            this.menorMaior = "Menor";
        }
    }


    public static String inserirNome() {
        String nome = Prompt.lerLinha("Digite seu nome: ");

        return nome;
    }

    public static int inserirIdade() {
        int idade = Prompt.lerInteiro("Digite sua idade: ");

        return idade;
    }

}
