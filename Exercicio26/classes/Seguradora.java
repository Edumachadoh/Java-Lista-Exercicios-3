package Exercicio26.classes;

public class Seguradora {
    public String nome;
    public int idade;
    public char grupo;
    public int categoria;

    public Seguradora(int idade, String nome, char grupo) {
        this.idade = idade;
        this.nome = nome;
        this.grupo = grupo;

        if (this.idade >= 17 && this.idade <= 20) {
            
            if (this.grupo == 'B') {
                this.categoria = 1;
            } else if (this.grupo == 'M') {
                this.categoria = 2;
            } else if (this.grupo == 'A') {
                this.categoria = 3;
            }
        } else if (this.idade >= 21 && this.idade <= 24){
            
            if (this.grupo == 'B') {
                this.categoria = 2;
            } else if (this.grupo == 'M') {
                this.categoria = 3;
            } else if (this.grupo == 'A') {
                this.categoria = 4;
            }
        } else if (this.idade >= 25 && this.idade <= 34){
            
            if (this.grupo == 'B') {
                this.categoria = 3;
            } else if (this.grupo == 'M') {
                this.categoria = 4;
            } else if (this.grupo == 'A') {
                this.categoria = 5;
            }
        } else if (this.idade >= 35 && this.idade <= 64){
           
            if (this.grupo == 'B') {
                this.categoria = 4;
            } else if (this.grupo == 'M') {
                this.categoria = 5;
            } else if (this.grupo == 'A') {
                this.categoria = 6;
            }
        } else if (this.idade >= 65 && this.idade <= 70){
           
            if (this.grupo == 'B') {
                this.categoria = 7;
            } else if (this.grupo == 'M') {
                this.categoria = 8;
            } else if (this.grupo == 'A') {
                this.categoria = 9;
            }
        }
    }
}
