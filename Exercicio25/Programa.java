package Exercicio25;

import Exercicio25.Prompt;
import Exercicio25.classes.Estudante;



public class Programa {
    public static void executar() {
        double n1 = Prompt.lerDecimal("Nota laboratório: ");
        double n2 = Prompt.lerDecimal("Nota avaliação semestral: ");
        double n3 = Prompt.lerDecimal("Nota exame final: ");
        String nome = Prompt.lerLinha("Nome: ");
        String matricula = Prompt.lerLinha("Matricula: ");

        Estudante aluno1 = new Estudante(nome, matricula, n1, n2, n3);
        System.out.printf("Nome: %s\n", aluno1.nome);
        System.out.printf("Matricula: %s\n", aluno1.matricula);
        System.out.printf("Nota final: %.1f\n", aluno1.mediaP);
        System.out.printf("Classificação: %c", aluno1.classif);

    }
}
