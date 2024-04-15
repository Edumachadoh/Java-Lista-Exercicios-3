package Exercicio09.classes;
import Exercicio09.Prompt;

public class Numeros {
    private int contador;

    public Numeros(int cont) {
        this.contador = cont;
    }

    public Numeros() {
    }

    public int calcularCont() {
        int cont = 0;
         for (int i = 0; i < 80; i ++ ) {
             double num = Prompt.lerDecimal("Digite um numero: ");
             if (num >= 10 && num <= 150) {
                 cont ++;
             }
         }

         return cont;
    }

    public int getCont() {
        return contador;
    }

    public void setCont(int cont) {
        this.contador = cont;
    }
}
