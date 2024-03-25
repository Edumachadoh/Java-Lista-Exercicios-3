package Exercicio15.classes;

public class Carro {
    public double valorTotal;
    public double valorTotalComDesconto;
    public double valorDesconto;
    public int comb;

    public Carro(double valorTotal, int comb) {
        this.valorTotal = valorTotal;
        this.comb = comb;

        if (this.comb == 1) {
            this.valorDesconto = this.valorTotal * 0.25;
            this.valorTotalComDesconto = this.valorTotal - this.valorDesconto;
        } else if (this.comb == 2) {
            this.valorDesconto = this.valorTotal * 0.21;
            this.valorTotalComDesconto = this.valorTotal - this.valorDesconto;
        } else if (this.comb == 3) {
            this.valorDesconto = this.valorTotal * 0.14;
            this.valorTotalComDesconto = this.valorTotal - this.valorDesconto;
        }
    }
}
