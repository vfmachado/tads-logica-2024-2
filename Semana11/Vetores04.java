import java.util.Scanner;

public class Vetores04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // declarar e inicializar o vetor (com chaves {} ao inves de [])
        // int [] numeros = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int [] numeros = new int[20];

        // EM JAVA OS VETORES DE INTS JA SAO INICIALIZADOS COM ZERO
        // TEM LINGUAGNS QUE NAO, LOGO RECOMENDA-SE DEIXAR CLARA A INTENÇÃO
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 0;
        }

        while (true) {

            System.out.println("1. Mostrar vetor\n" +
            "2. Colocar um valor em uma posicao\n" +
            "3. SAIR"
            );

            int opcao = in.nextInt();

            if (opcao == 3) {
                break;  // encerra/finaliza/para/quebra/interrompe/mata o laço de repeticao
            }

            if (opcao == 1) {
                for (int i = 0; i < numeros.length; i++) {
                    System.out.print(numeros[i] + "  ");
                }
                System.out.println();
            }

            if (opcao == 2) {
                System.out.println("indique uma posicao e um valor");
                int posicao = in.nextInt();
                int valor = in.nextInt();

                numeros[posicao] = valor;

                
            }
        }
    }
}
