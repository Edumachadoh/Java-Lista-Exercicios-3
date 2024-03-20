package Exercicio01.classes;
import Exercicio01.Prompt;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public double media;

   public Aluno(double nota1, double nota2, double nota3, String nome) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
   }
}
