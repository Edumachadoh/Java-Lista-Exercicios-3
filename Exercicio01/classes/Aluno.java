package Exercicio01.classes;
import Exercicio01.Prompt;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public double media;

    public void lerValores() {
        nota1 = Prompt.lerDecimal("Nota 1: ");
        nota2 = Prompt.lerDecimal("Nota 2: ");
        nota3 = Prompt.lerDecimal("Nota 3: ");

        media = (nota1 + nota2 + nota3) / 3; 
    }

    public void imprimirValores() {
        Prompt.imprimir("Media: " + media);
    }

}
