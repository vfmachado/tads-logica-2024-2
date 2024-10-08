import java.util.Scanner;


// FAÇA UM PROGRAMA QUE INDIQUE SE UM NÚMERO É PRIMO (2 DIVISORES, 1 E ELE MESMO)
public class Ex03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int divisor = 2;
        int numero = in.nextInt();
        int quantidade = 0;
        
        while (divisor <= numero/2 && quantidade == 0) {
            if (numero % divisor == 0) {
                quantidade++;
            }
            divisor++;
        }

        if (quantidade == 0) {
            System.out.println("eh primo");
        } else {
            System.out.println("NAO eh primo");
        }

    }
}