package Exercicio02.classes;
import Exercicio02.Prompt;

public class Automovel {

    
    private double distancia;
    private double combGasto;
    
    private double consMedia;

    public Automovel(double distancia, double combGasto) {
        this.distancia = distancia;
        this.combGasto = combGasto;
    }
    public Automovel() {
        
    }
   
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setCombGasto(double combGasto) {
        this.combGasto = combGasto;
    }
    
    public double getConsumoMedio(){
        this.consMedia = this.distancia / this.combGasto;
        return this.consMedia;
    }
}
