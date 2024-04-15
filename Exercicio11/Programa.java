package Exercicio11;
import Exercicio11.classes.Sexo;

public class Programa {
    public static void executar() {
        
        int M =  0;
        int H = 0;

        Sexo pessoa[] = new Sexo[5];

       for (int i = 0; i < 5; i ++) {
            String nome = Prompt.lerLinha("Nome: ");
            char sexo = Prompt.lerCaractere("Sexo[M / F]: ");
            pessoa[i] = new Sexo(nome, sexo);
        
            if (sexo == 'M') {
                H ++;
            } else if (sexo == 'F') {
                M ++;
            }
         }

         pessoa[0].setfemNum(H);
         pessoa[0].setmascNum(M);

         
         Prompt.imprimir("Total homens: " + pessoa[0].getmascNum());
        Prompt.imprimir("Total mulheres: " + pessoa[0].getfemNum());
         

}
}