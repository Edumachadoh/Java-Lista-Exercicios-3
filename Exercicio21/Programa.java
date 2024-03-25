package Exercicio21;

import Exercicio21.Prompt;
import Exercicio21.classes.Nadador;



public class Programa {
    public static void main(String[] args) {
       int idade = Prompt.lerInteiro("Idade do nadador: ");

       Nadador jeferson = new Nadador(idade);
       System.out.printf("Classificação: %s", jeferson.categoria);
    }
}
