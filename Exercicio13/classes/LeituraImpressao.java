package Exercicio13.classes;

import Exercicio01.Prompt;

public class LeituraImpressao {
    public static String nome() {
        String nome = Prompt.lerLinha("Nome: ");
        return nome;
    }
    public static char sexo() {
        char sexo = Prompt.lerCaractere("Sexo [M/F]: ");
        return sexo;
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
