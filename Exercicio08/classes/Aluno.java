package Exercicio08.classes;

public class Aluno {
    private double nota1;
    private double nota2;
    private double nota3;
    private String nome;
    private double media;
    private String status;

    public Aluno( String nome, double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double calcularMedia() {
        return this.media = (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    public String calcularStatus() {
        if (this.media >= 7) {
            this.status = "Aprovado";
        } else if (this.media <= 5) {
            this.status = "Reprovado";
        } else {
            this.status = "Recuperação";
        }

        return this.status;
    }
}
