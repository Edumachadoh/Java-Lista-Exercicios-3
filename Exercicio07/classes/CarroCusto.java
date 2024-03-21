package Exercicio07.classes;

public class CarroCusto {
    public double custoFab;
    public double porcDist;
    public double impostos;
    public double precoFinal;

    public CarroCusto(double custoFab, double porcDist, double impostos) {
        this.custoFab = custoFab;
        this.porcDist = porcDist;
        this.impostos = impostos;

        this.precoFinal = this.custoFab + ((this.custoFab) * (this.porcDist * 0.01)) + ((this.custoFab) * (this.impostos * 0.01)); 
    }
}
