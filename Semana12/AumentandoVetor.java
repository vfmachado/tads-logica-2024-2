import java.util.Scanner;

public class AumentandoVetor {
    
    public static void main(String[] args) {
        

        Scanner in = new Scanner(System.in);
        int [] vetor = new int[5]; 

        while (true) {

            System.out.println("0. VISUALIZAR VETOR");
            System.out.println("1. POPULAR VETOR");
            System.out.println("2. REDIMENSIONAR VETOR");
            System.out.println("3. SAIR");

            int opcao = in.nextInt();

            switch (opcao) {
                case 0:
                    for (int i = 0; i < vetor.length; i++) {
                        System.out.print(vetor[i] + "  ");
                    }
                    System.out.println();
                    break;
                case 1: 
                    for (int i = 0; i < vetor.length; i++) {
                        System.out.print("Informe o valor para a posicao " + i + ": ");
                        vetor[i] = in.nextInt();
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Informe o novo tamanho");
                    int tamanho = in.nextInt();
                    int [] memoria = vetor;
                    vetor = new int[tamanho];
                    
                    for (int i = 0; i < memoria.length && i < vetor.length; i++) {
                        vetor[i] = memoria[i];
                    }

                    break;
            }

            if (opcao == 3) break;

        }


    }
}
