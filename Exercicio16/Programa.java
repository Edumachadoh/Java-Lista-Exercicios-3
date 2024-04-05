package Exercicio16;

import Exercicio16.Prompt;
import Exercicio16.classes.Funcionario;


public class Programa {
    public static void executar() {
        Funcionario grupo1[] = new Funcionario[3];

        for (int i = 0; i < 3; i ++) {
            System.out.printf("Funcionario %d\n", i);
            double salario = Prompt.lerDecimal("Salario: ");

            grupo1[i] = new Funcionario(salario);
        }


    }
}
