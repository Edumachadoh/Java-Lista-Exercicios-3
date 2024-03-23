package Exercicio14.classes;

import Exercicio01.Prompt;

public class LeituraImpressao {
    public static double precoCusto() {
        double precoCusto = Prompt.lerDecimal("Preço custo R$: ");
        return precoCusto;
    }
    public static double precoVenda() {
        double precoVenda = Prompt.lerDecimal("Preço venda R$: ");
        return precoVenda;
    }
    public static char saude() {
        char saude = Prompt.lerCaractere("Estado saúde bom [S / N]: ");
        return saude;
    }
    public static int idade() {
        int idade = Prompt.lerCaractere("Idade: ");
        return idade;
    }
}
