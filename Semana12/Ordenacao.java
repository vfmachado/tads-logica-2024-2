import java.util.Random;

public class Ordenacao {
    public static void main(String[] args) {
        
        int [] vetor = new int[100000];
        Random aleatorio = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(100000);
        }

        long tinicial = System.currentTimeMillis();

        for (int i = 0; i < vetor.length; i++) {
            
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[i]) {

                    int troca = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = troca;

                    // for (int z = 0; z < vetor.length; z++) {
                    //     System.out.print(vetor[z] + "  ");
                    // }
                    // System.out.println();
                }
            }
        }

        long tfinal = System.currentTimeMillis();

        System.out.println("LEVOU " + (tfinal - tinicial));
    }
}
