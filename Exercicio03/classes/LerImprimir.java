package Exercicio03.classes;

import Exercicio03.Prompt;

public class LerImprimir {
    public static double lerSalarioFixo() {
        double nota = Prompt.lerDecimal("Salario fixo R$: ");
        return nota;
    }
    public static double lerVendas() {
        double nota = Prompt.lerDecimal("Vendas R$: ");
        return nota;
    }

    public static String lerNome() {
        String nome = Prompt.lerLinha("Nome: ");
        return nome;
    }

    public static void imprimirNome(String mensagem) {
        System.out.println("Nome: " + mensagem);
    }
    public static void imprimirSalarioF(double mensagem) {
        System.out.println("Salario Fixo: R$" + mensagem);
    }
    public static void imprimirSalarioT(double mensagem) {
        System.out.println("Salario Total: R$" + mensagem);
    }
}
