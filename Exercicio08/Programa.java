package Exercicio08;
import Exercicio08.classes.Aluno;
public class Programa {
    public static void executar() {
       
        Aluno aluno1 = new Aluno("Joao", 4, 3, 9);
        aluno1.setNome("Pedro");
        aluno1.setNota1(10);
        aluno1.setNota2(5);
        aluno1.setNota3(10);



        System.out.printf("Media: %.1f\n", aluno1.calcularMedia());
        System.out.printf("Nome: %s\n", aluno1.getNome());
        System.out.printf("Status: %s", aluno1.calcularStatus());
    }
}
