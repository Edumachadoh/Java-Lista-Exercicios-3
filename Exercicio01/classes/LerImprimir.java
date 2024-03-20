package Exercicio01.classes;

import Exercicio03.Prompt;

public class LerImprimir {
    public static double lerNota() {
        double nota = Prompt.lerDecimal("Ler nota: ");
        return nota;
    }

    public static String lerNome() {
        String nome = Prompt.lerLinha("Ler nome: ");
        return nome;
    }

    public static void imprimirNome(String mensagem) {
        System.out.println("Nome: " + mensagem);
    }
    public static void imprimirNota(double mensagem) {
        System.out.println("Nota: " + mensagem);
    }
}
