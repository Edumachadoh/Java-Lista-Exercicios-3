package Exercicio09;
import Exercicio09.classes.Numeros;

public class Programa {
    public static void executar() {
        
        

        Numeros num1 = new Numeros(); 
        num1.setCont(num1.calcularCont());

        System.out.printf("Qtd de numeros entre 10 e 150: %d", num1.getCont());


    }
}
