package Exercicio07.classes;

public class CarroCusto {
    private double custoFab;
    private double porcDist;
    private double impostos;
    private double precoFinal;
    
    public CarroCusto(double custoFab, double porcDist, double impostos) {
        this.custoFab = custoFab;
        this.porcDist = porcDist;
        this.impostos = impostos;
    }

    public double calcularPreçoFinal() {
        return this.precoFinal = this.custoFab + ((this.custoFab) * (this.porcDist * 0.01)) + ((this.custoFab + ((this.custoFab) * (this.porcDist * 0.01))) * (this.impostos * 0.01)); 
    }


    public double getCustoFab() {
        return custoFab;
    }
    public void setCustoFab(double custoFab) {
        this.custoFab = custoFab;
    }
    public double getPorcDist() {
        return porcDist;
    }
    public void setPorcDist(double porcDist) {
        this.porcDist = porcDist;
    }
    public double getImpostos() {
        return impostos;
    }
    public void setImpostos(double impostos) {
        this.impostos = impostos;
    }
    public double getPrecoFinal() {
        return precoFinal;
    }
    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }

    
    
}
