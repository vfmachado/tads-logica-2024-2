public class Ex07 {
    public static void main(String[] args) {
        
        int [][] m = {
            { 1, 2, 3, 4 },
            { 4, 5, 6, 7 },
            { 7, 8, 9, 10 },
            { 10, 11, 12, 13 }
        };

        //somas
        // a. na linha 2 da matriz.
        int somaLinha2 = 0;
        for (int i = 0; i < 4; i++) {
            somaLinha2 += m[1][i];
        }
        System.out.println("Soma da linha 2: " + somaLinha2);

        // b. na coluna 1 da matriz.
        int somaColuna1 = 0;
        for (int i = 0; i < 4; i++) {
            somaColuna1 += m[i][0];
        }
        System.out.println("Soma da coluna 1: " + somaColuna1);

        // c. na diagonal principal da matriz.
        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < 4; i++) {
            somaDiagonalPrincipal += m[i][i];
        }
        System.out.println("Soma da diagonal principal: " + somaDiagonalPrincipal);

        // d. em toda matriz
        int somaMatriz = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                somaMatriz += m[i][j];
            }
        }
        System.out.println("Soma da matriz: " + somaMatriz);

    }
}
