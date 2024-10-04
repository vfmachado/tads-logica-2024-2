import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        // FAÇA UM PROGRAMA QUE LEIA 10 NUMEROS INTEIROS E CONTE QUANTOS NUMEROS SAO PARES E QUANTOS SAO IMPARES;
        Scanner in = new Scanner(System.in);

        System.out.println("FUNCIONA!");
        int valor;

        int n = 0;
        int pares = 0, impares = 0;
        while ( n < 10) {
            System.out.println("DENTRO DO LAÇO " + n);
            
            valor = in.nextInt();
            
            if (valor % 2 == 0) {
                System.out.println("PAR");
                pares = pares + 1;
            } else {
                System.out.println("IMPAR");
                impares = impares +1;
            }
            
            n++;    // n = n + 1;
        }
        System.out.println("PARES " + pares);
        System.out.println("IMPARES " + impares);
    }
}