package Exercicio19;

import Exercicio19.Prompt;
import Exercicio19.classes.Verificar;
import Exercicio19.classes.Triangulo;


public class Programa {
    public static void main(String[] args) {
        double l1 = Prompt.lerDecimal("Lado 1: ");
        double l2 = Prompt.lerDecimal("Lado 1: ");
        double l3 = Prompt.lerDecimal("Lado 1: ");
       
        boolean conf = Verificar.lados(l1, l2, l3);
        if (conf = true) {
            Triangulo tri1 = new Triangulo(l1, l2, l3);
            System.out.printf("Tipo do triângulo: %s", tri1.tipo);
        } else {
            System.out.printf("Não é possível formar triângulo");
        }
    }
}
