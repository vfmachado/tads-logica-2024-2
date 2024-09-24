import java.util.Scanner;

public class ExemploChar {
    public static void main(String[] args) {

        char tamanho;
        Scanner in = new Scanner(System.in);

        System.out.println("TAMANHO DE REFRIGERANTE DESEJADO");

        String texto = in.next();   // .next() => retorna uma String
        tamanho = in.next().charAt(0);    // .next pega o texto, e depois o .charAt(0) a primeira letra

        char selecionado;

        // comparar letras == 
        if (tamanho == 'P') {
            selecionado = 'P';
        } else if (tamanho == 'M') {
            selecionado = 'M';
        } else if (tamanho == 'G') {
            selecionado = 'G';
        }

        System.out.println("O TAMANHO SELECIONADO FOI " + selecionado);

    }
}