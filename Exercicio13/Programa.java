package Exercicio13;

import Exercicio13.classes.LeituraImpressao;
import Exercicio13.Prompt;
import Exercicio13.classes.Pessoa;

public class Programa {
    public static void executar() {
        int cont = Prompt.lerInteiro("Numero de pessoas: ");
        
        Pessoa pessoa1[] = new Pessoa[cont];

        for (int i = 0; i < cont; i ++) {
            String nome = LeituraImpressao.nome();
            char sexo = LeituraImpressao.sexo();
            int idade= LeituraImpressao.idade();
            char saude = LeituraImpressao.saude();
            pessoa1[i] = new Pessoa(nome, sexo, idade, saude);
        }

        for (int i = 0; i < cont; i ++) {
            System.out.printf("------------\n");
            System.out.printf("Nome: %s\n", pessoa1[i].nome);
            System.out.printf("Idade: %d\n", pessoa1[i].idade);
            System.out.printf("Sexo: %c\n", pessoa1[i].sexo);
            System.out.printf("Saude: %c\n", pessoa1[i].saude);
            System.out.printf("Aptidao: %s\n", pessoa1[i].aptidao);
        }

    }
}
