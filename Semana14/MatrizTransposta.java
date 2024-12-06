public class MatrizTransposta {
    public static void main(String[] args) {
        
        // matriz 2x3
        int [][] mat = {
            {1, 1, 1},
            {2, 2, 2}
        };

        int [][] transposta = new int[3][2];
    
        /*
        matriz transposta transforma linhas em colunas
        1   2
        1   2
        1   2
        */

        for (int i = 0; i < mat.length; i++) {          // mat.length => quantidade de linhas
            for (int j = 0; j < mat[i].length; j++) {   // mat[i] => é a linha  
                                                        // length => a quantidade de colunas desta linha
                System.out.print(mat[i][j] + "  ");
            }
            System.out.println();
        }

        // regra para criar a matriz transposta
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                transposta[j][i] = mat[i][j];
            }
        }

        // mostra a matriz transposta
        for (int i = 0; i < transposta.length; i++) {          // mat.length => quantidade de linhas
            for (int j = 0; j < transposta[i].length; j++) {   // mat[i] => é a linha  
                                                        // length => a quantidade de colunas desta linha
                System.out.print(transposta[i][j] + "  ");
            }
            System.out.println();
        }
        // UM VETOR DE X POSICOES POPULADO PELO USUARIO, ESCOLHE UM VALOR PARA REMOVER
        // E REMOVE TODAS AS OCORRENCIAS DESTE VALOR, CRIANDO UM VETOR NOVO
    }
}
