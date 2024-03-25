package Exercicio25.classes;

public class Estudante {
    public double n1;
    public double n2;
    public double n3;
    public double mediaP;
    public String nome;
    public String matricula;
    public char classif;

    public Estudante(String nome, String matricula, double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.nome = nome;
        this.matricula = matricula;
        
        this.mediaP = ((this.n1 * 2) + (this.n2 * 3) + (this.n3 * 5)) / 10; 
        
        if (this.mediaP >= 8 && this.mediaP < 10) {
            this.classif = 'A';
        } else if (this.mediaP < 8 && this.mediaP >= 7) {
            this.classif = 'B';
        } else  if (this.mediaP >= 6 && this.mediaP < 7) {
            this.classif = 'C';
        } else if (this.mediaP < 6  && this.mediaP >= 5) {
            this.classif = 'D';
        } else if (this.mediaP >= 0 && this.mediaP < 5) {
            this.classif = 'R';
        }

    }
}

