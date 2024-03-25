package Exercicio18;

import Exercicio18.Prompt;
import Exercicio18.classes.Funcionario;


public class Programa {
    public static void main(String[] args) {

        String nome = Prompt.lerLinha("Nome: ");
        char sexo = Prompt.lerCaractere("Sexo [M / F]: ");
        double salarioFixo = Prompt.lerDecimal("Salario fixo R$: ");
        int idade = Prompt.lerInteiro("Idade: ");



       Funcionario func1 = new Funcionario(nome, idade, sexo, salarioFixo);
        System.out.printf("Nome: %s\n", func1.nome);
        System.out.printf("Salario total (com abono): R$ %.2f", func1.salarioTotal);


    }
}
