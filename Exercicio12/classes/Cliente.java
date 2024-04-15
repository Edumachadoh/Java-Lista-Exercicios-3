package Exercicio12.classes;

public class Cliente {
    private double valorDesc;
    private double totalValor;
    private int cont2000;

    public Cliente(double valor, double ano) {
        if (ano <= 2000) {
            this.valorDesc = (valor*0.12);
            this.totalValor = valor - this.valorDesc; 
        } else if (ano > 2000) {
            this.valorDesc = (valor*0.07);
            this.totalValor = valor - this.valorDesc;
        }
    }
    public int getcont2000() {
        return cont2000;
    }

    public void setcont2000(int cont2000) {
        this.cont2000 = cont2000;
    }
    

    public double getValorDesc() {
        return valorDesc;
    }

    public void setValorDesc(double valorDesc) {
        this.valorDesc = valorDesc;
    }

    public double getTotalValor() {
        return totalValor;
    }

    public void setTotalValor(double totalValor) {
        this.totalValor = totalValor;
    }

    


}
