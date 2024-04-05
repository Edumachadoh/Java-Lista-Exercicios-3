package Exercicio09;
import Exercicio09.classes.Numeros;
import Exercicio09.classes.Contador;
public class Programa {
    public static void executar() {
        
        int contador = Contador.cont();

        Numeros num1 = new Numeros(contador); 

        System.out.printf("Qtd de numeros entre 10 e 150: %d", num1.cont);


    }
}
