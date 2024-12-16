
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int [] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            int valor = in.nextInt();
            vetor[i] = valor;

            for (int j = 0; j < i; j++) {
                if (vetor[j] == valor) {
                    System.out.println("Valor repetido");
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(vetor[i]);
        }
    }
}