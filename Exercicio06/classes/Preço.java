package Exercicio06.classes;

public class Preço {
    public double custo;
    public double valorReal;
    public double porc;

    public Preço(double custo, double porc) {
        this.custo = custo;
        this.porc = porc;

        this.valorReal = this.custo + (this.custo * this.porc);
    }
}
