public class Ex10 {
    public static void main(String[] args) {
        
        int tamanho = 10;
        char [][] mat = new char[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i == 0 || j == 0 || i == tamanho - 1 || j == tamanho - 1 || i == j || i == tamanho - j - 1) {
                    mat[i][j] = 'X';
                } else {
                    mat[i][j] = 'O';
                }
            }
        }

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
