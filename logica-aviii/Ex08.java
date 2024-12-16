
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        int linhas = 10;
        int colunas = 5;

        int[][] matriz = new int[linhas][colunas];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = in.nextInt();
            }
        }

        int [] maiores = new int[linhas];
        for (int i = 0; i < linhas; i++) {
            int maior = matriz[i][0];
            for (int j = 1; j < colunas; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
            maiores[i] = maior;
        }

        for (int i = 0; i < linhas; i++) {
            System.out.println(maiores[i]);
        }
    }
}
