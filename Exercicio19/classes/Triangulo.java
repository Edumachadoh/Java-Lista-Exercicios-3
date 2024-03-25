package Exercicio19.classes;

public class Triangulo {
    public double l1;
    public double l2;
    public double l3;
    public String tipo;

    public Triangulo(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;

        if (((this.l1 == this.l2) && this.l3 != l1) || ((this.l1 == this.l3) && this.l2 != l1) 
        || ((this.l2 == this.l3) && this.l1 != l2)) {
            this.tipo = "Isóceles";
        } else if (l1 == l2 && l2 == l3) {
            this.tipo = "Equilatero";
        } else if (l1 != l2 && l2 != l3) {
            this.tipo = "Escaleno";
        }
    }
}
