package Exercicio13.classes;

public class Pessoa {
    public String nome ;
    public char sexo ;
    public int idade;
    public char saude;
    public String aptidao;

    public Pessoa(String nome, char sexo, int idade, char saude){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;

        if ((this.idade >= 18) && (this.saude == 'S') && (this.sexo == 'M')) {
            this.aptidao = "Apto";
        } else  {
            this.aptidao = "Não apto";
        }
     }
}
