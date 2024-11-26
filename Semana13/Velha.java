import java.util.Scanner;

public class Velha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char [][] jogo = new char[3][3];

        for (int linha = 0; linha < jogo.length; linha++) {
            for (int coluna = 0; coluna < jogo[linha].length; coluna++) {
                jogo[linha][coluna] = '-';
            }
        }

        char jogador = 'O';

        while (true) {
            System.out.println("informe a linha e coluna que deseja jogar");
            int lin = in.nextInt();
            int col = in.nextInt();

            jogo[lin][col] = jogador;

            for (int linha = 0; linha < 3; linha++) {
                for (int coluna = 0; coluna < 3; coluna++) {
                    System.out.print(jogo[linha][coluna] + "  ");
                }
                System.out.println();
            }

            // verificar as linhas do tabuleiro

            // primeira linha
            for (int linha = 0; linha < 3; linha++) {
                
                if (jogo[linha][0] != '-' && jogo[linha][0] == jogo[linha][1] && jogo[linha][0] == jogo[linha][2]) {
                    System.out.println("TEMOS UM GANHADOR ... ");
                }

            }

            // segunda linha
            // if (jogo[1][0] != '-' && jogo[1][0] == jogo[1][1] && jogo[1][0] == jogo[1][2]) {
            //     System.out.println("TEMOS UM GANHADOR ... ");
            // }

            // TODO - FAZER COLUNAS E DIAGONAIS

            if (jogador == 'O') {
                jogador = 'X';
            } else {
                jogador = 'O';
            }
        }

    }
}
