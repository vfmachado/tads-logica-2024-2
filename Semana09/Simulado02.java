import java.util.Scanner;

public class Simulado02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero;


        // do {
        //     numero = in.nextInt();

        // } while (numero != 0);

        numero = 1;
        // for ( ; numero != 0 ; ) {}
        int positivos = 0, negativos = 0;
        while (numero != 0) {
            numero = in.nextInt();
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
        }

        System.out.println("FORAM INPUTADOS " + positivos + " positivos e " + negativos + " negativos");
    }
}
