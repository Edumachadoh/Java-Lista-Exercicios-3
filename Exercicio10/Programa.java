package Exercicio10;
import Exercicio10.classes.Pessoa;

public class Programa {
    public static void executar() {
        
        int cont = Prompt.lerInteiro("Qtd de pessoas para analisar:  ");
        int idade;
        String nome;

        Pessoa[] pessoa1 = new Pessoa[cont]; 
        
        for(int i = 0; i < cont; i ++) {
            System.out.println("Pessoa "+ i + "");
            idade = Prompt.lerInteiro("Idade: ");
            nome = Prompt.lerLinha("Nome: ");
            
            pessoa1[i] = new Pessoa(idade, nome);
        }
        System.out.println("---------------");
        for(int i = 0; i < cont; i ++) {
            System.out.printf("%d - idade: %d\n", i + 1, pessoa1[i].idade);
            System.out.printf("%d - nome: %s\n", i + 1, pessoa1[i].nome);
        }



    }
}
