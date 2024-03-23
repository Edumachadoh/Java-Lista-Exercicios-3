package Exercicio11;


import Exercicio11.classes.LeituraNomeSexo;
import Exercicio11.classes.Sexo;

public class Programa {
    public static void main(String[] args) {
        
        int totalM =  0;
        int totalH = 0;

        Sexo pessoa[] = new Sexo[5];

       for (int i = 0; i < 5; i ++) {
            String nome = LeituraNomeSexo.nome();
            char sexo = LeituraNomeSexo.sexo();
            
            if (sexo == 'M') {
                totalH ++;
            } else if (sexo == 'F') {
                totalM ++;
            }
            pessoa[i] = new Sexo(nome, sexo);
       }

       Prompt.imprimir("Total homens: " + totalH);
       Prompt.imprimir("Total mulheres: " + totalM);


    }
}
