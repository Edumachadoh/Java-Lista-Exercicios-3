package Exercicio20;

import Exercicio20.Prompt;
import Exercicio20.classes.Professor;



public class Programa {
    public static void main(String[] args) {
        int nivel = Prompt.lerInteiro("Nivel do professor: ");
        int horas = Prompt.lerInteiro("Horas dadas de aula: ");

        Professor joao = new Professor(nivel, horas);
        System.out.printf("Salario: R$ %.2f", joao.salario);
    }
}
