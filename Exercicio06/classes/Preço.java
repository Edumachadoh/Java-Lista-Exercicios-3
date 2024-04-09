package Exercicio06.classes;

public class Preço {
    private double custo;
    private double valorReal;
    private double porc;

    public Preço(double custo, double porc) {
        this.custo = custo;
        this.porc = porc; 
    }
    public Preço() { 
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
    public void setPorc(double porc) {
        this.porc = porc;
    }
    public void calculo() {
        this.valorReal = this.custo + (this.custo * porc);
    }

    public double getCusto() {
        return this.custo;
    }
    public double getPorc() {
        return this.porc;
    }
    public double getValorReal() {
        return this.valorReal;
    }


}
