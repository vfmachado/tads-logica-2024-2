import java.util.Scanner;

public class Redimensionamento {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int [][] matriz;

        System.out.println("Informe a quantidade de linhas");
        int linhas = in.nextInt();

        matriz = new int[linhas][0];

        while (true) {

            for (int linha = 0; linha < matriz.length; linha++) {
                for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                    System.out.print(matriz[linha][coluna] + "  ");
                }
                System.out.println();
            }

            System.out.println("Informe o numero da linha e novo tamanho");
            int linha = in.nextInt();
            int tamanho = in.nextInt();

            // uma matriz é um vetor de vetores
            // um vetor, precisa de posicao
            // em cada posicao é instanciado um novo vetor
            matriz[linha] = new int[tamanho];

        }

    }

}
