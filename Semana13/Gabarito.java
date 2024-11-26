import java.util.Scanner;

public class Gabarito {
   
    public static void main(String[] args) {
    
        char [] gabarito = { 'A', 'B', 'A', 'D', 'C' };
        char [][] respostas = new char[3][5];

        Scanner in = new Scanner(System.in);
        
        for (int linha = 0; linha < respostas.length; linha++) {
            System.out.println("Informe as respostas do aluno " + (linha+1));
            for (int coluna = 0; coluna < respostas[linha].length; coluna++) {
                    // next pega a string, charAt pega uma posicao da string
                    // toUpperCase
                    // no nosso caso a primeira
                respostas[linha][coluna] = in.next().toUpperCase().charAt(0);
            }
        }


        for (int linha = 0; linha < respostas.length; linha++) {
            // para cada aluno
            float nota = 0;
            for (int coluna = 0; coluna < respostas[linha].length; coluna++) {
                System.out.print(respostas[linha][coluna] + "  ");
                if (gabarito[coluna] == respostas[linha][coluna]) {
                    nota = nota + 2;
                } else if (respostas[linha][coluna] != '-') {
                    nota = nota - 1;
                }
            }
            if (nota < 0) nota = 0;

            System.out.println("  => " + nota);
        }
    }


}
