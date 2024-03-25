package Exercicio16.classes;

public class Funcionario {
    public double salario;
    public double reajuste;

    public Funcionario(double salario) {
        this.salario = salario;
        
        if (this.salario < 4200) {
            this.reajuste = this.salario + (this.salario * 0.50);
        } else if (this.salario > 4200 && this.salario < 14000) {
            this.reajuste = this.salario + (this.salario * 0.20);
        } else if (this.salario > 14000 && this.salario < 28000) {
            this.reajuste = this.salario + (this.salario * 0.15);
        } else {
            this.reajuste = this.salario + (this.salario * 0.10);
        }
    }
}
