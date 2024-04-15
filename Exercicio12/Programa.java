package Exercicio12;
import Exercicio12.classes.Cliente;
import Exercicio12.classes.LeituraImpressao;
import Exercicio12.Prompt;

public class Programa {
    public static void executar() {
        
        char res = ' ';
        int ano;
        double valor;
        int cont = 0;
        int cont2000 = 0;
        Cliente carro[] = new Cliente[100];

      do {
        
        res = Prompt.lerCaractere("Deseja comprar um carro: ");
        if (res == 'N') {
            break;
        }
        
        ano = LeituraImpressao.ano();
        if (ano <= 2000) {
            cont2000 ++;
        }

        valor = LeituraImpressao.valorCarro();
        carro[cont] = new Cliente(valor, ano);
        System.out.printf("Desconto: R$%.2f\n", carro[cont].getValorDesc());
        System.out.printf("Valor total: R$%.2f\n", carro[cont].getTotalValor());
        cont++;
      } while (res != 'N');

      carro[cont - 1].setcont2000(cont2000);
      System.out.printf("Carros com ano menor que 2000: %d", carro[cont - 1].getcont2000());

    }
}
