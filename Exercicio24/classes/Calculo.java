package Exercicio24.classes;

public class Calculo {
    public double n1;
    public double n2;
    public double n3;
    public double mediaP;

    public Calculo(double n1, double n2, double n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        
        this.mediaP = ((this.n1 * 2) + (this.n2 * 3) + (this.n3 * 5)) / 10; 
    }
}
