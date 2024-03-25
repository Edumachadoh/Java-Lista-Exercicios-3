package Exercicio15;

import Exercicio15.Prompt;
import Exercicio15.classes.Carro;


public class Programa {
    public static void main(String[] args) {
        int cont = 0;
        double valorTotal = 1;
        Carro cliente1[] = new Carro[100];
        
        while (valorTotal != 0) {
            valorTotal = Prompt.lerDecimal("Valor do veiculo R$: ");
            if (valorTotal == 0) {
                break;
            }
            int comb = Prompt.lerInteiro("Tipo combustivel [1 - alcool, 2 - gasolina, 3 - diesel]:");
            cliente1[cont] = new Carro(valorTotal, comb);
            System.out.printf("Valor desconto: R$ %.2f\n", cliente1[cont].valorDesconto);
            System.out.printf("Valor total com desconto: R$ %.2f\n", cliente1[cont].valorTotalComDesconto);
            System.out.printf("Valor total total: R$ %.2f\n", cliente1[cont].valorTotal);
            System.out.printf("----------------\n-" );
            cont ++;
        }

       

        double somaDescontos = 0;
        double somaPago = 0;
        for (int i = 0; i < cont; i ++) {
            somaDescontos += cliente1[i].valorDesconto;
            somaPago += cliente1[i].valorTotalComDesconto;
        }

        System.out.printf("\n----------------\n" );
        System.out.printf("VALOR total pago: R$ %.2f\n", somaPago);
        System.out.printf("VALOR total descontos: R$ %.2f\n", somaDescontos);
       

    }
}
