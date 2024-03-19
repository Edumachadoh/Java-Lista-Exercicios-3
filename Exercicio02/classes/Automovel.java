package Exercicio02.classes;
import Exercicio02.Prompt;

public class Automovel {
    public double distancia;
    public double combGasto;

    public double consMedio = 10; 

    public void imprimir() {
        consMedio = distancia / combGasto;
        System.out.printf("Consumo medio %.1f", consMedio);
    }
}
