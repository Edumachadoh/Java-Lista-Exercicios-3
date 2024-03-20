package Exercicio02.classes;
import Exercicio02.Prompt;

public class Automovel {

    
    public double distancia;
    public double combGasto;
    
    public double consMedia;

    public Automovel(double distancia, double combGasto) {
        this.distancia = distancia;
        this.combGasto = combGasto;

        consMedia = this.distancia / this.combGasto;
    }
   
    


}
