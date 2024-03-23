package Exercicio11.classes;

import Exercicio01.Prompt;

public class LeituraNomeSexo {
    
    
    public static String nome() {
        String nome = Prompt.lerLinha("Nome: ");
        return nome;
    }
    public static char sexo() {
        char sexo = Prompt.lerCaractere("Sexo [M / F]: ");
        return sexo;
    }
}
