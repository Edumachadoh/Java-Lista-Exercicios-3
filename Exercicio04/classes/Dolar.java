package Exercicio04.classes;

public class Dolar {
    private double real;
    private double cotacao;
    private double dolaresDisponiveis;

    public Dolar(double cotacao, double dolaresDisponiveis) {
        this.cotacao = cotacao;
        this.dolaresDisponiveis = dolaresDisponiveis;
    }
    public Dolar() {
    }

    public void setDolar(double dolar) {
        this.cotacao = dolar;
    }
    public void setValorDisp(double valorDisp) {
        this.dolaresDisponiveis = valorDisp;
    }

    public void calculo() {
        this.real = this.cotacao * this.dolaresDisponiveis;
    }

    public double getReal () {
        return this.real;
    }
    public double getCotacao () {
        return this.cotacao;
    }
    public double getDolaresDisp () {
        return this.dolaresDisponiveis;
    }
    



}
