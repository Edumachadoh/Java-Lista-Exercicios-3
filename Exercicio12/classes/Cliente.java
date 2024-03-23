package Exercicio12.classes;

public class Cliente {
    public double valorDesc;
    public double totalValor;

    public Cliente(double valor, double ano) {
        if (ano <= 2000) {
            this.valorDesc = (valor*0.12);
            this.totalValor = valor - this.valorDesc; 
        } else if (ano > 2000) {
            this.valorDesc = (valor*0.07);
            this.totalValor = valor - this.valorDesc;
        }
    }


}
