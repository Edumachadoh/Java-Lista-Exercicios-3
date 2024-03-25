package Exercicio17;

import Exercicio17.Prompt;
import Exercicio17.classes.Funcionario;


public class Programa {
    public static void main(String[] args) {
        String nome = Prompt.lerLinha("Nome: ");
        double salario = Prompt.lerDecimal("Salario R$: "); 
        double salarioMinimo = Prompt.lerDecimal("Salario mínimo atual R$: "); 
        double reajuste = Prompt.lerDecimal("Reajuste %: "); 
         
        
        
        Funcionario func1 = new Funcionario(nome, salario, salarioMinimo, reajuste);
        System.out.printf("Salario novo: R$ %.2f", func1.salarioNovo);


    }
}
