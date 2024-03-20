package Exercicio01;
import Exercicio01.classes.Aluno;
import Exercicio01.classes.LerImprimir;

public class Programa {
    
   public static void main(String[] args) {

      double nota1 = LerImprimir.lerNota();
      double nota2 = LerImprimir.lerNota();
      double nota3 = LerImprimir.lerNota();
      String nome = LerImprimir.lerNome();

        Aluno aluno1 = new Aluno();
        aluno1.nome = nome;
        aluno1.nota1 = nota1;
        aluno1.nota2 = nota2;
        aluno1.nota3 = nota3;

      LerImprimir.imprimirNome(nome);
      LerImprimir.imprimirNota(nota1);
      LerImprimir.imprimirNota(nota2);
      LerImprimir.imprimirNota(nota3);
      
      

        
   }




}
