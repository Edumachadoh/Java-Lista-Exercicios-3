package Exercicio12.classes;

import Exercicio01.Prompt;

public class LeituraImpressao {
    public static double valorCarro() {
        double valorCarro = Prompt.lerDecimal("Valor carro: ");
        return valorCarro;
    }
    public static int ano() {
        int ano = Prompt.lerInteiro("Ano: ");
        return ano;
    }
}
