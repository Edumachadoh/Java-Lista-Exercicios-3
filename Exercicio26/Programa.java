package Exercicio26;

import Exercicio26.Prompt;
import Exercicio26.classes.Seguradora;



public class Programa {
    public static void main(String[] args) {
        int idade;

      do {
        idade = Prompt.lerInteiro("Idade: ");
        if (idade < 17 || idade > 70) {
            System.out.printf("não se enquadra em nenhuma das categorias ofertadas\n");
        }
      } while (idade < 17 || idade > 70);

      String nome = Prompt.lerLinha("Nome: ");
      char grupo = Prompt.lerCaractere("Grupo de risco [B] Baixo / [M] Médio / [A] Alto]: ");

     
      Seguradora pessoa1 = new Seguradora(idade, nome, grupo);
      System.out.printf("Categoria: %d", pessoa1.categoria);


    }
}
