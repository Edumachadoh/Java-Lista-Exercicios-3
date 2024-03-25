package Exercicio24;

import Exercicio24.Prompt;
import Exercicio24.classes.Calculo;



public class Programa {
    public static void main(String[] args) {
        double n1 = Prompt.lerDecimal("Nota laboratório: ");
        double n2 = Prompt.lerDecimal("Nota avaliação semestral: ");
        double n3 = Prompt.lerDecimal("Nota exame final: ");

        Calculo aluno1 = new Calculo(n1, n2, n3);
        System.out.printf("Media ponderada notas: %.1f", aluno1.mediaP);
    }
}
