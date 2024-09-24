import java.util.Random;
import java.util.Scanner;

public class Aleatorio {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random aleat = new Random();

        int sorteado = aleat.nextInt(10);   // sorteia valor int de 0 a 9
        // System.out.println("VALOR SORTEADO " + sorteado);

        int digitado = in.nextInt();

        if (sorteado == digitado) {
            System.out.println("DIA DE SORTE");
        } else {
        // if (sorteado != digitado) {
            System.out.println("ERROU ... era " + sorteado);
        }


    }
}