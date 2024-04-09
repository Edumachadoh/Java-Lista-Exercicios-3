package Exercicio05.classes;

public class Loja {
    private double prestação;
    private double total;
    


    public Loja(double total) {
        this.total = total;
    }
    public Loja() {
        
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void calcPrestacao() {
        this.prestação = this.total / 5;
    }
    
    public double getPrestacao() {
        return this.prestação;
    }
}
