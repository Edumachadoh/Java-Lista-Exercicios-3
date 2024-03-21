package Exercicio05;
import Exercicio05.classes.Loja;
public class Programa {
    public static void main(String[] args) {
        
        double prest = Prompt.lerDecimal("Valor total prestação R$:");


        Loja produto1 = new Loja(prest);

        System.out.printf("Valor de cada prestação: R$ %.2f", produto1.prestação);
    }
}
