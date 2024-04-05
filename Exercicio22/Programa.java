package Exercicio22;

import Exercicio22.Prompt;
import Exercicio22.classes.Consumo;



public class Programa {
    public static void executar() {
        int tipo = Prompt.lerInteiro("Tipo [1] Residência / [2] - Comércio / [3] - Industria: ");
        double consumo = Prompt.lerDecimal("Kw/h consumido: ");

        Consumo residencia1 = new Consumo(tipo, consumo);
        System.out.printf("Total a pagar: R$ %.2f", residencia1.totalPagar);
    }
}
