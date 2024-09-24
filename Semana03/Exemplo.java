import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        // CALCULA A MEDIA E MOSTRA SE O ALUNO FOI APROV OU RECUPERACAO
        // >= 7  APROV
        // <  7  RECUP

        float n1, n2, media;
        n1 = in.nextFloat();
        n2 = in.nextFloat();
        media = (n1 + n2)/2;

        System.out.println("MEDIA " + media);

        // OPERADORES RELACIONAIS
        // OPERADORES QUE RESULTAM EM TRUE / FALSE
        boolean resultado = media >= 7;
        /*  PARA TIPOS PRIMITIVOS
            >       é maior que?
            >=      é maior ou igual que?
            <       é menor que?
            <=      é menor ou igual que?
            ==      é igual que?
            !=      é diferente de?
        */

        System.out.println(resultado);
        // se (valor_logico) {}         // se => if
                                        // valor_logico => true/false
                                        // {} => bloco de codigo que vai ser 
                                        //       executado quando o valor logico for verdadeiro
        if (media >= 7) {
            System.out.println("APROV");
        }

        if (media < 7) {
            System.out.println("RECUP");
        }

       
    }
}