package Exercicio08.classes;

public class Aluno {
    public double nota1;
    public double nota2;
    public double nota3;
    public String nome;
    public double media;
    public String status;

    public Aluno( String nome, double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nome = nome;

        this.media = (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    public void calculoMedia() {
        if (this.media >= 7) {
            this.status = "Aprovado";
        } else if (this.media <= 5) {
            this.status = "Reprovado";
        } else {
            this.status = "Recuperação";
        }
    }
}
