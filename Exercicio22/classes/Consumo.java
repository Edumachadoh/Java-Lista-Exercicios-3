package Exercicio22.classes;

public class Consumo {
    public double consumo;
    public int tipo;
    public double totalPagar;

    public Consumo(int tipo, double consumo) {
        this.tipo = tipo;
        this.consumo = consumo;

        if (this.tipo == 1) {
            this.totalPagar = this.consumo * 0.6;
        } else if (this.tipo == 2) {
            this.totalPagar = this.consumo * 0.48;
        } else if (this.tipo == 3) {
            this.totalPagar = this.consumo * 1.29;
        }

    }
}
