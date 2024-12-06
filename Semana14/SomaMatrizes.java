import java.util.Scanner;

public class SomaMatrizes {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int [][] matriz = {
            { 1, 2, 3, 4},     // 10
            { 5, 6, 7, 2},     // 20
            { 9, 2, 1, 4},     // 16
            { 5, 2, 1, 2},     // 10
        //   20 12 12 12  
        };

        /*
         *  LINHAS i
         *  COLUNAS j
         */

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }


        int soma;

        // SOMA DA PRIMEIRA LINHA
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("INICIANDO A SOMA DA LINHA " + i);
            soma = 0;
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("LINHA " + i  + " COLUNA " + j + " TEM " + matriz[i][j]);
                soma = soma + matriz[i][j]; 
            }
            System.out.println(soma);
        }
       

    }
}
