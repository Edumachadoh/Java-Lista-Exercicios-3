package Exercicio04.classes;

public class Dolar {
    public double real;
    public double cotacao;
    public double dolaresDisponiveis;

    public Dolar(double cotacao, double dolaresDisponiveis) {
        this.cotacao = cotacao;
        this.dolaresDisponiveis = dolaresDisponiveis;

        real = this.dolaresDisponiveis / this.cotacao;
        
    }

}
