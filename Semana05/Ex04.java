import java.util.Scanner;


// fatorial
// 5! = 5 * 4 * 3 * 2 * 1
public class Ex04 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int numero = in.nextInt();
        int fatorial = 1;
        // decrescendo
        while (numero >= 1) {
            System.out.println("NUM " + numero);
            fatorial = fatorial * numero;
            numero--;
        }
        System.out.println("FATORIAL " + fatorial);
    }
}