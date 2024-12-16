public class Ex09 {
    public static void main(String[] args) {
        
        int [][] mat = {
            { 1, 2, 3, 4, 5 },      // 15
            { 6, 7, 8, 9, 10},      // 40
            { 11, 12, 13, 14, 15},  // 65
            { 16, 17, 18, 19, 20},  // 90
            { 21, 22, 23, 24, 25}   // 115
        };

        int procura = 40;

        for (int i = 0; i < mat.length; i++) {
            int soma = 0;
            for (int j = 0; j < mat[i].length; j++) {
                soma += mat[i][j];
            }
            if (soma == procura) {
                System.out.println("Linha " + i + " tem a soma " + procura);
            }
        }
    }
}
