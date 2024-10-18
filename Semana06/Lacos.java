import java.util.Random;
import java.util.Scanner;

public class Lacos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random aleatorio = new Random();

        // ler numeros inteiros até que seja digitado o numero 5
        int numero = 0, tentativas =0;
        int sorteado = aleatorio.nextInt(100); // 0 a 99
        sorteado++; // 1 a 20
        while (numero != sorteado) {
            numero = in.nextInt();
            tentativas++;

            // caso nao seja o numero certo, informar ao usuario se o numero é maior ou menor
            if (numero < sorteado) {
                System.out.println("TENTE MAIOR");
            } else if (numero > sorteado) {
                System.out.println("TENTE MENOR");
            }
        }
        System.out.println("PRECISOU DE " + tentativas + " TENTATIVAS PARA ACERTAR");
        // SE A QUANTIDADE DE TENTATIVAS FOR IGUAL
        // 1  jogar na sena
        // > 1 e <=3  sortudo
        // < 5 eh, depende
        // > 5 nem tenta o tigrinho
    }

}
