package Exercicio12;
import Exercicio12.classes.Cliente;
import Exercicio12.classes.LeituraImpressao;
import Exercicio12.Prompt;

public class Programa {
    public static void main(String[] args) {
        
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
        valor = LeituraImpressao.valorCarro();
        
        ano = LeituraImpressao.ano();
        if (ano <= 2000) {
            cont2000 ++;
        }

        carro[cont] = new Cliente(valor, ano);
        System.out.printf("Desconto: R$%.2f\n", carro[cont].valorDesc);
        System.out.printf("Valor total: R$%.2f\n", carro[cont].totalValor);
        cont++;
      } while (res != 'N');

    }
}
