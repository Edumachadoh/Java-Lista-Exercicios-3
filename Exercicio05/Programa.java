package Exercicio05;
import Exercicio05.classes.Loja;
public class Programa {
    public static void executar() {
        
        double prest = Prompt.lerDecimal("Valor total prestação R$:");


        Loja produto1 = new Loja();
        produto1.setTotal(prest);
        produto1.calcPrestacao();

        System.out.printf("Valor de cada prestação: R$ %.2f", produto1.getPrestacao());
    }
}
