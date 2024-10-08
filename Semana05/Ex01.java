// FAÇA UM PROGRAMA QUE LEIA 5 VALORES E INDIQUE QUAL FOI O MAIOR VALOR DIGITADO PELO USUARIO
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int atual, maior = Integer.MIN_VALUE;

        int cont = 0;
        while (cont < 5) {
            System.out.println("FUNCIONA " + cont);
            atual = in.nextInt();
            if (atual > maior) {
                maior = atual;
            }
            cont++; // cont = cont + 1;
        }
        System.out.println("O MAIOR VALOR FOI " + maior);
    }
}
