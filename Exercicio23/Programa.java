package Exercicio23;

import Exercicio23.Prompt;
import Exercicio23.classes.Pessoa;



public class Programa {
    public static void executar() {
        String nome =Prompt.lerLinha("Nome: ");
        char sexo = Prompt.lerCaractere("Sexo [M / F]: ");
        double altura = Prompt.lerDecimal("Altura (m): ");
        int idade = Prompt.lerInteiro("Idade: ");

        Pessoa pablito = new Pessoa(nome, sexo, altura, idade);
        System.out.printf("Nome: %sf", pablito.nome);
        System.out.printf("Peso ideal: %.1f", pablito.pesoIdeal);
    }
}
