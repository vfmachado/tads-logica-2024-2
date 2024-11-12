import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int x = 1, y = 1, z = 1, soma;

        while (x != 0 && y != 0 && z != 0) {
        // do {
            soma = 0;   // nao posso esquecer de RESETAR a variavel soma
            x = in.nextInt();
            y = in.nextInt();
            z = in.nextInt();

            if (z != 0) {
                for (int i = x; i <= y; i = i + z) {
                    System.out.println(i);
                    soma = soma + i;
                }
                System.out.println("Soma " + soma);
            }
        }
        // } while (x != 0 && y != 0 && z != 0);
    }
}
