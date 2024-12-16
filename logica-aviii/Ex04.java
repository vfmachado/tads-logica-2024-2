import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int [] vetor = new int[0];
        int qtdPares = 0;
        int qtdImpares = 0;
        do {

            int [] novoVetor = new int[vetor.length + 1];
            for (int i = 0; i < vetor.length; i++) {
                novoVetor[i] = vetor[i];
            }

            System.out.println("Digite um valor: ");
            int valor = in.nextInt();

            if (valor % 2 == 0) {
                qtdPares++;
            } else {
                qtdImpares++;
            }

            novoVetor[novoVetor.length - 1] = valor;
            vetor = novoVetor;

            for (int i = 0; i < vetor.length; i++) {
                System.out.println(vetor[i]);
            }

            int [] pares = new int[qtdPares];
            int [] impares = new int[qtdImpares];

            int indicePares = 0;
            int indiceImpares = 0;

            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] % 2 == 0) {
                    pares[indicePares] = vetor[i];
                    indicePares++;
                } else {
                    impares[indiceImpares] = vetor[i];
                    indiceImpares++;
                }
            }

            // pares crescente
            for (int i = 0; i < pares.length; i++) {
                for (int j = i + 1; j < pares.length; j++) {
                    if (pares[i] > pares[j]) {
                        int temp = pares[i];
                        pares[i] = pares[j];
                        pares[j] = temp;
                    }
                }
            }


            // impares decrescente
            for (int i = 0; i < impares.length; i++) {
                for (int j = i + 1; j < impares.length; j++) {
                    if (impares[i] < impares[j]) {
                        int temp = impares[i];
                        impares[i] = impares[j];
                        impares[j] = temp;
                    }
                }
            }

            for (int i = 0; i < pares.length; i++) {
                System.out.print(pares[i] + "  ");
            }
            System.out.println();

            for (int i = 0; i < impares.length; i++) {
                System.out.print(impares[i] + "  ");
            }
            System.out.println();
            
            // System.out.println("Deseja continuar? (s/n)");
            // String continuar = in.next();
            // if (continuar.equals("n")) {
            //     break;
            // }

        } while (true);

    }
}
