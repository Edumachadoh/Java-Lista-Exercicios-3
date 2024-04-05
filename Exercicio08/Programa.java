package Exercicio08;
import Exercicio08.classes.Aluno;
public class Programa {
    public static void executar() {
        
        String nome = Prompt.lerLinha("Nome do aluno: ");
        double[] notas = new double[3];
        for (int i = 0; i < 3; i ++) {
            notas[i] = Prompt.lerDecimal("Nota:");
        }
       
        Aluno aluno1 = new Aluno(nome, notas[0], notas[1], notas[2]);
        aluno1.calculoMedia();

        System.out.printf("Nome: %s\n", aluno1.nome);
        System.out.printf("Status: %s", aluno1.status);
    }
}
