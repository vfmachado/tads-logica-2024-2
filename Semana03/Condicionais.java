import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // CONSTANTE DO SISTEMA
        // VARIAVEIS QUE NAO SÃO ALTERADAS, LOGO CONSTANTES
        // DECLARADAS EM LETRAS MAIUSCULAS E TEM COMO OBJETIVO FACILITAR A LEITURA DO CODIGO
        final String SENHA = "1234";

        System.out.println("Informe a senha");
        String digitado = in.next();

        // PARA COMPARAR STRINGS, UTILIZAMOS UM MÉTODO CHAMADOS EQUALS
        // STRING.EQUALS(OUTRA STRING)
        boolean saoIguais = SENHA.equals(digitado);
        // System.out.println("SAO IGUAIS: " + saoIguais);

        int quantidadevalorespositivos;
        int quantidadeValoresPositivos; // java camel case
        int quantidade_valores_positivos;

        // if (SENHA.equals(digitado)) {
        if (saoIguais) {
            System.out.println("VC ACERTOU A SENHA");
        }

        // NAO SAO IGUAIS
        // true/false  == false        // == => ambos tem que ser iguais 
        // if (saoIguais == false) {
        if (!saoIguais) {
            System.out.println("VC ERROU A SENHA");
        }

        /*
            true    ==    false
                  false 

            true    ==    true
                    true

            false    ==   false
                    true


            !      significa NÃO
                E NEGA O VALOR LÓGICO

                !TRUE   FALSE
                !FALSE  TRUE
        */

    }
}