package Exercicio09.classes;
import Exercicio09.Prompt;

public class Contador {
    public static int cont() {
        int cont = 0;
         for (int i = 0; i < 10; i ++ ) {
             double num = Prompt.lerDecimal("Digite um numero: ");
             if (num >= 10 && num <= 150) {
                 cont ++;
             }
         }

         return cont;
    }

}
