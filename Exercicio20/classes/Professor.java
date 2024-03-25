package Exercicio20.classes;

public class Professor {
    public int horas;
    public int nivel;
    public double salario;

    public Professor(int nivel, int horas) {
        this.nivel = nivel;
        this.horas = horas;

        if (this.nivel == 1) {
            this.salario = this.horas * 12;
        } else if (this.nivel == 2) {
            this.salario = this.horas * 17;
        } else if (this.nivel == 3) {
            this.salario = this.horas * 25;
        }
    }

}
