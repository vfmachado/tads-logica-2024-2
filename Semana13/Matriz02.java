public class Matriz02 {
    public static void main(String[] args) {
        
        int [][] matriz;

        matriz = new int[4][];

        matriz[0] = new int[10];
        matriz[1] = new int[12];
        matriz[2] = new int[1];
        matriz[3] = new int[7];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print(matriz[linha][coluna] + "  ");
            }
            System.out.println();
        }
    }
}
