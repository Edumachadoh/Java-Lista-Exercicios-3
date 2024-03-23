package Exercicio14;

import Exercicio14.classes.LeituraImpressao;
import Exercicio14.classes.Produto;
import Exercicio14.Prompt;


public class Programa {
    public static void main(String[] args) {
        
        Produto prod[] = new Produto[3]; 
        double mediaCusto = 0;
        double mediaVenda = 0;

        for (int i = 0; i < 3; i ++) {
            double precoCusto = LeituraImpressao.precoCusto();
            double precoVenda = LeituraImpressao.precoVenda();
            mediaCusto += precoCusto;
            mediaVenda += precoVenda;

            prod[i] = new Produto(precoCusto, precoVenda);
        }

        for (int i = 0; i < 3; i ++) {
            System.out.printf("----------------\n");
            System.out.printf("Resultado prod [%d]: R$%.2f\n", i+1,prod[i].saldo);
            

        }

        System.out.printf("Media custo: R$%.2f\n", mediaCusto);
            System.out.printf("Media venda: R$%.2f\n", mediaVenda);

    }
}
