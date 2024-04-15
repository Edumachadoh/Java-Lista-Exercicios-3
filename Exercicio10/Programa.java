package Exercicio10;
import Exercicio10.classes.Pessoa;

public class Programa {
    public static void executar() {
        
        int cont = Prompt.lerInteiro("Qtd de pessoas para analisar:  ");
        int idade;
        String nome;

        Pessoa[] pessoa1 = new Pessoa[cont];
        
        for (int i = 0; i < cont; i ++) {
            pessoa1[i] = new Pessoa();
            idade = Prompt.lerInteiro("Idade:  ");
            nome = Prompt.lerLinha("Nome:  ");
            pessoa1[i].setNome(nome);
            pessoa1[i].setIdade(idade);
            System.out.println("---------------\n");
        }

        for(int i = 0; i < cont; i ++) {
            System.out.printf("Pessoa %d: %s\n", (i+1),pessoa1[i].dizerMaiorMenor());
        
        }

    }
}
