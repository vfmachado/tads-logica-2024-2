import java.util.Scanner;

// FAÇA UM PROGRAMA QUE MOSTRE OS DIVISORES DE 1 A N DE UM NÚMERO ESCOLHIDO PELO USUARIO
public class Ex02 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int divisor = 1;
        int numero = in.nextInt();
        
        while (divisor <= numero) {
            if (numero % divisor == 0) {
                System.out.println(divisor);
            }
            divisor++;
        }

    }
}